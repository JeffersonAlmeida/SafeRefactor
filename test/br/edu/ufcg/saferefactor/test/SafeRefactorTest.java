package br.edu.ufcg.saferefactor.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import br.edu.ufcg.saferefactor.core.Saferefactor;
import br.edu.ufcg.saferefactor.core.util.Constants;

public class SafeRefactorTest {

	@Test
	public void test1() throws IOException {
		String source = "C:/WorkspaceSPL/ProjectWithoutRefactoring";
		String target = "C:/WorkspaceSPL/ProjectWithRefactoring";
		Saferefactor sr = new Saferefactor(source, target, "bin", "src", "lib");
		sr.isRefactoring("30", true);
		/*String timeout = "4";
		String[] argsMain = {source,target ,sr.getPinfo().getBinDir(), sr.getPinfo().getSrcDir(), sr.getPinfo().getLib(),timeout, null };
		Saferefactor.main(argsMain);*/
		/*String command = "cmd /c java -classpath C:\\WorkspaceSPL\\ProjectWithoutRefactoring\\bin br.cin.core.Main.main";
		Process proc = Runtime.getRuntime().exec(command);*/
		//Process proc = Runtime.getRuntime().exec("java ");
		//sr.generateTests(source, target, sr.getPinfo().getBinDir(), sr.getPinfo().getSrcDir(), sr.getPinfo().getLib(), sr.getPinfo().getClassesString(), sr.getPinfo().getMaxTestsPerMethod(), sr.getPinfo().getCriteria());
		//sr.isRefactoring("30", true);
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


/**
cmd /c java -classpath D:\\documentos\\Msc\\SE\\workspace\\saferefactoraj\\ bin/br.edu.ufcg.saferefactor.core.Saferefactor "C:/WorkspaceSPL/ProjectWithoutRefactoring" "C:/WorkspaceSPL/ProjectWithRefactoring" "bin" "src" "lib" "10"   
*/