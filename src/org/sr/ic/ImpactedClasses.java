package org.sr.ic;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ImpactedClasses {
	
	private List<String> modifiedClasses;
	
	public ImpactedClasses(String ic) {
		super();
		this.modifiedClasses = new ArrayList<String>();
		this.getArrayOfImpactedClasses(ic);
	}

	private void getArrayOfImpactedClasses(String ic) {
		if (ic != null && !ic.contains("{classes}")) {
			String[] listOfClasses = ic.split(Pattern.quote("|"));
			for (String clazz : listOfClasses) {
				this.modifiedClasses.add(clazz);
			}
		}
	}

	public List<String> getModifiedClasses() {
		return this.modifiedClasses;
	}
	public void setModifiedClasses(List<String> modifiedClasses) {
		this.modifiedClasses = modifiedClasses;
	}
	
}
