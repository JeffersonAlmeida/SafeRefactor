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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import br.edu.ufcg.saferefactor.classloader.FileClassLoader;
import br.edu.ufcg.saferefactor.core.ast.SClass;
import br.edu.ufcg.saferefactor.core.ast.SConstructor;
import br.edu.ufcg.saferefactor.core.ast.SMethod;
import br.edu.ufcg.saferefactor.core.util.Constants;
import br.edu.ufcg.saferefactor.core.util.FileUtil;

public class Analyzer {

	private Map<String, SClass> targetClasses;
	private Map<String, SClass> sourceClasses;
	private List<SConstructor> commonConstructors;
	private List<SMethod> commonMethods;

	private ProjectInfo pinfo;

	private List<String> nonDeterministicMethods;

	public Analyzer(ProjectInfo pinfo) {
		this.commonConstructors = new ArrayList<SConstructor>();
		this.commonMethods = new ArrayList<SMethod>();
		this.pinfo = pinfo;

		this.listNonDeterministicMethods();
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

	public File generateMethodListFile(Criteria criteria) {
		boolean checkingCanProceed = analyzeChange(criteria);

		if (!checkingCanProceed) {
			return null;
		}

		StringBuffer lines = new StringBuffer();

		int quantityOfMethodsToTest = 0;

		if (!this.pinfo.getClasses().isEmpty()) {
			List<String> classesParaTestar = new ArrayList<String>();
			classesParaTestar.addAll(this.pinfo.getClasses());

			// Adicione apenas construtores de classes modificadas. Devido a
			// limita��es do Randoop, adicione tamb�m classes utilizadas
			// nos par�metros dos construtores dessas classes.
			for (int i = 0; i < classesParaTestar.size(); i++) {
				String classeParaTestar = classesParaTestar.get(i);

				for (SConstructor constructor : this.commonConstructors) {
					String constructorString = constructor.toString();

					if (constructorString.contains(classeParaTestar)
							&& !this.listContainsString(
									this.nonDeterministicMethods,
									constructorString)) {
						lines.append(constructor + "\n");

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
				}
			}

			// Test only methods of modified classes.
			for (SMethod method : commonMethods) {
				String methodString = method.toString();

				if (this.listContainsString(this.pinfo.getClasses(),
						methodString)) {
					if (!this.listContainsString(this.nonDeterministicMethods,
							methodString)) {
						lines.append(method + "\n");

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

					quantityOfMethodsToTest = quantityOfMethodsToTest + 1;
				}
			}

			for (SMethod method : commonMethods) {
				if (!this.listContainsString(this.nonDeterministicMethods,
						method.toString())) {
					lines.append(method + "\n");

					quantityOfMethodsToTest = quantityOfMethodsToTest + 1;
				}
			}
		}

		System.out.println(lines.toString());

		this.pinfo.setQuantityOfMethodsToTest(quantityOfMethodsToTest);

		return FileUtil
				.makeFile(Constants.ARQUIVO_INTERSECAO, lines.toString());
	}

	private boolean listContainsString(List<String> listClasses,
			String contrString) {
		boolean result = false;

		for (int i = 0; i < listClasses.size() && !result; i++) {
			result = contrString.contains(listClasses.get(i));
		}

		return result;
	}

	public List<Member> listCommonMethods() {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, SClass> mapSourceClasses() {
		Map<String, SClass> result = new HashMap<String, SClass>();
		try {
			result = mapClasses(this.pinfo.getSource());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public Map<String, SClass> mapTargetClasses() {
		Map<String, SClass> result = new HashMap<String, SClass>();
		// try {
		// result = mapClasses(this.pinfo.getTarget());
		// } catch (MalformedURLException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		try {
			// use buffering
			InputStream file = new FileInputStream(Constants.TEST
					+ Constants.FILE_SEPARATOR + "mapClasses2.ser");
			InputStream buffer = new BufferedInputStream(file);
			ObjectInput input = new ObjectInputStream(buffer);
			try {
				// deserialize the List
				result = (Map<String, SClass>) input.readObject();
				// display its data

			} finally {

				input.close();
			}
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return result;
	}

	private Map<String, SClass> mapClasses(String filesDir)
			throws MalformedURLException {
		Map<String, SClass> result = new HashMap<String, SClass>();

		File root = new File(filesDir);
		File bin = new File(root, this.pinfo.getBinDir());

		String binFiles = filesDir + Constants.FILE_SEPARATOR
				+ this.pinfo.getSrcDir();

		String libFiles = filesDir + Constants.FILE_SEPARATOR
				+ this.pinfo.getLib();

		URL urls[] = {};
		FileClassLoader cl = new FileClassLoader(urls);
		cl.addJarFiles(libFiles);
		cl.addClass(bin);
		List<String> listClassNames = FileUtil.listClassNames(binFiles, "");

		for (String className : listClassNames) {

			// TODO: hack for BerkeleyDB. Make it generic.
			if (className.equals("com.memorybudget.MemoryBudget"))
				continue;
			if (className.equals("com.sleepycat.je.log.LogManager"))
				continue;
			if (className.equals("com.sleepycat.je.log.SyncedLogManager"))
				continue;

			try {
				String sourceDot = "src.";

				if (className.contains(sourceDot)) {
					className = className.split(sourceDot)[1];
				}

				Class<?> c = cl.loadClass(className);

				// nao considera interface
				if (c.isInterface())
					continue;

				int modifiers = c.getModifiers();

				// nao considera classe nao publica
				if (!Modifier.isPublic(modifiers))
					continue;

				SClass sc = new SClass();
				sc.setFullName(c.getName());
				sc.setParent(c.getSuperclass().getName());

				Constructor<?>[] constructors = c.getConstructors();
				List<SConstructor> sconsList = new ArrayList<SConstructor>(
						constructors.length);

				// do not consider constructors of abstract classes
				if (!Modifier.isAbstract(modifiers))
					for (Constructor<?> constructor : constructors) {
						SConstructor scons = new SConstructor();
						scons.setDeclaringClass(constructor.getDeclaringClass()
								.getName());
						scons.setName(constructor.getName());

						Class<?>[] parameterTypes = constructor
								.getParameterTypes();
						List<String> parameters = new ArrayList<String>(
								parameterTypes.length);
						for (Class<?> param : parameterTypes) {
							parameters.add(param.getName());
						}
						scons.setParameters(parameters);
						sconsList.add(scons);
					}
				sc.setConstructors(sconsList);

				Method[] methods = c.getMethods();
				List<SMethod> smList = new ArrayList<SMethod>(methods.length);
				for (Method method : methods) {

					if (method.getDeclaringClass().getName().equals(
							"java.lang.Object"))
						continue;

					// HACK: do not consider ArrayList methods due to randoop
					// problems with generics
					if (method.getDeclaringClass().getName().equals(
							"java.util.ArrayList"))
						continue;

					boolean hasGenericParam = false;
					Type[] genericParameterTypes = method
							.getGenericParameterTypes();

					for (Type type : genericParameterTypes) {

						if (type instanceof ParameterizedType) {
							System.out.println(type);
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
					List<String> parameters = new ArrayList<String>(
							parameterTypes.length);
					for (Class<?> param : parameterTypes) {
						parameters.add(param.getName());
					}
					sm.setParameterList(parameters);
					smList.add(sm);

				}
				sc.setMethods(smList);
				result.put(sc.getFullName(), sc);

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

		return result;
	}

	public Map<String, SClass> mapClasses2(String filesDir) {
		Map<String, SClass> result = new HashMap<String, SClass>();

		String binFiles = filesDir + Constants.FILE_SEPARATOR
				+ this.pinfo.getSrcDir();

		List<String> listClassNames = FileUtil.listClassNames(binFiles, "");

		List<String> uncheckedClasses = new ArrayList<String>();

		for (String className : listClassNames) {

			// TODO: hack for BerkeleyDB. Make it generic.
			if (className.equals("com.memorybudget.MemoryBudget"))
				continue;
			if (className.equals("com.sleepycat.je.log.LogManager"))
				continue;
			if (className.equals("com.sleepycat.je.log.SyncedLogManager"))
				continue;

			// System.out.println("Class: " + className);
			try {
				String sourceDot = "src.";

				if (className.contains(sourceDot)) {
					className = className.split(Pattern.quote(sourceDot))[1];
				}

				Class<?> c = Class.forName(className);

				// nao considera interface
				if (c.isInterface())
					continue;

				// nao considera classe abstrata
				int modifiers = c.getModifiers();

				// nao considera classe nao publica
				if (!Modifier.isPublic(modifiers))
					continue;

				SClass sc = new SClass();
				sc.setFullName(c.getName());
				sc.setParent(c.getSuperclass().getName());

				Constructor<?>[] constructors = c.getConstructors();
				List<SConstructor> sconsList = new ArrayList<SConstructor>(
						constructors.length);

				if (!Modifier.isAbstract(modifiers))
					for (Constructor<?> constructor : constructors) {
						SConstructor scons = new SConstructor();
						scons.setDeclaringClass(constructor.getDeclaringClass()
								.getName());
						scons.setName(constructor.getName());

						Class<?>[] parameterTypes = constructor
								.getParameterTypes();
						List<String> parameters = new ArrayList<String>(
								parameterTypes.length);
						boolean addMethod = true;
						for (Class<?> param : parameterTypes) {

							if (param.getName().equals(
									"com.memorybudget.MemoryBudget"))
								addMethod = false;
							if (param.getName().equals(
									"com.sleepycat.je.log.LogManager"))
								addMethod = false;
							if (param.getName().equals(
									"com.sleepycat.je.log.SyncedLogManager"))
								addMethod = false;
							parameters.add(param.getName());
						}
						scons.setParameters(parameters);
						if (addMethod)
							sconsList.add(scons);
					}
				sc.setConstructors(sconsList);

				Method[] methods = c.getMethods();
				List<SMethod> smList = new ArrayList<SMethod>(methods.length);
				for (Method method : methods) {

					if (method.getDeclaringClass().getName().equals(
							"java.lang.Object"))
						continue;

					if (method.getDeclaringClass().getName().equals(
							"java.util.ArrayList"))
						continue;

					boolean hasGenericParam = false;
					Type[] genericParameterTypes = method
							.getGenericParameterTypes();

					for (Type type : genericParameterTypes) {

						if (type instanceof ParameterizedType) {
							System.out.println(type);
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
					List<String> parameters = new ArrayList<String>(
							parameterTypes.length);

					boolean addMethod = true;
					for (Class<?> param : parameterTypes) {

						// TODO: hack for BerkeleyDB. Make it generic.
						if (param.getName().equals(
								"com.memorybudget.MemoryBudget"))
							addMethod = false;
						if (param.getName().equals(
								"com.sleepycat.je.log.LogManager"))
							addMethod = false;
						if (param.getName().equals(
								"com.sleepycat.je.log.SyncedLogManager"))
							addMethod = false;

						parameters.add(param.getName());
					}
					sm.setParameterList(parameters);
					if (addMethod)
						smList.add(sm);

				}
				sc.setMethods(smList);
				result.put(sc.getFullName(), sc);

			} catch (ClassNotFoundException e) {
				uncheckedClasses.add(className);
				e.printStackTrace();
			} catch (ExceptionInInitializerError e) {
				uncheckedClasses.add(className);
				e.printStackTrace();
			} catch (NoClassDefFoundError e) {
				uncheckedClasses.add(className);
				e.printStackTrace();
			} catch (VerifyError e) {
				uncheckedClasses.add(className);
				e.printStackTrace();
			}
		}

		System.out
				.println("Classes that throw exception and will be not included in the tests: ");
		for (String classe : uncheckedClasses) {
			System.out.println(classe);
		}
		result = resultFilter(result, uncheckedClasses);

		return result;
	}

	private Map<String, SClass> resultFilter(Map<String, SClass> classes,
			List<String> uncheckedClasses) {

		System.out
				.println("Removing methods containing unsupported classses parameter");
		for (SClass classe : classes.values()) {
			List<SConstructor> constructors = classe.getConstructors();
			for (Iterator<SConstructor> i = constructors.iterator(); i
					.hasNext();) {
				SConstructor cons = i.next();
				List<String> parameters = cons.getParameters();
				for (String param : parameters) {
					if (uncheckedClasses.contains(param)) {
						System.out.println("Removing " + cons);
						i.remove();

						break;
					}

				}

			}

			List<SMethod> methods = classe.getMethods();
			for (Iterator<SMethod> i = methods.iterator(); i.hasNext();) {
				SMethod method = i.next();
				List<String> parameters = method.getParameterList();
				for (String param : parameters) {
					if (uncheckedClasses.contains(param)) {
						System.out.println("Removing " + method);
						i.remove();
						break;
					}
				}
			}
		}
		return classes;
	}

	public boolean analyzeChange(Criteria criteria) {
		boolean checkingCanProceed = true;

		this.sourceClasses = mapSourceClasses();
		this.targetClasses = mapTargetClasses();

		// analisa cada classe do source
		for (SClass sourceClass : this.sourceClasses.values()) {

			// se no target nao tiver essa classe, pula
			if (!targetClasses.values().contains(sourceClass)) {
				if (criteria == Criteria.ALL_METHODS_IN_SOURCE_AND_TARGET) {
					//Tem lixo vindo entre as classes do source.
					//Essa classe existe dos dois lados, mas nao eh encontrada pelo Safe.
					//Analisar bug do Safe.
					if (!sourceClass.toString().contains("PreferencesDialog")) {
						checkingCanProceed = false;

						System.out.println("\nClasse " + sourceClass
								+ " não foi encontrado. Classe" + sourceClass.toString().length());
						System.out.println("Classe " + sourceClass
								+ " não foi encontrado. Classe");
						System.out.println("Classe " + sourceClass
								+ " não foi encontrado. Classe");
						System.out.println("Classe " + sourceClass
								+ " não foi encontrado. Classe");
					}
				}

				continue;
			}

			// classe do target
			SClass targetClass = targetClasses.get(sourceClass.getFullName());
			// System.out.println("Target: " + sc);
			// System.out.println("Source: " + tc);

			for (SConstructor constructor : sourceClass.getConstructors()) {
				if (targetClass.getConstructors().contains(constructor)) {
					commonConstructors.add(constructor);
				}
			}

			if (checkingCanProceed) {
				if(criteria == Criteria.ALL_METHODS_IN_SOURCE_AND_TARGET){
					for(SMethod method : targetClass.getMethods()){
						if(!sourceClass.getMethods().contains(method)){
							checkingCanProceed = false;
						}
					}
				}
				
				
				for (SMethod method : sourceClass.getMethods()) {
					
					// se o source e o target contem o method com a mesma
					// assinatura, inclui
					if (!targetClass.getMethods().contains(method)) {
						// Se a classe transformada não tem mais o método, a
						// checagem não pode proceder. Mas esse resultado ainda
						// pode
						// ser revertido caso encontre o método em alguma classe
						// na hierarquia abaixo.
						if (criteria == Criteria.ALL_METHODS_IN_SOURCE_AND_TARGET) {
							//Essa classe existe dos dois lados, mas nao eh encontrada pelo Safe.
							//Analisar bug do Safe.
							if (!sourceClass.toString().contains("PreferencesDialog")) {
								checkingCanProceed = false;

								System.out.println("\nMetodo " + method
										+ " não foi encontrado. Método");
								System.out.println("Metodo " + method
										+ " não foi encontrado. Método");
								System.out.println("Metodo " + method
										+ " não foi encontrado. Método");
								System.out.println("Metodo " + method
										+ " não foi encontrado. Método");
							}
						}

						// senao, verifica se o method existe na hierarquia
						for (int j = 0; j < targetClass.getMethods().size(); j++) {
							SMethod targetMethod = targetClass.getMethods()
									.get(j);

							// existem um method na classe, porem eles estao
							// definidos em classes diferentes
							if (targetMethod.getSimpleName().equals(
									method.getSimpleName())
									&& method.getParameterList().equals(
											targetMethod.getParameterList())) {

								// Se achou metodo na hierarquia, deve ser
								// possível prosseguir com a checagem.
								checkingCanProceed = true;

								SClass c1 = sourceClasses.get(method
										.getDeclaringClass());
								SClass c2 = sourceClasses.get(targetMethod
										.getDeclaringClass());

								SClass c3 = targetClasses.get(method
										.getDeclaringClass());
								SClass c4 = targetClasses.get(targetMethod
										.getDeclaringClass());

								// a classe do target �� super da classe do
								// source
								// nas duas hierarquias
								// inclui a class do source no allowedclasses
								if (isSuperClass(c1, c2, sourceClasses)
										&& isSuperClass(c3, c4, targetClasses)) {
									if (commonMethods.contains(method)) {
										int indexOf = commonMethods
												.indexOf(method);
										commonMethods
												.get(indexOf)
												.getAllowedClasses()
												.add(method.getDeclaringClass());
									} else {
										method.getAllowedClasses().add(
												method.getDeclaringClass());
										commonMethods.add(method);
									}
								} // o inverso
								// inclui a classe do target no allowed classes
								else if (isSuperClass(c2, c1, sourceClasses)
										&& isSuperClass(c4, c3, targetClasses)) {
									method.getAllowedClasses().add(
											targetMethod.getDeclaringClass());

									if (commonMethods.contains(method)) {
										int indexOf = commonMethods
												.indexOf(method);
										commonMethods
												.get(indexOf)
												.getAllowedClasses()
												.add(
														targetMethod
																.getDeclaringClass());
									} else {
										method.getAllowedClasses().add(
												targetMethod
														.getDeclaringClass());
										commonMethods.add(method);
									}
								}
							}
						}
					} else {
						if (commonMethods.contains(method)) {
							int indexOf = commonMethods.indexOf(method);
							commonMethods.get(indexOf).getAllowedClasses().add(
									sourceClass.getFullName());
						} else {
							method.getAllowedClasses().add(
									sourceClass.getFullName());
							commonMethods.add(method);
						}
					}
				}
			}
		}

		return checkingCanProceed;
	}

	// TODO checar se uma classe � subclasse da outra.
	private boolean isSuperClass(SClass c1, SClass c2,
			Map<String, SClass> classes) {
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

}
