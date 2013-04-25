package br.edu.ufcg.saferefactor.core.util;



public class Constants {

	public static final String FILE_SEPARATOR = System.getProperty("file.separator");
	public static final String ARQUIVO_CLASSES= FileUtil.getTempPath()+"/classes.txt";
	public static final String ARQUIVO_BASE = FileUtil.getTempPath()+"/arquivobase.txt";
	public static final String TEMP = System.getProperty("java.io.tmpdir") + "/safeRefactorAJ";
	public static final String ARQUIVO_INTERSECAO = TEMP + FILE_SEPARATOR + "intersection.txt";
	public static final String TEST = TEMP + "/tests";
	public static final String TESTBIN = TEMP + "/tests/bin";
	public static final String TESTSRC = TEMP + "/tests/source";
	public static final String TESTSRC2 = TEMP + "/tests/source2";
	public static final String TESTSRC3 = TEMP + "/tests/source3";
	public static final String TESTTGT = TEMP + "/tests/target";
	public static final String EVOSUITE_TESTS = "/home/jefferson/workspace/saferefactoraj/evosuite-tests";
	public static final String EVOSUITE_COMPILED_TESTS = "/home/jefferson/workspace/saferefactoraj/evosuite-compiled-tests";
	
}
 