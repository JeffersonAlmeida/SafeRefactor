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

		ImpactedClasses impactedClasses = new ImpactedClasses("org.bank.account.Account");
		FilePropertiesReader reader = new FilePropertiesReader("/home/jefferson/workspace/ferramentaLPSSM/inputFiles/bank1.0.properties");
		FilePropertiesObject in = reader.getPropertiesObject();
		Analyzer analyzer = new Analyzer();
		analyzer.setInput(in);
		analyzer.setImpactedClasses(impactedClasses);
		Saferefactor sr = new Saferefactor(impactedClasses, in);
		sr.setAnalyzer(analyzer);
		
		sr.isRefactoring("60", true, "randoop");
		//assertEquals(false, sr.isRefactoring("30", true, "randoop"));
	}
}
