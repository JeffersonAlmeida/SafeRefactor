package br.edu.ufcg.saferefactor.test;

import java.net.MalformedURLException;

import org.junit.Test;
import br.edu.ufcg.saferefactor.core.Analyzer;
import br.edu.ufcg.saferefactor.core.Saferefactor;

public class SafeRefactorTest {

	@Test
	public void test1() throws MalformedURLException {

		String clazz = "org.bank.account.Account";
		Analyzer analyzer = new Analyzer();
		Saferefactor sr = new Saferefactor(clazz, "/home/jefferson/workspace/ferramentaLPSSM/inputFiles/bank1.0.properties");
		analyzer.setInput(sr.getInput());
		sr.setAnalyzer(analyzer);
		sr.getAnalyzer().setImpactedClasses(sr.getIc());
		sr.isRefactoring("60", true, "evosuite");
		//assertEquals(false, sr.isRefactoring("30", true, "randoop"));
	}
}
