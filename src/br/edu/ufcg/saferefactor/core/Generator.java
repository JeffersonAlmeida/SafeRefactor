package br.edu.ufcg.saferefactor.core;

import java.io.File;
import java.util.List;


import br.edu.ufcg.saferefactor.core.util.Constants;
import br.edu.ufcg.saferefactor.core.util.FileUtil;




import randoop.main.Main;
 
public class Generator {

	public static void generateTests(String methodList, String timeout) {

		Main main = new Main();
		String[] argsRandoop = { "gentests", "--methodlist=" + methodList,
				"--timelimit=" + timeout, "--log=filewriter",
				"--junit-output-dir=" + Constants.TEST };
		main.nonStaticMain(argsRandoop);
	}
	
	/*
	 * Gera os testes usando o randoop
	 * Parameters:
	 * methodlist
	 * timeout
	 */
	public static void main(String[] args) {

		String methodlist = args[0];
		String timeout = args[1];

		generateTests(methodlist, timeout);
		
	}

}
