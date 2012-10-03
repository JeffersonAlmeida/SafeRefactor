package br.edu.ufcg.saferefactor.core.ast;

import java.io.Serializable;
import java.util.List;

public class SConstructor implements Serializable{
	
	private String declaringClass;
	private String name;
	
	private List<String> parameters;
	
	
	public void setDeclaringClass(String declaringClass) {
		this.declaringClass = declaringClass;
	}
	public String getDeclaringClass() {
		return declaringClass;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setParameters(List<String> parameters) {
		this.parameters = parameters;
	}
	public List<String> getParameters() {
		return parameters;
	}
	
	@Override
	public String toString() {
		
		String signature = this.name;		
		signature = signature + ".<init>(";
		for (int j = 0; j < parameters.size(); j++) {
			signature = signature + parameters.get(j);
			if (j < (parameters.size() - 1))
				signature =  signature + ", ";					
		}
		signature = "cons : " + signature + ")";
		return signature;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((declaringClass == null) ? 0 : declaringClass.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((parameters == null) ? 0 : parameters.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SConstructor other = (SConstructor) obj;
		if (declaringClass == null) {
			if (other.declaringClass != null)
				return false;
		} else if (!declaringClass.equals(other.declaringClass))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (parameters == null) {
			if (other.parameters != null)
				return false;
		} else if (!parameters.equals(other.parameters))
			return false;
		return true;
	}
	
	

}
