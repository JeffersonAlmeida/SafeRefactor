package br.edu.ufcg.saferefactor.test;

import org.junit.Test;
import org.sr.ic.ImpactedClasses;
import org.sr.input.FilePropertiesObject;
import org.sr.input.FilePropertiesReader;
import br.edu.ufcg.saferefactor.core.Saferefactor;

public class SafeRefactorTest {

	@Test
	public void test1() {

		ImpactedClasses impactedClasses = new ImpactedClasses("org.bank.account.Account");
		FilePropertiesReader reader = new FilePropertiesReader("/home/jefferson/workspace/ferramentaLPSSM/inputFiles/bank1.0.properties");
		FilePropertiesObject in = reader.getPropertiesObject();
		Saferefactor sr = new Saferefactor(impactedClasses, in);
		sr.isRefactoring("60", true, "evosuite");
		//assertEquals(false, sr.isRefactoring("30", true, "randoop"));
	}
}
