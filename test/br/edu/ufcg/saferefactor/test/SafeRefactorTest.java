package br.edu.ufcg.saferefactor.test;

import static org.junit.Assert.*;
import org.junit.Test;
import br.edu.ufcg.saferefactor.core.Criteria;
import br.edu.ufcg.saferefactor.core.Saferefactor;

public class SafeRefactorTest {

	@Test
	public void test1() {
		String source = "/home/jefferson/Desktop/workspace/Bank1.0/";
		String target = "/home/jefferson/Desktop/workspace/Bank1.1/";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "lib");
		sr.getPinfo().setCriteria(Criteria.ONLY_COMMON_METHODS_SUBSET_DEFAULT);
		sr.getPinfo().setMaxTestsPerMethod(2);
		sr.getPinfo().setClassesString("org.bank.account.Account");
		sr.isRefactoring("60", true, "evosuite");
		//assertEquals(false, sr.isRefactoring("30", true));
	}
	
	/*@Test
	public void test2() {
		String source = "/Users/gustavo/Downloads/argouml/argouml-app";
		String target = "/Users/gustavo/Downloads/argouml/argouml-app-edicts";
		Saferefactor sr = new Saferefactor(source, target, "build/classes", "src", "lib");
		assertEquals(false, sr.isRefactoring("10", true));
	}*/

}
