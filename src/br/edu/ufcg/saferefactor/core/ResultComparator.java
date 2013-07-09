package br.edu.ufcg.saferefactor.core;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ResultComparator {

	private String testsrc;
	private String testtgt;
	private Map<String, TestCaseState> sourceMap;
	private Map<String, TestCaseState> targetMap;
	private Report result;

	public ResultComparator(String testsrc, String testtgt) {
		this.testsrc = testsrc;
		this.testtgt = testtgt;
		this.sourceMap = new HashMap<String, TestCaseState>();
		this.targetMap = new HashMap<String, TestCaseState>();
	}

	public ResultComparator() {
		super();
	}

	public Report generateReport() {
		this.result = new Report();
		boolean sameBehavior = false;
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(false);
		DocumentBuilder docBuilder;
		File sourceDir = new File(testsrc);
		File targetDir = new File(testtgt);
		File[] sourceResults = sourceDir.listFiles(new FileFilter() {
			public boolean accept(File arg0) {
				if (arg0.getName().endsWith(".xml"))
					return true;
				return false;
			}
		});
		
		if(sourceResults.length > 0){
			sameBehavior = true;
		}
		
		for (int i = 0; i < sourceResults.length; i++) {
			File sourceResult = sourceResults[i];
			File targetResult = new File(targetDir, sourceResult.getName());
			

			try {
				docBuilder = dbf.newDocumentBuilder();
				Document srcDoc = docBuilder.parse(sourceResult);
				String tests = srcDoc.getDocumentElement().getAttribute("tests");
				String erros = srcDoc.getDocumentElement().getAttribute("errors");
				String failures = srcDoc.getDocumentElement().getAttribute("failures");

				Document tgtDoc = docBuilder.parse(targetResult);
				String testsTarget = tgtDoc.getDocumentElement().getAttribute("tests");
				String errosTarget = tgtDoc.getDocumentElement().getAttribute("errors");
				String failuresTarget = tgtDoc.getDocumentElement().getAttribute("failures");

				result.setGenratedTests(result.getGenratedTests() + Integer.parseInt(testsTarget));
				result.setSourceErrors(result.getSourceErrors() + Integer.parseInt(erros));
				result.setSourceFailures(result.getSourceFailures() + Integer.parseInt(failures));
				result.setTargetErrors(result.getTargetErrors() + Integer.parseInt(errosTarget));
				result.setTargetFailures(result.getTargetFailures() + Integer.parseInt(failuresTarget));
				
				sameBehavior = !hasChanges(srcDoc, tgtDoc) && sameBehavior;

				result.setSameBehavior(sameBehavior);
				
				if (!sameBehavior) {
					result.setChanges(result.getChanges() + "\n" + this.getChanges());
				}

			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;

	}

	private String getChanges() {
		StringBuilder changes = new StringBuilder();
		for (String key : sourceMap.keySet()) {
			TestCaseState sourceState = sourceMap.get(key);
			if (!targetMap.containsKey(key)) {
				changes.append("Target tests does not contains " + key + "\n");
			}
			TestCaseState targetState = targetMap.get(key);
			if (sourceState != targetState) {
				changes.append(key + " in source is " + sourceState + " while in target is " + targetState + "\n");
			}
		}
		return changes.toString();
	}

	private boolean hasChanges(Document source, Document target) {
		sourceMap = buildStateMap(source);
		targetMap = buildStateMapForTarget(target, sourceMap);
		if (sourceMap.size() != targetMap.size()) {
			return true;
		}
		for (String key : sourceMap.keySet()) {
			TestCaseState sourceState = sourceMap.get(key);
			if (!targetMap.containsKey(key)) {
				return true;
			}
			TestCaseState targetState = targetMap.get(key);
			if (sourceState != targetState) {
				return true;
			}
		}
		return false;
	}

	public List<String> getInvalidTests(Document source, Document target) {
		List<String> result = new ArrayList<String>();
		Map<String, TestCaseState> sourceMap = buildStateMap(source);
		Map<String, TestCaseState> targetMap = buildStateMapForTarget(target, sourceMap);
		for (String key : sourceMap.keySet()) {
			TestCaseState sourceState = sourceMap.get(key);
			TestCaseState targetState = targetMap.get(key);

			if (sourceState != targetState) {
				result.add(key);
			}
		}
		return result;
	}
	
	private Map<String, TestCaseState> buildStateMapForTarget(Document target, Map<String, TestCaseState> sourceMap) {
		Map<String, TestCaseState> stateMap = new HashMap<String, TestCaseState>();
		NodeList list = target.getDocumentElement().getElementsByTagName("testcase");
		for (int i = 0; i < list.getLength(); i++) {
			Element testcase = (Element) list.item(i);
			String tcName = testcase.getAttribute("classname") + "." + testcase.getAttribute("name");
			boolean hasProblems = false;
			if (testcase.hasChildNodes()) {
				NodeList subNodes = testcase.getChildNodes();
				for (int j = 0; j < subNodes.getLength(); j++) {
					if (subNodes.item(j) instanceof Element) {
						Element problem = (Element) subNodes.item(j);
						hasProblems = verifyProblem(sourceMap, stateMap, tcName, hasProblems, problem);
					}
				}
			}
			if (!hasProblems) {
				stateMap.put(tcName, TestCaseState.SUCCESS);
			}
		}
		return stateMap;
	}

	private boolean verifyProblem(Map<String, TestCaseState> sourceMap, Map<String, TestCaseState> stateMap, String tcName, boolean hasProblems, Element problem) {
		if (problem.getTagName().equals("error")) {
			hasProblems = checkErrorType(sourceMap, stateMap, tcName,hasProblems, problem, TestCaseState.ERROR);
		} else if (problem.getTagName().equals("failure")) {
			hasProblems = checkErrorType(sourceMap, stateMap, tcName,hasProblems, problem, TestCaseState.FAILURE);
		}
		return hasProblems;
	}

	private boolean checkErrorType(Map<String, TestCaseState> sourceMap,	Map<String, TestCaseState> stateMap, String tcName,	boolean hasProblems, Element problem, TestCaseState type) {
		if(problem.getAttribute("type").equals("java.lang.NoSuchMethodError")){
			sourceMap.remove(tcName);
		}else{
			stateMap.put(tcName, type);
		}
		return true;
	}

	private static Map<String, TestCaseState> buildStateMap(Document source) {
		Map<String, TestCaseState> stateMap = new HashMap<String, TestCaseState>();
		NodeList list = source.getDocumentElement().getElementsByTagName("testcase");
		for (int i = 0; i < list.getLength(); i++) {
			Element testcase = (Element) list.item(i);
			String tcName = testcase.getAttribute("classname") + "." + testcase.getAttribute("name");
			boolean hasProblems = false;
			if (testcase.hasChildNodes()) {
				NodeList subNodes = testcase.getChildNodes();
				for (int j = 0; j < subNodes.getLength(); j++) {
					if (subNodes.item(j) instanceof Element) {
						Element problem = (Element) subNodes.item(j);
						if (problem.getTagName().equals("error")) {
							hasProblems = true;
							stateMap.put(tcName, TestCaseState.ERROR);
						} else if (problem.getTagName().equals("failure")) {
							hasProblems = true;
							stateMap.put(tcName, TestCaseState.FAILURE);
						}
					}
				}
			}
			if (!hasProblems) {
				stateMap.put(tcName, TestCaseState.SUCCESS);
			}
		}
		return stateMap;
	}

	private static enum TestCaseState {
		SUCCESS, FAILURE, ERROR
	}
	public String getTestsrc() {
		return testsrc;
	}
	public void setTestsrc(String testsrc) {
		this.testsrc = testsrc;
	}
	public String getTesttgt() {
		return testtgt;
	}
	public void setTesttgt(String testtgt) {
		this.testtgt = testtgt;
	}

	public Report getResult() {
		return result;
	}
	public void setResult(Report result) {
		this.result = result;
	}
	
}
