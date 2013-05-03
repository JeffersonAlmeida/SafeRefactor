package br.edu.ufcg.saferefactor.core.ast;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SMethod implements Serializable {
	
	public SMethod() {
		this.allowedClasses = new HashSet<String>();
	}
	private String declaringClass;

	private List<String> parameterList;
	private String simpleName;

	private Set<String> allowedClasses;

	public String getDeclaringClass() {
		return declaringClass;
	}

	public void setDeclaringClass(String declaringClass) {
		this.declaringClass = declaringClass;
	}

	public String getSimpleName() {
		return simpleName;
	}

	public void setSimpleName(String simpleName) {
		this.simpleName = simpleName;
	}

	public void setParameterList(List<String> parameterList) {
		this.parameterList = parameterList;
	}

	public List<String> getParameterList() {
		return parameterList;
	}

	@Override
	public String toString() {

		String methodSig = this.declaringClass + "." + this.simpleName + "(";

		for (int j = 0; j < this.parameterList.size(); j++) {
			methodSig = methodSig + parameterList.get(j);
			if (j < (parameterList.size() - 1))
				methodSig = methodSig + ", ";
		}
		methodSig = "method : " + methodSig + ") : ";
		if (allowedClasses.size() != 0) {
			for (String allowedClass : this.allowedClasses) {
				methodSig = methodSig + allowedClass + ";";
			}
			methodSig = methodSig.substring(0, methodSig.length() -1);
		}
			
		return methodSig;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((declaringClass == null) ? 0 : declaringClass.hashCode());
		result = prime * result
				+ ((parameterList == null) ? 0 : parameterList.hashCode());
		result = prime * result
				+ ((simpleName == null) ? 0 : simpleName.hashCode());
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
		SMethod other = (SMethod) obj;
		if (declaringClass == null) {
			if (other.declaringClass != null)
				return false;
		} else if (!declaringClass.equals(other.declaringClass))
			return false;
		if (parameterList == null) {
			if (other.parameterList != null)
				return false;
		} else if (!parameterList.equals(other.parameterList))
			return false;
		if (simpleName == null) {
			if (other.simpleName != null)
				return false;
		} else if (!simpleName.equals(other.simpleName))
			return false;
		return true;
	}

	public void setAllowedClasses(Set<String> allowedClasses) {
		this.allowedClasses = allowedClasses;
	}

	public Set<String> getAllowedClasses() {
		return allowedClasses;
	}

}
