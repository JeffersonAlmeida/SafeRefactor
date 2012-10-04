package br.edu.ufcg.saferefactor.core;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ProjectInfo {

	private String source;
	private String target;
	private String binDir;
	private String srcDir;
	private String lib;
	private String classesString;

	private List<String> classesList;
	private int maxTestsPerMethod;
	private int quantityOfMethodsToTest;

	private Criteria criteria;

	public ProjectInfo(String source, String target, String bin, String src, String lib) {
		this.source = source;
		this.target = target;
		this.binDir = bin;
		this.srcDir = src;
		this.lib = lib;
		
		this.criteria = Criteria.ALL_METHODS_IN_SOURCE_AND_TARGET;
		this.maxTestsPerMethod = 2;
	}

	public ProjectInfo(String source, String target, String bin, String src, String lib, String classes, int maxTests, Criteria criteria) {
		this(source, target, bin, src, lib);

		this.classesString = classes;

		this.classesList = new ArrayList<String>();

		if (classes != null && !classes.contains("{classes}")) {
			String[] classesArray = classes.split(Pattern.quote("|"));

			for (String classe : classesArray) {
				this.classesList.add(classe);
			}
		}

		this.maxTestsPerMethod = maxTests;
		
		this.criteria = criteria;
	}

	public String getSource() {
		return source;
	}

	public String getTarget() {
		return target;
	}

	public String getBinDir() {
		return binDir;
	}

	public String getSrcDir() {
		return srcDir;
	}

	public String getLib() {
		return lib;
	}

	public List<String> getClasses() {
		return this.classesList;
	}

	public String getClassesString() {
		return this.classesString;
	}

	public int getMaxTestsPerMethod() {
		return maxTestsPerMethod;
	}

	public void setQuantityOfMethodsToTest(int quantityOfMethodsToTest) {
		this.quantityOfMethodsToTest = quantityOfMethodsToTest;
	}

	public int getQuantityOfMethodsToTest() {
		return quantityOfMethodsToTest;
	}

	public Criteria getCriteria() {
		return this.criteria;
	}
}
