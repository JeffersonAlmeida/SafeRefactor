package org.sr.ic;

import java.util.Collection;
import java.util.regex.Pattern;

public class ImpactedClasses {
	
	private Collection<String> modifiedClasses;
	
	public ImpactedClasses(Collection<String> impactedClasses) {
		super();
		this.modifiedClasses = impactedClasses;
	}

	private void getArrayOfImpactedClasses(String ic) {
		if (ic != null && !ic.contains("{classes}")) {
			String[] listOfClasses = ic.split(Pattern.quote("|"));
			for (String clazz : listOfClasses) {
				this.modifiedClasses.add(clazz);
			}
		}
	}
	public Collection<String> getModifiedClasses() {
		return modifiedClasses;
	}
	public void setModifiedClasses(Collection<String> modifiedClasses) {
		this.modifiedClasses = modifiedClasses;
	}
}
