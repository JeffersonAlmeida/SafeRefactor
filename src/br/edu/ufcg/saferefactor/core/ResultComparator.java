package br.edu.ufcg.saferefactor.core;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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
	private String testsrc2 = "";
	private String testsrc3 = "";

	private String testtgt;

	private String changes;
	

	public ResultComparator(String testsrc, String testtgt) {
		this.testsrc = testsrc;
		this.testtgt = testtgt;
	}

	public ResultComparator(String testsrc, String testtgt, String testsrc2) {
		this(testsrc, testtgt);
		
		this.testsrc2 = testsrc2;
	}

	public ResultComparator(String testsrc, String testtgt, String testsrc2, String testsrc3) {
		this(testsrc, testtgt, testsrc2);
		
		this.testsrc3 = testsrc3;
	}

	public Report generateReport() {
		Report result = new Report();
		boolean sameBehavior = false;

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(false);
		DocumentBuilder docBuilder;

		File sourceDir = new File(testsrc);
		
		File targetDir = new File(testtgt);
		
		File sourceDir2 = new File(testsrc2);
		File sourceDir3 = new File(testsrc3);

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
			
			File sourceResult2 = new File(sourceDir2, sourceResult.getName());
			File sourceResult3 = new File(sourceDir3, sourceResult.getName());

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

				List<String> invalidTests = new ArrayList<String>();
				//compara o resultado da execucao duas vezes no source
				if (sourceResult2.exists()) {
					Document srcDoc2 = docBuilder.parse(sourceResult2);
					invalidTests.addAll(getInvalidTests(srcDoc, srcDoc2));
					
					if(sourceResult3.exists()){
						Document srcDoc3 = docBuilder.parse(sourceResult3);
						
						invalidTests.addAll(getInvalidTests(srcDoc, srcDoc3));
						invalidTests.addAll(getInvalidTests(srcDoc2, srcDoc3));
					}
				}
				
				//fim da comparacao

				sameBehavior = !hasChanges(srcDoc, tgtDoc, invalidTests) && sameBehavior;

				result.setSameBehavior(sameBehavior);
				
				if (!sameBehavior) {
					result.setChanges(result.getChanges() + "\n" + getChanges(srcDoc, tgtDoc, invalidTests));
				}

				result.setGenratedTests(result.getGenratedTests() + Integer.parseInt(testsTarget));
				result.setSourceErrors(result.getSourceErrors() + Integer.parseInt(erros));
				result.setSourceFailures(result.getSourceFailures() + Integer.parseInt(failures));
				result.setTargetErrors(result.getTargetErrors() + Integer.parseInt(errosTarget));
				result.setTargetFailures(result.getTargetFailures() + Integer.parseInt(failuresTarget));

			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return result;

	}

	private static String getChanges(Document source, Document target, List<String> invalidTests) {
		StringBuilder changes = new StringBuilder();

		Map<String, TestCaseState> sourceMap = buildStateMap(source);
		Map<String, TestCaseState> targetMap = buildStateMap(target);

		for (String key : sourceMap.keySet()) {
			if (invalidTests.contains(key))
				continue;
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

	private static boolean hasChanges(Document source, Document target, List<String> invalidTests) {
		Map<String, TestCaseState> sourceMap = buildStateMap(source);
		Map<String, TestCaseState> targetMap = buildStateMap(target);

		if (sourceMap.size() != targetMap.size()) {
			return true;
		}

		for (String key : sourceMap.keySet()) {
			if (invalidTests.contains(key))
				continue;

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

	public static List<String> getInvalidTests(Document source, Document target) {
		List<String> result = new ArrayList<String>();

		Map<String, TestCaseState> sourceMap = buildStateMap(source);
		Map<String, TestCaseState> targetMap = buildStateMap(target);

		for (String key : sourceMap.keySet()) {
			TestCaseState sourceState = sourceMap.get(key);

			TestCaseState targetState = targetMap.get(key);

			if (sourceState != targetState) {
				result.add(key);
			}
		}

		return result;
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

}
