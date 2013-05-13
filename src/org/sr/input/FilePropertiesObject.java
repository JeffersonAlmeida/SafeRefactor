package org.sr.input;

import br.edu.ufcg.saferefactor.core.Criteria;

public class FilePropertiesObject {
	
			private String evolutionDescription;
			private String sourceLineDirectory;
			private String targetLineDirectory;
			private String sourceLineLibDirectory;
			private String targetLineLibDirectory;
			private int timeOut;
			private int inputLimit;
			private boolean aspectsInSourceSPL;
			private boolean aspectsInTargetSPL;
			private Criteria whichMethods;
			private String artifactsSourceDir;
			private String artifactsTargetDir;
			private String generateTestsWith;
			
			public FilePropertiesObject() {
				super();
			}
			
			/*...............................................>Getters and Setters*/
			public String getSourceLineDirectory() {
				return sourceLineDirectory;
			}
			public void setSourceLineDirectory(String sourceLineDirectory) {
				this.sourceLineDirectory = sourceLineDirectory;
			}
			public String getTargetLineDirectory() {
				return targetLineDirectory;
			}
			public void setTargetLineDirectory(String targetLineDirectory) {
				this.targetLineDirectory = targetLineDirectory;
			}
			public String getSourceLineLibDirectory() {
				return sourceLineLibDirectory;
			}
			public void setSourceLineLibDirectory(String sourceLineLibDirectory) {
				this.sourceLineLibDirectory = sourceLineLibDirectory;
			}
			public String getTargetLineLibDirectory() {
				return targetLineLibDirectory;
			}
			public void setTargetLineLibDirectory(String targetLineLibDirectory) {
				this.targetLineLibDirectory = targetLineLibDirectory;
			}
			
			public int getTimeOut() {
				return timeOut;
			}
			public void setTimeOut(int timeOut) {
				this.timeOut = timeOut;
			}
			public int getInputLimit() {
				return inputLimit;
			}
			public void setInputLimit(int inputLimit) {
				this.inputLimit = inputLimit;
			}
			
			
			public boolean isAspectsInSourceSPL() {
				return aspectsInSourceSPL;
			}
			public void setAspectsInSourceSPL(boolean aspectsInSourceSPL) {
				this.aspectsInSourceSPL = aspectsInSourceSPL;
			}
			public boolean isAspectsInTargetSPL() {
				return aspectsInTargetSPL;
			}
			public void setAspectsInTargetSPL(boolean aspectsInTargetSPL) {
				this.aspectsInTargetSPL = aspectsInTargetSPL;
			}
			public Criteria getWhichMethods() {
				return whichMethods;
			}
			public void setWhichMethods(Criteria whichMethods) {
				this.whichMethods = whichMethods;
			}
			public void setEvolutionDescription(String evolutionDescription) {
				this.evolutionDescription = evolutionDescription;
			}
			public String getEvolutionDescription() {
				return evolutionDescription;
			}
			public String getArtifactsSourceDir() {
				return artifactsSourceDir;
			}
			public void setArtifactsSourceDir(String artifactsSourceDir) {
				this.artifactsSourceDir = artifactsSourceDir;
			}

			public void setArtifactsTargetDir(String artifactsTargetDir) {
				this.artifactsTargetDir = artifactsTargetDir;
			}
			public String getArtifactsTargetDir() {
				return artifactsTargetDir;
			}
			public String getGenerateTestsWith() {
				return generateTestsWith;
			}
			public void setGenerateTestsWith(String generateTestsWith) {
				this.generateTestsWith = generateTestsWith;
			}
			/*............................................................toString*/
		
			/* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				
				return "evolutionDescription = " + evolutionDescription + "\n" +
				        "sourceLineDirectory = " + sourceLineDirectory + "\n" + 
				        "targetLineDirectory = " + targetLineDirectory + "\n" +
				   	    "sourceLineLibDirectory = " + sourceLineLibDirectory + "\n" +
						"targetLineLibDirectory = " + targetLineLibDirectory + "\n" +
						"generateTestsWith = " + generateTestsWith + "\n" +
						"timeOut = " + timeOut + "\n" +
						"inputLimit = " + inputLimit + "\n" +
						"aspectsInSourceSPL = " + aspectsInSourceSPL + "\n" +
						"aspectsInTargetSPL = " + aspectsInTargetSPL + "\n" +
						"whichMethods = " + whichMethods + "\n" +
						"artifactsSourceDir = " + artifactsSourceDir + "\n" +
						"artifactsTargetDir = " + artifactsTargetDir + "\n";
			}

			
}
