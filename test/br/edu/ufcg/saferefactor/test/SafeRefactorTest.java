package br.edu.ufcg.saferefactor.test;

import static org.junit.Assert.*;
import org.junit.Test;
import br.edu.ufcg.saferefactor.core.Criteria;
import br.edu.ufcg.saferefactor.core.ProjectInfo;
import br.edu.ufcg.saferefactor.core.Saferefactor;

public class SafeRefactorTest {

	@Test
	public void test1() {
		String source = "/home/jefferson/Desktop/workspace/Bank2.0/";
		String target = "/home/jefferson/Desktop/workspace/Bank2.1/";
		String classes = "org.bank.facade.Facade";
		int maxTests = 2;
		Criteria criteria = Criteria.ONLY_COMMON_METHODS_SUBSET_DEFAULT;
		ProjectInfo info = new ProjectInfo(source,target,"bin", "src", "lib", classes, maxTests, criteria );
		Saferefactor sr = new Saferefactor(info);
		sr.isRefactoring("60", true, "randoop");
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
