package br.edu.ufcg.saferefactor.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.ufcg.saferefactor.core.Saferefactor;

/*
 * Author: Gustavo Soares
 * Tests using the subjects presented in the paper Making program refactoring safer (IEEE Software 2010)
 */
public class IEEESoftwareTest {
	

	@Test
	public void test1() {
		String source = "files/ieeesoftware/JHD_Original_Version/";
		String target = "files/ieeesoftware/JHotDraw_OO/";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "lib");
		assertEquals(false, sr.isRefactoring("90", true));
	}
	
//	@Test
//	public void test1() {
//		String source = "/Users/gustavo/Downloads/Archive/PorgramTarget";
//		String target = "/Users/gustavo/Downloads/Archive/ProgramTarget";
//		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
//		assertEquals(false, sr.isRefactoring("20", true));
//	}
//	
//	
//	@Test
//	public void test2() {
//		String source = "/Users/gustavo/workspaces/aspects/prevayler-non-opt";
//		String target = "/Users/gustavo/workspaces/aspects/prevayler-target";
//		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "lib");
//		assertEquals(false, sr.isRefactoring("10", true));
//	}
//	
//	@Test
//	public void test3() {
//		String source = "/Users/gustavo/workspaces/aspects/jspider-non-opt";
//		String target = "/Users/gustavo/workspaces/aspects/jspider-opt";
//		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "lib");
//		assertEquals(false, sr.isRefactoring("90", true));
//	}
//	
//	@Test
//	public void test4() {
//		String source = "/Users/gustavo/workspaces/aspects/jaccounting-non-opt";
//		String target = "/Users/gustavo/workspaces/aspects/jaccounting-opt";
//		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "lib");
//		assertEquals(false, sr.isRefactoring("90", true));
//	}
//	
//	@Test
//	public void test5() {
//		String source = "/Users/gustavo/workspaces/aspects/example2source";
//		String target = "/Users/gustavo/workspaces/aspects/example2target";
//		Saferefactor sr = new Saferefactor(source, target, "", "", "");
//		assertEquals(false, sr.isRefactoring("1", true));
//	}
//	
//	@Test
//	public void test6() {
//		String source = "/Users/gustavo/workspaces/aspects/example7source";
//		String target = "/Users/gustavo/workspaces/aspects/example7target";
//		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
//		assertEquals(false, sr.isRefactoring("1", true));
//	}
//	
//	
//	@Test
//	public void test7() {
//		String source = "/Users/gustavo/workspaces/aspects/example8source";
//		String target = "/Users/gustavo/workspaces/aspects/example8target";
//		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
//		assertEquals(false, sr.isRefactoring("10", true));
//	}
//	
//	@Test
//	public void test8() {
//		String source = "/Users/gustavo/workspaces/aspects/ajhotdraw-v1";
//		String target = "/Users/gustavo/workspaces/aspects/ajhotdraw-v4";
//		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "lib");
//		assertEquals(false, sr.isRefactoring("120", true));
//	}
//	
//	@Test
//	public void test9() {
//		String source = "/Users/gustavo/workspaces/aspects/source";
//		String target = "/Users/gustavo/workspaces/aspects/target";
//		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
//		assertEquals(false, sr.isRefactoring("1", true));
//	}
//	
//	@Test
//	public void test10() {
//		String source = "/Users/gustavo/workspaces/aspects/JHD_Original_version";
//		String target = "/Users/gustavo/workspaces/aspects/jhd_aspects_branch";
//		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "lib");
//		assertEquals(false, sr.isRefactoring("90", true));
//	}
//	
//	@Test
//	public void test11() {
//		String source = "/Users/gustavo/workspaces/aspects/CheckstylePluginSource";
//		String target = "/Users/gustavo/workspaces/aspects/CheckstylePluginAO";
//		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "lib");
//		assertEquals(true, sr.isRefactoring("90", true));
//	}
//	
//	@Test
//	public void test12() {
//		String source = "/Users/gustavo/workspaces/aspects/CheckstylePluginOO";
//		String target = "/Users/gustavo/workspaces/aspects/CheckstylePluginAO";
//		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "lib");
//		assertEquals(false, sr.isRefactoring("90", true));
//	}
//	
//	
//	@Test
//	public void test13() {
//		String source = "/Users/gustavo/Documents/workspace_experientos/CheckstylePluginSource";
//		String target = "/Users/gustavo/Documents/workspace_experientos/CheckstylePlugin";
//		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "lib");
//		assertEquals(false, sr.isRefactoring("90", true));
//	}
//	
//	@Test
//	public void test16() {
//		String source = "/Users/gustavo/workspaces/aspects/JHotDraw_OO";
//		String target = "/Users/gustavo/workspaces/aspects/jhd_aspects_branch";
//		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "lib");
//		assertEquals(false, sr.isRefactoring("90", true));
//	}
//	
//	@Test
//	public void test17() {
//		
//		Saferefactor s = new Saferefactor("", "", "", "", "");
//		Map<String, SClass> mapClasses2 = s.getAnalyzer().mapClasses2("/Users/gustavo/workspaces/aspects/saferefactoraj/test/foo/");
//		System.out.println(mapClasses2);
//	}
//	
//	@Test
//	public void test18() {
//		String source = "/Users/gustavo/Downloads/tetris/Tetris-LayAspects";
//		String target = "/Users/gustavo/Downloads/tetris/Tetris-NewIdiom";
//		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "lib");
//		assertEquals(false, sr.isRefactoring("90", true));
//	}
//	
//	@Test
//	public void test19() {
//		String source = "/Users/gustavo/Downloads/berkeleydb/BerkeleyDB-Edicts";
//		String target = "/Users/gustavo/Downloads/berkeleydb/BerkeleyDB-LayAspects";
//		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "lib");
//		assertEquals(false, sr.isRefactoring("30", true));
//	}
//	
//	@Test
//	public void test20() {
//		String source = "/Users/gustavo/Downloads/argouml/argouml-app";
//		String target = "/Users/gustavo/Downloads/argouml/argouml-app-edicts";
//		Saferefactor sr = new Saferefactor(source, target, "build-eclipse", "src", "lib");
//		assertEquals(false, sr.isRefactoring("30", true));
//	}
	
	 
	

}
