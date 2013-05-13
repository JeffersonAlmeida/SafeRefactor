package org.sr.input;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import br.edu.ufcg.saferefactor.core.Criteria;

public class FilePropertiesReader {
	
			private String filePropertiesDirectory;
			private Properties properties;
			private FilePropertiesObject propertiesObject;
			private boolean isLoaded;
			
			public FilePropertiesReader() {
				super();
			}
			
			public FilePropertiesReader(String filePropertiesDirectory) {
				super();
				this.isLoaded = false;
				this.propertiesObject = new FilePropertiesObject();
				this.filePropertiesDirectory = filePropertiesDirectory;
				this.properties = new Properties();
				this.createFileProperty();
				this.loadData();
			}
			
			private FilePropertiesObject loadData() {
				
				String evolutionDescription = this.properties.getProperty("evolutionDescription");
				this.propertiesObject.setEvolutionDescription(evolutionDescription);
				
				String sourceLineDirectory = this.properties.getProperty("sourceLineDirectory");
				this.propertiesObject.setSourceLineDirectory(sourceLineDirectory);
				
				String targetLineDirectory = this.properties.getProperty("targetLineDirectory");
				this.propertiesObject.setTargetLineDirectory(targetLineDirectory);
				
				String sourceLineLibDirectory = this.properties.getProperty("sourceLineLibDirectory");
				this.propertiesObject.setSourceLineLibDirectory(sourceLineLibDirectory);
				
				String targetLineLibDirectory = this.properties.getProperty("targetLineLibDirectory");
				this.propertiesObject.setTargetLineLibDirectory(targetLineLibDirectory);
				
				String timeOut = this.properties.getProperty("timeout");
				this.propertiesObject.setTimeOut(Integer.parseInt(timeOut)); 
				
				String inputLimit = this.properties.getProperty("inputlimit");
				this.propertiesObject.setInputLimit(Integer.parseInt(inputLimit));
				
				String aspectsInSourceSPL = this.properties.getProperty("aspectsInSourceSPL");
				this.propertiesObject.setAspectsInSourceSPL(findOutTrueOrFalse(aspectsInSourceSPL));
				
				String aspectsInTargetSPL = this.properties.getProperty("aspectsInTargetSPL");
				this.propertiesObject.setAspectsInTargetSPL(findOutTrueOrFalse(aspectsInTargetSPL));
				
				String whichMethods = this.properties.getProperty("whichMethods");
				this.propertiesObject.setWhichMethods( findOutCriteria(whichMethods));
				
				String artifactsSourceDir = this.properties.getProperty("artifactsSourceDir");
				this.propertiesObject.setArtifactsSourceDir(artifactsSourceDir);
				
				String artifactsTargetDir = this.properties.getProperty("artifactsTargetDir");
				this.propertiesObject.setArtifactsTargetDir(artifactsTargetDir);
				
				String generateTestsWith = this.properties.getProperty("generateTestsWith");
				this.propertiesObject.setGenerateTestsWith(generateTestsWith);
				
				this.isLoaded = true;
				return this.propertiesObject;
			}
		
			private Criteria findOutCriteria(String whichMethods) {
				/*  <commonMethods>, <allMethods> */
				Criteria criteria = Criteria.ONLY_COMMON_METHODS_SUBSET_DEFAULT;
				if (whichMethods.trim().toLowerCase().equals("commonMethods")) {
					return Criteria.ONLY_COMMON_METHODS_SUBSET_DEFAULT;
				}else if (whichMethods.trim().toLowerCase().equals("allMethods")){
					return Criteria.ALL_METHODS_IN_SOURCE_AND_TARGET;
				}
				return criteria;
			}
		
			private boolean findOutTrueOrFalse(String question) {
				boolean answer = false;
				if (question.trim().toLowerCase().equals("true")){
					answer = true;
				}else if (question.trim().toLowerCase().equals("false")){
					answer = false;
				}
				return answer;
			}
		
			private void createFileProperty(){
				try {
					InputStream is = new FileInputStream(this.filePropertiesDirectory);
					this.properties.load(is);
					is.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		
			/*.......................................................... GETTERS AND SETTERS */
			public void setFilePropertiesDirectory(String filePropertiesDirectory) {
				this.filePropertiesDirectory = filePropertiesDirectory;
			}
			public String getFilePropertiesDirectory() {
				return filePropertiesDirectory;
			} 
			public static void main(String [] args){
				System.out.println("File Properties");
				FilePropertiesReader propertiesReader = new FilePropertiesReader("/home/jefferson/workspace/ferramentaLPSSM/inputFiles/bank1.0.properties");
			    FilePropertiesObject propertiesObject = propertiesReader.getPropertiesObject();
				System.out.println(propertiesObject);
			}
			public void setPropertiesObject(FilePropertiesObject propertiesObject) {
				this.propertiesObject = propertiesObject;
			}
			public FilePropertiesObject getPropertiesObject() {
				if(this.isLoaded){
					return propertiesObject;	
				}else{
					return this.loadData();
				}
			}
			public boolean isLoaded() {
				return isLoaded;
			}
}
