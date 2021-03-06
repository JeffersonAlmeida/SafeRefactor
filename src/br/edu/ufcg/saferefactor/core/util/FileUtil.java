package br.edu.ufcg.saferefactor.core.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.sr.input.FilePropertiesObject;

public class FileUtil {

	/**
	 * @param path
	 *            = diretorio base do projeto
	 * @param result
	 *            = armazenara o nome de todos os arquivos Java do diretorio
	 * @param base
	 *            = eh usado na recursao. Indica o nome base do pacote
	 */
	public static List<String> listClassNames(String path, String base) {
		
		List<String> result = new ArrayList<String>();
		
		try {
			File dir = new File(path);

			if (!dir.exists()) {
				throw new RuntimeException("Dir " + dir.getAbsolutePath()
						+ " does not exist.");
			}

			File[] arquivos = dir.listFiles();
			
			int tam = arquivos.length;
			
			for (int i = 0; i < tam; i++) {
				
				if (arquivos[i].isDirectory()) {
					
					// we add the subdirectories
					String baseTemp = base + arquivos[i].getName() + ".";
					result.addAll(listClassNames(arquivos[i].getAbsolutePath(), baseTemp));
					
				} else {
					// only .class files
					// TODO maybe, we need to consider aspectj files
					if (arquivos[i].getName().endsWith(".java")
							&& !arquivos[i].getName().equals(
									"SVGStorageFormat.java")) {
						// TODO Diego - TODEL
						// if(arquivos[i].getName().contains("LogFactory"))
						// continue;

						String temp = base + arquivos[i].getName();
						temp = trataNome(temp);

						if (!result.contains(temp))
							result.add(temp);
					}
				}
			}
		} catch (Exception e) {
			System.err.println("Error in FileUtil.getClasses()");
			e.printStackTrace();
		}
		return result; 
	}

	// remove a extensao Java (o \\b significa word boundary -- fim da palavra)
	private static String trataNome(String arquivo) {
		arquivo = arquivo.replaceAll(".java\\b", "");
		return arquivo;
	}
	
	public static File makeFile(String name, Set<String> texto) {
		File result = new File(name);
		try {			
			FileWriter fw = new FileWriter(result);
			for(String t: texto){
				fw.write( t + "\n");	
			}
			
			fw.close();
		} catch (Exception e) {
			System.err.println("Erro no metodo FileUtil.gravaArquivo()");
			e.printStackTrace();
		}
		return result;
	}
	
	public static File makeFile(String name, Set<String> listOfConstructors,  Set<String> listOfMethods) {
		File result = new File(name);
		try {			
			FileWriter fw = new FileWriter(result);
			for(String t: listOfConstructors){
				fw.write( t + "\n");	
			}
			for(String t: listOfMethods){
				fw.write( t + "\n");	
			}
			fw.close();
		} catch (Exception e) {
			System.err.println("Erro no metodo FileUtil.gravaArquivo()");
			e.printStackTrace();
		}
		return result;
	}
	
	public static File makeFile(String name, String texto) {
		File result = new File(name);
		try {			
			FileWriter fw = new FileWriter(result);
			fw.write(texto);	
			fw.close();
		} catch (Exception e) {
			System.err.println("Erro no metodo FileUtil.gravaArquivo()");
			e.printStackTrace();
		}
		return result;
	}
	
	public static void createFolders(FilePropertiesObject input) {
		String tempDir = System.getProperty("java.io.tmpdir") + Constants.FILE_SEPARATOR + "safeRefactorAJ";
		
		File build = new File(tempDir + Constants.FILE_SEPARATOR + "tests" +  Constants.FILE_SEPARATOR + "bin");
		File testsSource = new File(tempDir + Constants.FILE_SEPARATOR + "tests" + Constants.FILE_SEPARATOR + "source");
		File testsTarget = new File(tempDir + Constants.FILE_SEPARATOR +  "tests" + Constants.FILE_SEPARATOR + "target");
		
		String i = input.getSourceLineDirectory() + "methods-to-test-list";
		File intersection = new File(i);
		
		intersection.mkdir();
		build.mkdirs();	
		testsSource.mkdirs();
		testsTarget.mkdirs();
		
	}
	
	/**
	 * Create RANDOOP tests directory in the product's folder */
	public static void createRandoopFolders(FilePropertiesObject input) {
		String randoop_tests_sourceProduct = input.getSourceLineDirectory() + "src";
		String randoop_tests_targetProduct = input.getTargetLineDirectory() + "src";
		File randoop_tests_sourceProductFile = new File(randoop_tests_sourceProduct);
		File randoop_tests_targetProductFile = new File(randoop_tests_targetProduct);
		randoop_tests_sourceProductFile.mkdirs();
		randoop_tests_targetProductFile.mkdirs();
		
	}
	
	/**
	 * Create EVOSUITE tests directory in the product's folder */
	public static void createEvosuiteFolders(FilePropertiesObject input) {
		String evosuite_tests_sourceProduct = input.getSourceLineDirectory() + "src/evosuite/tests";
		String evosuite_tests_targetProduct = input.getTargetLineDirectory() + "src/evosuite/tests";
		File evosuite_tests_sourceProductFile = new File(evosuite_tests_sourceProduct);
		File evosuite_tests_targetProductFile = new File(evosuite_tests_targetProduct);
		evosuite_tests_sourceProductFile.mkdirs();
		evosuite_tests_targetProductFile.mkdirs();
	}
		
	public static String getTempPath() {
		return System.getProperty("java.io.tmpdir");
	}

	public static void createTestsFolder(FilePropertiesObject input) {
		if(input.getGenerateTestsWith().equals("randoop")){
			FileUtil.createRandoopFolders(input);
		}else{
			FileUtil.createEvosuiteFolders(input);	
		}
	}

	public static void createFile(String dir) {
		File log = new File(dir);
		log.mkdir();
	}
	
	public static void copyFromTo(File srcFolder, File destFolder){
		//make sure source exists
    	if(!srcFolder.exists()){
           System.out.println("Directory does not exist.");
        }else{
           try{
        	copyFolder(srcFolder,destFolder);
           }catch(IOException e){
        	e.printStackTrace();
           }
        }
	}
	
	 private static void copyFolder(File src, File dest) throws IOException{
	    	if(src.isDirectory()){
	    		//if directory not exists, create it
	    		if(!dest.exists()){
	    		   dest.mkdirs();
	    		   System.out.println("Directory copied from " + src + "  to " + dest);
	    		}
	    		//list all the directory contents
	    		String files[] = src.list();
	    		for (String file : files) {
	    		   //construct the src and dest file structure
	    		   File srcFile = new File(src, file);
	    		   File destFile = new File(dest, file);
	    		   //recursive copy
	    		   copyFolder(srcFile,destFile);
	    		}
	    	}else{
	    		//if file, then copy it
	    		//Use bytes stream to support all file types
	    	    if(dest.exists())
	    	    	System.out.println("delete: " + dest.delete());
	    	    InputStream in = new FileInputStream(src);
	    	    OutputStream out = new FileOutputStream(dest);
	    	    byte[] buffer = new byte[2024];
	    	    int length;
	    	    //copy the file content in bytes 
	    	    while ((length = in.read(buffer)) > 0){
	    	    	   out.write(buffer, 0, length);
	    	    }
	    	    in.close();
	    	    out.flush();
		        out.close();
		        System.out.println("File copied from " + src + " to " + dest);
	    	}
	    }
}
