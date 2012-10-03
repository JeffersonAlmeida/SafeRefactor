package br.edu.ufcg.saferefactor.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.ufcg.saferefactor.core.Saferefactor;


/**
 * @author gustavo
 * Test cases of the paper Making aspect oriented refactoring safer in SBLP 2011.
 *
 */
public class SBLP2011Test {
	
	private static final String TIMEOUT_CATALOG = "2";
	private static final String TIMEOUT_PATTERNS = "2";
	private static final String TIMEOUT_REAL = "60";
	
	
	// BEGIN: 8 test cases with incorrect eclipse transformations to AO programs
	@Test
	public void test1() {
		String source = "files/sblp2011/catalog/subject1source";
		String target = "files/sblp2011/catalog/subject1target";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(false, sr.isRefactoring(TIMEOUT_CATALOG, true));
	}
	
	@Test
	public void test2() {
		String source = "files/sblp2011/catalog/subject2source";
		String target = "files/sblp2011/catalog/subject2target";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(false, sr.isRefactoring(TIMEOUT_CATALOG, true));
	}
	
	@Test
	public void test3() {
		String source = "files/sblp2011/catalog/subject3source";
		String target = "files/sblp2011/catalog/subject3target";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(false, sr.isRefactoring(TIMEOUT_CATALOG, true));
	}
	
	@Test
	public void test4() {
		String source = "files/sblp2011/catalog/subject5source";
		String target = "files/sblp2011/catalog/subject5target";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(false, sr.isRefactoring(TIMEOUT_CATALOG, true));
	}
	
	@Test
	public void test5() {
		String source = "files/sblp2011/catalog/subject6source";
		String target = "files/sblp2011/catalog/subject6target";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(false, sr.isRefactoring(TIMEOUT_CATALOG, true));
	}
	
	@Test
	public void test6() {
		String source = "files/sblp2011/catalog/subject7source";
		String target = "files/sblp2011/catalog/subject7target";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(false, sr.isRefactoring(TIMEOUT_CATALOG, true));
	}
	
	@Test
	public void test7() {
		String source = "files/sblp2011/catalog/subject8source";
		String target = "files/sblp2011/catalog/subject8target";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(false, sr.isRefactoring(TIMEOUT_CATALOG, true));
	}
	
	@Test
	public void test8() {
		String source = "files/sblp2011/catalog/subject9source";
		String target = "files/sblp2011/catalog/subject9target";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(false, sr.isRefactoring(TIMEOUT_CATALOG, true));
	}
	// END: 8 test cases with incorrect eclipse transformations to AO programs
	
	//BEGIN: 4 test cases with real transformations 
	@Test
	public void test9() {
		String source = "files/sblp2011/real/JHD_Original_Version";
		String target = "files/sblp2011/real/jhd_aspects_branch";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "lib");
		assertEquals(false, sr.isRefactoring(TIMEOUT_REAL, true));
	}
	
	@Test
	public void test10() {
		String source = "files/sblp2011/real/JHotDraw_OO";
		String target = "files/sblp2011/real/jhd_aspects_branch";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "lib");
		assertEquals(false, sr.isRefactoring(TIMEOUT_REAL, false));
	}
	
	
	//Unit tests 11 and 12 (CheckstylePlugin) with problems since 31/01/2011
//	@Test
//	public void test11() {
//		String source = "/Users/gustavo/workspaces/aspects/CheckstylePluginSource";
//		String target = "/Users/gustavo/workspaces/aspects/CheckstylePluginAO";
//		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "lib");
//		assertEquals(true, sr.isRefactoring(TIMEOUT_REAL, false));
//	}
//	
//	@Test
//	public void test12() {
//		String source = "files/sblp2011/real/CheckstylePluginOO";
//		String target = "files/sblp2011/real/CheckstylePluginAO";
//		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "lib");
//		assertEquals(true, sr.isRefactoring(TIMEOUT_REAL, false));
//	}
	
	
	//END: 4 test cases with real transformations 
	
	//BEGIN: 23 test cases with design patterns implemented in AO and OO  
	@Test
	public void test13() {
		String source = "files/sblp2011/patterns/visitorOO";
		String target = "files/sblp2011/patterns/visitorAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(false, sr.isRefactoring(TIMEOUT_PATTERNS, true));
	}
	
	
	@Test
	public void test14() {
		String source = "files/sblp2011/patterns/mediatorOO";
		String target = "files/sblp2011/patterns/mediatorAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(false, sr.isRefactoring(TIMEOUT_PATTERNS, true));
	}
	
	@Test
	public void test15() {
		String source = "files/sblp2011/patterns/adapterOO";
		String target = "files/sblp2011/patterns/adapterAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(TIMEOUT_PATTERNS, true));
	}
	
	@Test
	public void test16() {
		String source = "files/sblp2011/patterns/bridgeOO";
		String target = "files/sblp2011/patterns/bridgeAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(TIMEOUT_PATTERNS, true));
	}
	
	@Test
	public void test17() {
		String source = "files/sblp2011/patterns/builderOO";
		String target = "files/sblp2011/patterns/builderAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(TIMEOUT_PATTERNS, true));
	}
	
	@Test
	public void test18() {
		String source = "files/sblp2011/patterns/chainOO";
		String target = "files/sblp2011/patterns/chainAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(TIMEOUT_PATTERNS, true));
	}
	
	@Test
	public void test19() {
		String source = "files/sblp2011/patterns/commandOO";
		String target = "files/sblp2011/patterns/commandAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(TIMEOUT_PATTERNS, true));
	}
	
	@Test
	public void test20() {
		String source = "files/sblp2011/patterns/facadeOO";
		String target = "files/sblp2011/patterns/facadeAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(TIMEOUT_PATTERNS, true));
	}
	
	@Test
	public void test21() {
		String source = "files/sblp2011/patterns/decoratorOO";
		String target = "files/sblp2011/patterns/decoratorAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(TIMEOUT_PATTERNS, true));
	}
	
	@Test
	public void test22() {
		String source = "files/sblp2011/patterns/abstractfactoryOO";
		String target = "files/sblp2011/patterns/abstractfactoryAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(TIMEOUT_PATTERNS, true));
	}
	
	@Test
	public void test23() {
		String source = "files/sblp2011/patterns/factorymethodOO";
		String target = "files/sblp2011/patterns/factorymethodAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(TIMEOUT_PATTERNS, true));
	}
	
	@Test
	public void test24() {
		String source = "files/sblp2011/patterns/flyweightOO";
		String target = "files/sblp2011/patterns/flyweightAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(TIMEOUT_PATTERNS, true));
	}
	
	@Test
	public void test25() {
		String source = "files/sblp2011/patterns/interpreterOO";
		String target = "files/sblp2011/patterns/interpreterAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(TIMEOUT_PATTERNS, true));
	}
	
	@Test
	public void test26() {
		String source = "files/sblp2011/patterns/iteratorOO";
		String target = "files/sblp2011/patterns/iteratorAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(TIMEOUT_PATTERNS, true));
	}
	
	@Test
	public void test27() {
		String source = "files/sblp2011/patterns/mementoOO";
		String target = "files/sblp2011/patterns/mementoAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(TIMEOUT_PATTERNS, true));
	}
	
	@Test
	public void test28() {
		String source = "files/sblp2011/patterns/prototypeOO";
		String target = "files/sblp2011/patterns/prototypeAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(false, sr.isRefactoring(TIMEOUT_PATTERNS, true));
	}
	
	@Test
	public void test29() {
		String source = "files/sblp2011/patterns/proxyOO";
		String target = "files/sblp2011/patterns/proxyAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(TIMEOUT_PATTERNS, true));
	}
	
	@Test
	public void test30() {
		String source = "files/sblp2011/patterns/singletonOO";
		String target = "files/sblp2011/patterns/singletonAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(TIMEOUT_PATTERNS, true));
	}
	
	@Test
	public void test31() {
		String source = "files/sblp2011/patterns/stateOO";
		String target = "files/sblp2011/patterns/stateAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(false, sr.isRefactoring(TIMEOUT_PATTERNS, false));
	}
	
	@Test
	public void test32() {
		String source = "files/sblp2011/patterns/strategyOO";
		String target = "files/sblp2011/patterns/strategyAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(TIMEOUT_PATTERNS, true));
	}
	
	@Test
	public void test33() {
		String source = "files/sblp2011/patterns/templateOO";
		String target = "files/sblp2011/patterns/templateAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(false, sr.isRefactoring(TIMEOUT_PATTERNS, false));
	}
	
	@Test
	public void test34() {
		String source = "files/sblp2011/patterns/observerOO";
		String target = "files/sblp2011/patterns/observerAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(TIMEOUT_PATTERNS, false));
	}
	
	@Test
	public void test35() {
		String source = "files/sblp2011/patterns/compositeOO";
		String target = "files/sblp2011/patterns/compositeAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(TIMEOUT_PATTERNS, false));
	}
	//END: 23 test cases with design patterns implemented in AO and OO 
	
	//BEGIN: 2 test cases with JML programs compiled with AJMLC compiler
	@Test
	public void test36() {
		String source = "files/sblp2011/compiler/jaccounting-non-opt";
		String target = "files/sblp2011/compiler/jaccounting-opt";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "lib");
		assertEquals(false, sr.isRefactoring(TIMEOUT_REAL, false));
	}
	@Test
	public void test37() {
		String source = "files/sblp2011/compiler/jspider-non-opt";
		String target = "files/sblp2011/compiler/jspider-opt";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "lib");
		assertEquals(false, sr.isRefactoring(TIMEOUT_REAL, false));
	}
	//END: 2 test cases with JML programs compiled with AJMLC compiler

}
