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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import br.edu.ufcg.saferefactor.core.ast.SClass;
import br.edu.ufcg.saferefactor.core.ast.SConstructor;
import br.edu.ufcg.saferefactor.core.ast.SMethod;
import br.edu.ufcg.saferefactor.core.util.Constants;
import br.edu.ufcg.saferefactor.core.util.FileUtil;



public class Analyzer {

	/* This variable will store a tuple of a class name and a Class Structure to the <TARGET> source code.*/
	private Map<String, SClass> targetClasses;
	
	/* This variable will store a tuple of a class name and a Class Structure to the <SOURCE> source code.*/
	private Map<String, SClass> sourceClasses;
	
	/* It will store the common constructors between two classes. Source Class and the same  Class in the target. */
	private List<SConstructor> commonConstructors;

    /* It will store the common methods between two classes. Source Class and the same  Class in the target. */
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

	public File generateMethodListFile(Criteria criteria) throws IOException {
	
		/* Looks for the common methods and constructors between the classes. */
		boolean checkingCanProceed = analyzeChange(criteria);
		
		/* It asks if any existing method in the source is always present in the target*/
		if (!checkingCanProceed) {
			return null;
		}

		StringBuffer lines = new StringBuffer();

		int quantityOfMethodsToTest = 0;

		if(this.pinfo.getClasses().isEmpty()){ System.out.println(" Classes is Empty !!");}
		
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

					if (constructorString.contains(classeParaTestar) && !this.listContainsString( this.nonDeterministicMethods, constructorString)) {
						lines.append(constructor + "\n");

						List<String> classParameters = constructor.getParameters();

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
			// Se a lista estiver vazia, teste todos os metodos e construtores.
			for (SConstructor constructor : commonConstructors) {
				
				System.out.println("\nCommon constructor between Source and Target: " + constructor);
				
				if (!this.listContainsString(this.nonDeterministicMethods, constructor.toString())) {
					lines.append(constructor + "\n");
					quantityOfMethodsToTest = quantityOfMethodsToTest + 1;
				}
			}
			System.out.println("\n\n");
			for (SMethod method : commonMethods) {
				System.out.println("\nCommon method between Source and Target: " + method);
				if (!this.listContainsString(this.nonDeterministicMethods, method.toString())) {
					lines.append(method + "\n");
					quantityOfMethodsToTest = quantityOfMethodsToTest + 1;
				}
			}
		}

		System.out.println(lines.toString());

		System.out.println("\n\nAmount of tests to test: " + quantityOfMethodsToTest);
		this.pinfo.setQuantityOfMethodsToTest(quantityOfMethodsToTest);

		return FileUtil.makeFile(Constants.ARQUIVO_INTERSECAO, lines.toString());
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
		return null;
	}

	/**
	 * This methods will try to mapp all classes from the Source and puts inside Sclass all class name, superclass name, methods and Constructors of each Class.
	 * @return
	 * @throws IOException
	 */
	public Map<String, SClass> mapSourceClasses() throws IOException {
		Map<String, SClass> result = new HashMap<String, SClass>();
		try {
			result = mapClasses(this.pinfo.getSource());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public Map<String, SClass> mapTargetClasses() throws IOException {
		Map<String, SClass> result = new HashMap<String, SClass>();
		
		try {
			result = mapClasses(this.pinfo.getTarget());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		/*try {
			// use buffering
			InputStream file = new FileInputStream(Constants.TEST + Constants.FILE_SEPARATOR + "mapClasses2.ser");
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
		}*/
		return result;
	}
	
	private File findFirstClass(File f){
		System.out.print(" FIle: " + f.getAbsolutePath());
		if (f.isDirectory()) {
			System.out.println("\tDIRECTORY!");
			File[] files = f.listFiles();
			for (File file : files) {
				/*Call the same method recursively*/
				return this.findFirstClass(file);
			}
		}else {
			System.out.println("\tFILE!");
			/*The whole source file path*/
			String sourceAbsolutePath = f.getAbsolutePath();
			if(sourceAbsolutePath.endsWith(".class")){
				System.out.println("\n I found it! .class: "+ sourceAbsolutePath);
				return f;
			}
		}
		return f;
	}

	/**
	 * This methods maps all classes from the Source and puts inside Sclass all class name, superclass name, methods and Constructors of each Class.
	 * @param filesDir Source Directory
	 * @return
	 * @throws IOException
	 */
	private Map<String, SClass> mapClasses(String filesDir) throws IOException {
		
		Map<String, SClass> result = new HashMap<String, SClass>();
		
	    System.out.println("File Directory: " + filesDir);
		
		File root = new File(filesDir);
		String binPath = filesDir+System.getProperty("file.separator")+this.pinfo.getBinDir();
		
		File binFiles = this.findFirstClass(new File(binPath));
		
		File bin = new File(binPath);
		System.out.println("bin Path: " + binPath);
		System.out.println("File Root: " + root.getName());
		System.out.println("File Bin: " + bin.getAbsolutePath());
		System.out.println("File Bin Directory: " + binFiles.getAbsolutePath());
		
		String srcFiles = filesDir + Constants.FILE_SEPARATOR + this.pinfo.getSrcDir();
		
		System.out.println("Source Files Directory: " + srcFiles);
		

		String libFiles = filesDir + Constants.FILE_SEPARATOR + this.pinfo.getLib();

		System.out.println("Library Files Directory: " + libFiles);
		
		br.edu.ufcg.saferefactor.core.FileClassLoader loader = new br.edu.ufcg.saferefactor.core.FileClassLoader();
		Class clazz = loader.createClass(binFiles); 
		
		if(clazz==null){
			System.out.println("clazz : " + clazz);
		}
		
		String clazzName = clazz.getCanonicalName();
		int levels = clazzName.replaceAll("[^.]*", "").length();
		File raiz = binFiles.getParentFile();
		for (int i = 0; i < levels; i++) {
			raiz = raiz.getParentFile();
		}
		loader.addURL(raiz.toURI().toURL());
		
		List<String> listClassNames = FileUtil.listClassNames(srcFiles, "");
		
		System.out.println("class loader toString: " + loader.toString());
		
		Iterator<String> i = listClassNames.iterator();
		while(i.hasNext()){
			String c = i.next();
			System.out.println("\n-> " + c);
		}System.out.println("\n\n");
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
				
				System.out.println("\nclassName: " + className);
				
				 Class<?> c = loader.loadClass(className); 
				
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
				
				
				System.out.println("\n\n** S. Class ** ");
				System.out.println("Full Name: " + sc.getFullName() + " Parent: " + sc.getParent());
				
				Constructor<?>[] constructors = c.getConstructors();
				List<SConstructor> sconsList = new ArrayList<SConstructor>(constructors.length);

				/* Do not consider constructors of abstract classes */
				if (!Modifier.isAbstract(modifiers))
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
						
						System.out.println("Constructor: " + scons.getName());
						
						sconsList.add(scons);
					}
				sc.setConstructors(sconsList);

				Method[] methods = c.getMethods();
				List<SMethod> smList = new ArrayList<SMethod>(methods.length);
				for (Method method : methods) {

					System.out.println("Method: " + method);
					
					if (method.getDeclaringClass().getName().equals("java.lang.Object"))
						continue;

					// HACK: do not consider ArrayList methods due to randoop
					// problems with generics
					if (method.getDeclaringClass().getName().equals("java.util.ArrayList"))
						continue;

					boolean hasGenericParam = false;
					Type[] genericParameterTypes = method.getGenericParameterTypes();

					for (Type type : genericParameterTypes) {

						if (type instanceof ParameterizedType) {
							System.out.println("Type: " + type);
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

	public Map<String, SClass> mapClasses2(String filesDir) throws IOException {
		
		Map<String, SClass> result = new HashMap<String, SClass>();
		
		String binPath = filesDir+System.getProperty("file.separator")+this.pinfo.getBinDir();
		
		File binFiles = this.findFirstClass(new File(binPath));
		System.out.println("File Bin Directory: " + binFiles.getAbsolutePath());
		
		System.out.println("Bin Path -> " + binPath);
		List<String> listClassNames = FileUtil.listClassNames(binPath, "");
		
		if(listClassNames.isEmpty()){
			System.out.println("\nList Class Name Array is Empty !\n");
		}
		
		Iterator<String> i = listClassNames.iterator();
		while(i.hasNext()){
			String c = i.next();
			System.out.println("\n\n-> " + c);
		}System.out.println("\n\n");
		
		br.edu.ufcg.saferefactor.core.FileClassLoader loader = new br.edu.ufcg.saferefactor.core.FileClassLoader();
		Class clazz = loader.createClass(binFiles); 
				
		String clazzName = clazz.getCanonicalName();
		int levels = clazzName.replaceAll("[^.]*", "").length();
		File raiz = binFiles.getParentFile();
		for (int i1 = 0; i1 < levels; i1++) {
			raiz = raiz.getParentFile();
		}
		loader.addURL(raiz.toURI().toURL());
		
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

				//Class<?> c = Class.forName(className);
				 Class<?> c = loader.loadClass(className); 

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
				List<SConstructor> sconsList = new ArrayList<SConstructor>(constructors.length);

				if (!Modifier.isAbstract(modifiers))
					for (Constructor<?> constructor : constructors) {
						SConstructor scons = new SConstructor();
						scons.setDeclaringClass(constructor.getDeclaringClass().getName());
						scons.setName(constructor.getName());

						Class<?>[] parameterTypes = constructor.getParameterTypes();
						List<String> parameters = new ArrayList<String>(parameterTypes.length);
						boolean addMethod = true;
						for (Class<?> param : parameterTypes) {

							if (param.getName().equals("com.memorybudget.MemoryBudget"))
								addMethod = false;
							if (param.getName().equals("com.sleepycat.je.log.LogManager"))
								addMethod = false;
							if (param.getName().equals("com.sleepycat.je.log.SyncedLogManager"))
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

		System.out.println("Classes that throw exception and will be not included in the tests: ");
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

	/**
	 * This method looks for the common methods and constructors between the classes.
	 * @param criteria
	 * @return returns if this analysis can be continued: If any existing method in the source is always present in the target.
	 * @throws IOException
	 */
	public boolean analyzeChange(Criteria criteria) throws IOException {
	
		boolean checkingCanProceed = true;
		
		/*try to "parses" all classes from the SOURCE and puts inside Sclass Structure all class name, superclass name, methods and Constructors of each Class.*/
		this.sourceClasses = mapSourceClasses();
		Iterator<String> i = this.sourceClasses.keySet().iterator();
		System.out.println("\n\n\t\tSOURCE Classes:\n");
		while(i.hasNext()){
			String s = i.next();
			System.out.println(s);
		}
		
		/*try to "parses" all classes from the TARGET and puts inside Sclass Structure all class name, superclass name, methods and Constructors of each Class.*/
		this.targetClasses = mapTargetClasses();
		if(targetClasses.isEmpty()){ System.out.println("TargetClasses is empty !");}
		Iterator<String> it = this.targetClasses.keySet().iterator();
		System.out.println("\n\n\t\tTarget Classes:\n");
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		
		
		/* It walks through all classes from the source and analyzes each one. */
		for (SClass sourceClass : this.sourceClasses.values()) {

			/* If the target does not have this class, this part is jumped. */
			if (!targetClasses.values().contains(sourceClass)) {
				if (criteria == Criteria.ALL_METHODS_IN_SOURCE_AND_TARGET) {
					//Tem lixo vindo entre as classes do source.
					//Essa classe existe dos dois lados, mas nao eh encontrada pelo Safe.
					//Analisar bug do Safe.
					if (!sourceClass.toString().contains("PreferencesDialog")) {
						checkingCanProceed = false;
						System.out.println("\nClasse: " + sourceClass + " NAO foi encontrada. Classe: " + sourceClass.toString().length());
					}
				}
				continue;
			} /*End if*/

			/*Target Class*/
			SClass targetClass = targetClasses.get(sourceClass.getFullName());
			System.out.println("\n\nTarget Class: " + targetClass);
			/* Walk through all constructors from the class and Looks for common methods between target and source classes. */
			for (SConstructor constructor : sourceClass.getConstructors()) {
				if (targetClass.getConstructors().contains(constructor)) {
					/* Add it to common method.*/
					commonConstructors.add(constructor);
				}
			}

			if (checkingCanProceed) {
				if(criteria == Criteria.ALL_METHODS_IN_SOURCE_AND_TARGET){
					/* Walk through all methods of the target class*/
					for(SMethod method : targetClass.getMethods()){
						/* If an existing method in the source is not present in the target It can not be proceeded.*/
						if(!sourceClass.getMethods().contains(method)){
							checkingCanProceed = false;
						}
					}
				}
				
				/* Walk through all methods of the source class. */
				for (SMethod method : sourceClass.getMethods()) {
					
					System.out.println("\n\nmethod: " + method);
					
					/* If the source and target contains the method with the same signature, include it !! */
					if (!targetClass.getMethods().contains(method)) {
						/* If an existing method in the source is not present in the target It can not be proceed. */
						/* However the method can be found in the down hierarchy. */
						if (criteria == Criteria.ALL_METHODS_IN_SOURCE_AND_TARGET) {
							//Essa classe existe dos dois lados, mas nao eh encontrada pelo Safe.
							//Analisar bug do Safe.
							if (!sourceClass.toString().contains("PreferencesDialog")) {
								checkingCanProceed = false;
								System.out.println("\nMetodo " + method	+ " NAO foi encontrado.");
							}
						}

						/*  It verifies if the method exists in the hierarchy. */
						for (int j = 0; j < targetClass.getMethods().size(); j++) {
							SMethod targetMethod = targetClass.getMethods().get(j);

							// existem um method na classe, porem eles estao
							// definidos em classes diferentes
							if (targetMethod.getSimpleName().equals(method.getSimpleName())&& method.getParameterList().equals(targetMethod.getParameterList())) {

								// Se achou metodo na hierarquia, deve ser
								// possível prosseguir com a checagem.
								checkingCanProceed = true;

								SClass c1 = sourceClasses.get(method.getDeclaringClass());
								SClass c2 = sourceClasses.get(targetMethod.getDeclaringClass());

								SClass c3 = targetClasses.get(method.getDeclaringClass());
								SClass c4 = targetClasses.get(targetMethod.getDeclaringClass());

								// a classe do target �� super da classe do
								// source
								// nas duas hierarquias
								// inclui a class do source no allowedclasses
								if (isSuperClass(c1, c2, sourceClasses)
										&& isSuperClass(c3, c4, targetClasses)) {
									if (commonMethods.contains(method)) {
										/*  Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element. */
										int indexOf = commonMethods.indexOf(method);
										commonMethods.get(indexOf).getAllowedClasses().add(method.getDeclaringClass());
									} else {
										method.getAllowedClasses().add(method.getDeclaringClass());
										commonMethods.add(method);
									}
								} // o inverso
								// inclui a classe do target no allowed classes
								else if (isSuperClass(c2, c1, sourceClasses) && isSuperClass(c4, c3, targetClasses)) {
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
					} else {
						/* If the source and target contains the method with the same signature */
						if (commonMethods.contains(method)) {
							int indexOf = commonMethods.indexOf(method);
							/* Add it !! */
							commonMethods.get(indexOf).getAllowedClasses().add(sourceClass.getFullName());
						} else {
							method.getAllowedClasses().add(sourceClass.getFullName());
							/* Add it !! */
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
