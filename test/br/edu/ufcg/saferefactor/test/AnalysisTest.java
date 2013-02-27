package br.edu.ufcg.saferefactor.test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Member;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import br.edu.ufcg.saferefactor.core.Analyzer;
import br.edu.ufcg.saferefactor.core.Criteria;
import br.edu.ufcg.saferefactor.core.ProjectInfo;
import br.edu.ufcg.saferefactor.core.ast.SClass;
import br.edu.ufcg.saferefactor.core.ast.SMethod;




import static org.junit.Assert.*;

public class AnalysisTest {

	private Analyzer a;

	@Before
	public void setUp() {
		String source = "files/subject14source/";
		String target = "files/subject14target/";
		File f1 = new File(source);
		File f2 = new File(target);
		ProjectInfo pinfo = new ProjectInfo(f1.getAbsolutePath(), f2.getAbsolutePath(), "bin", "src", "");
		a = new Analyzer(pinfo);	
	}

	@Test
	public void testGenerateMethodListFile() throws IOException {
		File f = a.generateMethodListFile(Criteria.ONLY_COMMON_METHODS_SUBSET_DEFAULT);
		assertTrue(f.exists());
	}
	
	@Test
	public void testAnalyzeChange() throws IOException {
		
		a.analyzeChange(Criteria.ONLY_COMMON_METHODS_SUBSET_DEFAULT);
		assertEquals(3, a.getCommonConstructors().size());
		assertEquals(5, a.getCommonMethods().size());
		
		for (SMethod method : a.getCommonMethods()) {
			System.out.println(method);
		}
		
	}

	@Test
	public void testListSourceAndTargetClasses() throws IOException {
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
