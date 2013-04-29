package br.edu.ufcg.saferefactor.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.io.File;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import br.edu.ufcg.saferefactor.core.Analyzer;
import br.edu.ufcg.saferefactor.core.Criteria;
import br.edu.ufcg.saferefactor.core.ast.SClass;
import br.edu.ufcg.saferefactor.core.ast.SMethod;

public class AnalysisTest {

	private Analyzer a;

	@Before
	public void setUp() {
		String source = "files/subject14source/";
		String target = "files/subject14target/";
		File f1 = new File(source);
		File f2 = new File(target);
		a = new Analyzer();	
	}

	@Test
	public void testGenerateMethodListFile() {
		File f = a.generateMethodListFile(Criteria.ONLY_COMMON_METHODS_SUBSET_DEFAULT);
		assertTrue(f.exists());
	}
	
	@Test
	public void testAnalyzeChange() {
		
		a.analyzeChange(Criteria.ONLY_COMMON_METHODS_SUBSET_DEFAULT);
		assertEquals(3, a.getCommonConstructors().size());
		assertEquals(5, a.getCommonMethods().size());
		
		for (SMethod method : a.getCommonMethods()) {
			System.out.println(method);
		}
		
	}

	@Test
	public void testListSourceAndTargetClasses() {
		Map<String, SClass> listSource = a.mapSourceClasses();
		assertEquals(3, listSource.values().size());
		
		System.out.println("SOURCE CLASSES");
		for (SClass sc : listSource.values()) {
			System.out.println(sc);			
		}
		
		System.out.println("TARGET CLASSES");
		Map<String, SClass> listTarget = a.mapTargetClasses();
		assertEquals(3, listTarget.values().size());
		for (SClass sc : listTarget.values()) {
			System.out.println(sc);			
		}
				
	}
	
	

}
