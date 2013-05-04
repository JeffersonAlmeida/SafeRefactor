package br.edu.ufcg.saferefactor.core;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.sr.ic.ImpactedClasses;
import org.sr.input.FilePropertiesObject;
import br.edu.ufcg.saferefactor.classloader.FileClassLoader;
import br.edu.ufcg.saferefactor.core.ast.SClass;
import br.edu.ufcg.saferefactor.core.ast.SConstructor;
import br.edu.ufcg.saferefactor.core.ast.SMethod;
import br.edu.ufcg.saferefactor.core.util.Constants;
import br.edu.ufcg.saferefactor.core.util.FileUtil;

public class Analyzer {

	private Map<String, SClass> targetClazzMapping;
	private Map<String, SClass> sourceClazzMapping;
	private List<SConstructor> commonConstructors;
	private List<SMethod> commonMethods;
	private FilePropertiesObject input;
	private ImpactedClasses impactedClasses;
	private List<String> nonDeterministicMethods;
	private int quantityOfMethodsToTest;
	private FileClassLoader srcProductClassLoader;
	private FileClassLoader targetProductClassLoader;

	public Analyzer() {
		this.commonConstructors = new ArrayList<SConstructor>();
		this.commonMethods = new ArrayList<SMethod>();
		this.listNonDeterministicMethods();
		URL urls1[] = {};
		URL urls2[] = {};
		this.srcProductClassLoader = new FileClassLoader(urls1);
		this.targetProductClassLoader = new FileClassLoader(urls2);
	}

	private void listNonDeterministicMethods() {
		this.nonDeterministicMethods = new ArrayList<String>();
		this.nonDeterministicMethods.add("NounTerm");
		this.nonDeterministicMethods.add("VerbTerm");
	}

	public List<SConstructor> getCommonConstructors() {
		return commonConstructors;
	}
	public void setCommonConstructors(List<SConstructor> commonConstructors) {
		this.commonConstructors = commonConstructors;
	}
	public List<SMethod> getCommonMethods() {
		return commonMethods;
	}
	public void setCommonMethods(List<SMethod> commonMethods) {
		this.commonMethods = commonMethods;
	}

	public File generateMethodListFile(Criteria criteria) throws MalformedURLException {
		boolean checkingCanProceed = analyzeChange(criteria);

		if (!checkingCanProceed) {
			return null;
		}

		StringBuffer lines = new StringBuffer();
		Set<String> listOfConstructors = new HashSet<String>();
		Set<String> listOfMethods = new HashSet<String>();

		int quantityOfMethodsToTest = 0;

		if (!this.impactedClasses.getModifiedClasses().isEmpty()) {
			List<String> classesParaTestar = new ArrayList<String>();
			classesParaTestar.addAll(this.impactedClasses.getModifiedClasses()); 

			// Adicione apenas construtores de classes modificadas. Devido a
			// limita��es do Randoop, adicione tamb�m classes utilizadas
			// nos par�metros dos construtores dessas classes.
			for (int i = 0; i < classesParaTestar.size(); i++) {
				String classeParaTestar = classesParaTestar.get(i);
				System.out.println("Classe para ser testada: " + classeParaTestar);
				for (SConstructor constructor : this.commonConstructors) {
					String constructorString = constructor.toString();

					if (constructorString.contains(classeParaTestar) && !this.listContainsString( this.nonDeterministicMethods, constructorString)) {
						lines.append(constructor + "\n");
						listOfConstructors.add(constructor.toString());

						List<String> classParameters = constructor
								.getParameters();

						for (String classParameter : classParameters) {
							if (!classesParaTestar.contains(classParameter)) {
								classesParaTestar.add(classParameter);
							}
						}

						quantityOfMethodsToTest = quantityOfMethodsToTest + 1;
					}

					lines.append(constructorString + "\n");
					listOfConstructors.add(constructorString);
				}
			}

			// Test only methods of modified classes.
			for (SMethod method : commonMethods) {
				String methodString = method.toString();
				if (this.listContainsString(this.impactedClasses.getModifiedClasses(),methodString)) {
					if (!this.listContainsString(this.nonDeterministicMethods, methodString)) {
						lines.append(method + "\n");
						listOfMethods.add(method.toString());
						quantityOfMethodsToTest = quantityOfMethodsToTest + 1;
					}
				}
			}
		} else {
			// Se a lista estiver vazia, teste todos os m�todos e construtores.
			for (SConstructor constructor : commonConstructors) {
				if (!this.listContainsString(this.nonDeterministicMethods,
						constructor.toString())) {
					lines.append(constructor + "\n");
					listOfConstructors.add(constructor.toString());
					quantityOfMethodsToTest = quantityOfMethodsToTest + 1;
				}
			}

			for (SMethod method : commonMethods) {
				if (!this.listContainsString(this.nonDeterministicMethods, method.toString())) {
					lines.append(method + "\n");
					listOfMethods.add(method.toString());
					quantityOfMethodsToTest = quantityOfMethodsToTest + 1;
				}
			}
		}

		System.out.println(lines.toString());

		this.setQuantityOfMethodsToTest(quantityOfMethodsToTest);
		
		String intersection = input.getSourceLineDirectory() + "methods-to-test-list" + "/methods-list.txt";
		return FileUtil.makeFile(intersection, lines.toString() );
		
	}

	private boolean listContainsString(List<String> listClasses, String contrString) {
		boolean result = false;
		for (int i = 0; i < listClasses.size() && !result; i++) {
			result = contrString.contains(listClasses.get(i));
		}
		return result;
	}

	private List<String> listClasses(FileClassLoader classLoader, String productDirectory)throws MalformedURLException{
		String srcClassesDirectory = productDirectory + "src";
		classLoader.addJarFiles(productDirectory + "lib");
		classLoader.addClass(new File(new File(productDirectory), "bin"));
		return FileUtil.listClassNames(srcClassesDirectory, "");
	}
	
	private List<SConstructor> getConstructorsList(Class<?> c){
		Constructor<?>[] constructors = c.getConstructors();
		List<SConstructor> sconsList = new ArrayList<SConstructor>(constructors.length);
		if (!Modifier.isAbstract(c.getModifiers()))  // do not consider constructors of abstract classes
			for (Constructor<?> constructor : constructors) {
				SConstructor scons = new SConstructor();
				scons.setDeclaringClass(constructor.getDeclaringClass().getName());
				scons.setName(constructor.getName());
				Class<?>[] parameterTypes = constructor.getParameterTypes();
				List<String> parameters = new ArrayList<String>(parameterTypes.length);
				for (Class<?> param : parameterTypes) {
					parameters.add(param.getName());
				}
				scons.setParameters(parameters);
				sconsList.add(scons);
			}
		return sconsList;
	}
	
	private List<SMethod> getMethodsList(Class<?> javaClazz){
		Method[] methods = javaClazz.getMethods();
		List<SMethod> smList = new ArrayList<SMethod>(methods.length);
		for (Method method : methods) {
			if (method.getDeclaringClass().getName().equals("java.lang.Object"))
				continue;
			if (method.getDeclaringClass().getName().equals("java.util.ArrayList")) /* do not consider ArrayList methods due to randoop problems with generics */
				continue;
			boolean hasGenericParam = false;
			Type[] genericParameterTypes = method.getGenericParameterTypes();
			for (Type type : genericParameterTypes) {
				if (type instanceof ParameterizedType) {
					hasGenericParam = true;
					break;
				}
			}
			if (hasGenericParam)
				continue;
			SMethod sm = new SMethod();
			sm.setDeclaringClass(method.getDeclaringClass().getName());
			sm.setSimpleName(method.getName());
			Class<?>[] parameterTypes = method.getParameterTypes();
			List<String> parameters = new ArrayList<String>(parameterTypes.length);
			for (Class<?> param : parameterTypes) {
				parameters.add(param.getName());
			}
			sm.setParameterList(parameters);
			smList.add(sm);
		}
		return smList;
	}
	
	private Map<String, SClass> mapClasses(FileClassLoader classLoader, String productDirectory) throws MalformedURLException {
		Map<String, SClass> srcClazzMapping = new HashMap<String, SClass>();
		 List<String> classes = listClasses(classLoader,productDirectory);
		for (String className : classes) {
			try {
				if (className.contains("src.")) {
					className = className.split("src.")[1];
				}
				Class<?> javaClazz = classLoader.loadClass(className);
				if (javaClazz.isInterface()) // Do not consider java Interface
					continue;
				if (!Modifier.isPublic(javaClazz.getModifiers())) // Do not consider non-public-classes 
					continue;
				SClass clazzAbstraction = new SClass(); // It represents a java class - Constructors - Methods - etc .
				clazzAbstraction.setFullName(javaClazz.getName());
				clazzAbstraction.setParent(javaClazz.getSuperclass().getName());
				clazzAbstraction.setConstructors(this.getConstructorsList(javaClazz));
				clazzAbstraction.setMethods(this.getMethodsList(javaClazz));
				srcClazzMapping.put(clazzAbstraction.getFullName(), clazzAbstraction);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (ExceptionInInitializerError e) {
				e.printStackTrace();
			} catch (NoClassDefFoundError e) {
				e.printStackTrace();
			} catch (VerifyError e) {
				e.printStackTrace();
			}
		}
		return srcClazzMapping;
	}

	public boolean analyzeChange(Criteria criteria) throws MalformedURLException {
		this.sourceClazzMapping =  this.mapClasses(this.srcProductClassLoader,this.input.getSourceLineDirectory());
		this.targetClazzMapping = this.mapClasses(this.targetProductClassLoader, this.input.getTargetLineDirectory());
		for (SClass sourceClazz : this.sourceClazzMapping.values()) {
			if (targetClazzMapping.values().contains(sourceClazz)) {
				SClass targetClass = targetClazzMapping.get(sourceClazz.getFullName()); // Correspondent Target Class
				findCommonConstructors(sourceClazz, targetClass);
				findCommonMethods(sourceClazz, targetClass);
			}else {
				System.out.println("\nClazz " + sourceClazz	+ " has been not found in target product\n");
				return false;
			}
		}
		return true;
	}

	private void findCommonMethods(SClass sourceClazz, SClass targetClass) {
		for(SMethod method : targetClass.getMethods()){
			if(sourceClazz.getMethods().contains(method)){
				addCommonMethod(sourceClazz, method);
			}else{
				/* Verifica se o method existe na hierarquia */
				for (int j = 0; j < targetClass.getMethods().size(); j++) {
					SMethod targetMethod = targetClass.getMethods().get(j);
					/* existem um method na classe, porem eles estao definidos em classes diferentes */
					if (targetMethod.getSimpleName().equals(method.getSimpleName())&& method.getParameterList().equals(targetMethod.getParameterList())) {
						SClass c1 = sourceClazzMapping.get(method.getDeclaringClass());
						SClass c2 = sourceClazzMapping.get(targetMethod.getDeclaringClass());
						SClass c3 = targetClazzMapping.get(method.getDeclaringClass());
						SClass c4 = targetClazzMapping.get(targetMethod.getDeclaringClass());
						if (isSuperClass(c1, c2, sourceClazzMapping) && isSuperClass(c3, c4, targetClazzMapping)) {
							if (commonMethods.contains(method)) {
								int indexOf = commonMethods.indexOf(method);
								commonMethods.get(indexOf).getAllowedClasses().add(method.getDeclaringClass());
							} else {
								method.getAllowedClasses().add(method.getDeclaringClass());
								commonMethods.add(method);
							}
						}else if (isSuperClass(c2, c1, sourceClazzMapping) && isSuperClass(c4, c3, targetClazzMapping)) {
							method.getAllowedClasses().add(targetMethod.getDeclaringClass());
							if (commonMethods.contains(method)) {
								int indexOf = commonMethods.indexOf(method);
								commonMethods.get(indexOf).getAllowedClasses().add(targetMethod.getDeclaringClass());
							} else {
								method.getAllowedClasses().add(targetMethod.getDeclaringClass());
								commonMethods.add(method);
							}
						}
				    }
		        }
            }
		}
	}
			
			
	private void addCommonMethod(SClass sourceClazz, SMethod method) {
		if (commonMethods.contains(method)) {
			int indexOf = commonMethods.indexOf(method);
			commonMethods.get(indexOf).getAllowedClasses().add(sourceClazz.getFullName());
		} else {
			method.getAllowedClasses().add(sourceClazz.getFullName());
			commonMethods.add(method);
		}
	}

	private void findCommonConstructors(SClass sourceClazz, SClass targetClass) {
		for (SConstructor constructor : sourceClazz.getConstructors()) {
			if (targetClass.getConstructors().contains(constructor)) {
				commonConstructors.add(constructor);
			}
		}
	}

	/**
	 *  checar se uma classe subclasse da outra.
	 */
	private boolean isSuperClass(SClass c1, SClass c2, Map<String, SClass> classes) {
		if (c1 == null || c2 == null)
			return false;
		if (c1.getParent().equals("java.lang.Object"))
			return false;
		if (c1.getParent().equals(c2.getFullName()))
			return true;
		else {
			SClass c3 = classes.get(c1.getParent());
			return isSuperClass(c3, c2, classes);
		}
	}

	public FilePropertiesObject getInput() {
		return input;
	}
	public void setInput(FilePropertiesObject input) {
		this.input = input;
	}
	public ImpactedClasses getImpactedClasses() {
		return impactedClasses;
	}
	public void setImpactedClasses(ImpactedClasses impactedClasses) {
		this.impactedClasses = impactedClasses;
	}
	public int getQuantityOfMethodsToTest() {
		return quantityOfMethodsToTest;
	}
	public void setQuantityOfMethodsToTest(int quantityOfMethodsToTest) {
		this.quantityOfMethodsToTest = quantityOfMethodsToTest;
	}
}
