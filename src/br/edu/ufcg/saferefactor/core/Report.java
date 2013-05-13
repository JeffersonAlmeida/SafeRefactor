package br.edu.ufcg.saferefactor.core;


public class Report {
	
	private int genratedTests;
	private int sourceFailures;
	private int sourceErrors;
	private int targetFailures;
	private int targetErrors;
	private boolean sameBehavior;
	private String changes;
	
	public int getSourceFailures() {
		return sourceFailures;
	}

	public void setSourceFailures(int sourceFailures) {
		this.sourceFailures = sourceFailures;
	}

	public int getSourceErrors() {
		return sourceErrors;
	}

	public void setSourceErrors(int sourceErrors) {
		this.sourceErrors = sourceErrors;
	}

	public int getTargetFailures() {
		return targetFailures;
	}

	public void setTargetFailures(int targetFailures) {
		this.targetFailures = targetFailures;
	}

	public int getTargetErrors() {
		return targetErrors;
	}

	public void setTargetErrors(int targetErrors) {
		this.targetErrors = targetErrors;
	}

	public boolean isSameBehavior() {
		return sameBehavior;
	}

	public void setSameBehavior(boolean sameBehavior) {
		this.sameBehavior = sameBehavior;
	}

	public void setGenratedTests(int genratedTests) {
		this.genratedTests = genratedTests;
	}

	public int getGenratedTests() {
		return genratedTests;
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		
		result.append("Testes generated: ");
		result.append(this.genratedTests);
		result.append("\n");
		
		result.append("Failures on source: ");
		result.append(this.sourceFailures);
		result.append("\n");
		result.append("Errors on source: ");
		result.append(this.sourceErrors);
		result.append("\n");
		
		result.append("Failures on target: ");
		result.append(this.targetFailures);
		result.append("\n");
		result.append("Errors on target: ");
		result.append(this.targetErrors);
		result.append("\n");
		
		result.append("Refactoring? ");
		result.append(this.sameBehavior);
		result.append("\n");
		
		return result.toString();

		
	}

	public String getChanges() {
		return changes;
	}

	public void setChanges(String changes) {
		this.changes = changes;
	}

	

}
