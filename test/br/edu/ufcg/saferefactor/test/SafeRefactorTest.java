package br.edu.ufcg.saferefactor.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.ufcg.saferefactor.core.Saferefactor;

public class SafeRefactorTest {

	@Test
	public void test1() {
		String source = "C:/WorkspaceSPL/ProjectWithoutRefactoring";
		String target = "C:/WorkspaceSPL/ProjectWithRefactoring";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "lib");
		sr.isRefactoring("30", true);
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
