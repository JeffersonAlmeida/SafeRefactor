package br.edu.ufcg.saferefactor.test;

import org.junit.Test;
import org.sr.ic.ImpactedClasses;
import org.sr.input.FilePropertiesObject;
import org.sr.input.FilePropertiesReader;

import br.edu.ufcg.saferefactor.core.Analyzer;
import br.edu.ufcg.saferefactor.core.Saferefactor;

public class SafeRefactorTest {

	@Test
	public void test1() {

		String clazz = "org.bank.account.Account";
		Analyzer analyzer = new Analyzer();
		Saferefactor sr = new Saferefactor(clazz, "/home/jefferson/workspace/ferramentaLPSSM/inputFiles/bank1.0.properties");
		analyzer.setInput(sr.getInput());
		sr.setAnalyzer(analyzer);
		sr.getAnalyzer().setImpactedClasses(sr.getIc());
		sr.isRefactoring("60", true, "randoop");
		//assertEquals(false, sr.isRefactoring("30", true, "randoop"));
	}
}
