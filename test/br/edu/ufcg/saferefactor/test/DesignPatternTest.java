package br.edu.ufcg.saferefactor.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.ufcg.saferefactor.core.Saferefactor;


public class DesignPatternTest {
	
	private String timeout = "2";
	@Test
	public void test0() {
		String source = "/Users/gustavo/workspaces/aspects/visitorOO";
		String target = "/Users/gustavo/workspaces/aspects/visitorAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(false, sr.isRefactoring(timeout, true));
	}
	
	
	@Test
	public void test1() {
		String source = "/Users/gustavo/workspaces/aspects/mediatorOO";
		String target = "/Users/gustavo/workspaces/aspects/mediatorAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(false, sr.isRefactoring(timeout, true));
	}
	
	@Test
	public void test2() {
		String source = "/Users/gustavo/workspaces/aspects/adapterOO";
		String target = "/Users/gustavo/workspaces/aspects/adapterAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(timeout, true));
	}
	
	@Test
	public void test3() {
		String source = "/Users/gustavo/workspaces/aspects/bridgeOO";
		String target = "/Users/gustavo/workspaces/aspects/bridgeAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(timeout, true));
	}
	
	@Test
	public void test4() {
		String source = "/Users/gustavo/workspaces/aspects/builderOO";
		String target = "/Users/gustavo/workspaces/aspects/builderAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(timeout, true));
	}
	
	@Test
	public void test5() {
		String source = "/Users/gustavo/workspaces/aspects/chainOO";
		String target = "/Users/gustavo/workspaces/aspects/chainAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(timeout, true));
	}
	
	@Test
	public void test6() {
		String source = "/Users/gustavo/workspaces/aspects/commandOO";
		String target = "/Users/gustavo/workspaces/aspects/commandAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(timeout, true));
	}
	
	@Test
	public void test7() {
		String source = "/Users/gustavo/workspaces/aspects/facadeOO";
		String target = "/Users/gustavo/workspaces/aspects/facadeAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(timeout, true));
	}
	
	@Test
	public void test8() {
		String source = "/Users/gustavo/workspaces/aspects/decoratorOO";
		String target = "/Users/gustavo/workspaces/aspects/decoratorAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(timeout, true));
	}
	
	@Test
	public void test9() {
		String source = "/Users/gustavo/workspaces/aspects/abstractfactoryOO";
		String target = "/Users/gustavo/workspaces/aspects/abstractfactoryAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(timeout, true));
	}
	
	@Test
	public void test10() {
		String source = "/Users/gustavo/workspaces/aspects/factorymethodOO";
		String target = "/Users/gustavo/workspaces/aspects/factorymethodAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(timeout, true));
	}
	
	@Test
	public void test11() {
		String source = "/Users/gustavo/workspaces/aspects/flyweightOO";
		String target = "/Users/gustavo/workspaces/aspects/flyweightAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(timeout, true));
	}
	
	@Test
	public void test12() {
		String source = "/Users/gustavo/workspaces/aspects/interpreterOO";
		String target = "/Users/gustavo/workspaces/aspects/interpreterAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(timeout, true));
	}
	
	@Test
	public void test13() {
		String source = "/Users/gustavo/workspaces/aspects/iteratorOO";
		String target = "/Users/gustavo/workspaces/aspects/iteratorAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(timeout, true));
	}
	
	@Test
	public void test14() {
		String source = "/Users/gustavo/workspaces/aspects/mementoOO";
		String target = "/Users/gustavo/workspaces/aspects/mementoAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(timeout, true));
	}
	
	@Test
	public void test15() {
		String source = "/Users/gustavo/workspaces/aspects/prototypeOO";
		String target = "/Users/gustavo/workspaces/aspects/prototypeAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(false, sr.isRefactoring(timeout, true));
	}
	
	@Test
	public void test16() {
		String source = "/Users/gustavo/workspaces/aspects/proxyOO";
		String target = "/Users/gustavo/workspaces/aspects/proxyAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(timeout, true));
	}
	
	@Test
	public void test17() {
		String source = "/Users/gustavo/workspaces/aspects/singletonOO";
		String target = "/Users/gustavo/workspaces/aspects/singletonAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(timeout, true));
	}
	
	@Test
	public void test18() {
		String source = "/Users/gustavo/workspaces/aspects/stateOO";
		String target = "/Users/gustavo/workspaces/aspects/stateAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(false, sr.isRefactoring(timeout, false));
	}
	
	@Test
	public void test19() {
		String source = "/Users/gustavo/workspaces/aspects/strategyOO";
		String target = "/Users/gustavo/workspaces/aspects/strategyAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(timeout, true));
	}
	
	@Test
	public void test20() {
		String source = "/Users/gustavo/workspaces/aspects/templateOO";
		String target = "/Users/gustavo/workspaces/aspects/templateAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(false, sr.isRefactoring(timeout, false));
	}
	
	@Test
	public void test21() {
		String source = "/Users/gustavo/workspaces/aspects/observerOO";
		String target = "/Users/gustavo/workspaces/aspects/observerAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(timeout, false));
	}
	
	@Test
	public void test22() {
		String source = "/Users/gustavo/workspaces/aspects/compositeOO";
		String target = "/Users/gustavo/workspaces/aspects/compositeAO";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "");
		assertEquals(true, sr.isRefactoring(timeout, false));
	}
}
