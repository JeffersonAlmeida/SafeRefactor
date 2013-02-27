package br.edu.ufcg.saferefactor.core;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;

import randoop.main.Main;
import randoop.util.Command;
import br.edu.ufcg.saferefactor.core.util.Constants;
import br.edu.ufcg.saferefactor.core.util.FileUtil;

public class Saferefactor {

	protected ProjectInfo pinfo;
	protected Analyzer analyzer;

	private ResultComparator comparator;

	private long start;

	public Saferefactor(String source, String target, String bin, String src, String lib) {
		start = System.currentTimeMillis();
		pinfo = new ProjectInfo(source, target, bin, src, lib);
		analyzer = new Analyzer(pinfo);
		this.comparator = new ResultComparator(Constants.TESTSRC, Constants.TESTTGT, Constants.TESTSRC2, Constants.TESTSRC3);
	}

	public Saferefactor(String source, String target, String bin, String src, String lib, String classes, int maxTests, Criteria criteria) {
		start = System.currentTimeMillis();
		pinfo = new ProjectInfo(source, target, bin, src, lib, classes, maxTests, criteria);
		analyzer = new Analyzer(pinfo);
		this.comparator = new ResultComparator(Constants.TESTSRC, Constants.TESTTGT, Constants.TESTSRC2, Constants.TESTSRC3);
	}

	public Analyzer getAnalyzer() {
		return analyzer;
	}

	public void setAnalyzer(Analyzer analyzer) {
		this.analyzer = analyzer;
	}

	public boolean isRefactoring(String timeout, boolean printReport) {

		FileUtil.createFolders();
		
		/*Finds a resource with a given name.*/
		URL file = this.getClass().getResource("/build.xml");

		System.out.println("\n\nANT BUILD DIRECTORY: " + file.getPath());
		
		/* Central representation of an Ant project. */
		Project p = new Project();

		/* Set a property. Any existing property of the same name is overwritten, unless it is a user property. */
		
		/*      
        <arg value="${source}" /> -
		<arg value="${target}" /> - 
		<arg value="${bin}" /> - 
		<arg value="${src}" /> - 
		<arg value="${lib}" />
		<arg value="${timeout}" /> - 
		<arg value="${classes}" />
		<arg value="${maxTests}" />
		<arg value="${criteria}" />       */
		
		p.setProperty("source", pinfo.getSource());
		p.setProperty("target", pinfo.getTarget());
		p.setProperty("timeout", timeout);
		p.setProperty("bin", pinfo.getBinDir());
		p.setProperty("lib", pinfo.getLib());
		p.setProperty("src", pinfo.getSrcDir());
		p.setProperty("tests.folder", Constants.TEST);

		String classes = this.pinfo.getClassesString();

		if (classes != null) {
			/* Set a property. Any existing property of the same name is overwritten, unless it is a user property. */
			p.setProperty("classes", classes);
		}
		System.out.println("#classes pra teste: " + classes);
		int maxTestsPerMethod = this.pinfo.getMaxTestsPerMethod();

		if (maxTestsPerMethod > 0) {
			/* Set a property. Any existing property of the same name is overwritten, unless it is a user property. */
			p.setProperty("maxTests", String.valueOf(maxTestsPerMethod));
		}

		/* Set a property. Any existing property of the same name is overwritten, unless it is a user property. */
		p.setProperty("criteria", this.pinfo.getCriteria().toString());

		/* ANT LOG CONSOLE */
		DefaultLogger consoleLogger = new DefaultLogger();
		consoleLogger.setErrorPrintStream(System.err);
		consoleLogger.setOutputPrintStream(System.out);
		consoleLogger.setMessageOutputLevel(Project.MSG_INFO);
		p.addBuildListener(consoleLogger);

		/* Writes build events to a PrintStream. Currently, it only writes which targets are being executed, and any messages that get logged. */
		DefaultLogger consoleLogger2 = new DefaultLogger();
		File f = new File(Constants.TEMP + Constants.FILE_SEPARATOR + "log.txt");
		System.out.println("\n You can find ant build logs in: " + "< " + f.getAbsolutePath() + " >\n");
		
		try {
			f.createNewFile();
			FileOutputStream myFile;
			PrintStream myStream;
			myFile = new FileOutputStream(Constants.TEMP + Constants.FILE_SEPARATOR + "log.txt");
			myStream = new PrintStream(myFile);
			consoleLogger2.setErrorPrintStream(myStream);
			consoleLogger2.setOutputPrintStream(myStream);
			consoleLogger2.setMessageOutputLevel(Project.MSG_INFO);
			p.addBuildListener(consoleLogger2);
		} catch (IOException ex) {
			Logger.getLogger(Saferefactor.class.getName()).log(Level.SEVERE, null, ex);
		}

		/* Initialise ANT project.*/
		p.init();
		ProjectHelper helper = ProjectHelper.getProjectHelper();
		p.addReference("ant.projectHelper", helper);
		
		/* Parses the ANT project file, configuring the project as it goes.*/
		helper.parse(p, file);
		
		
		System.out.println("\nMax Testes: " + maxTestsPerMethod);
		System.out.println("\nTimeOut: " + timeout);
		System.out.println("\nClasses: " + classes);
		
		/* Execute default target of the project. */
		p.executeTarget(p.getDefaultTarget());

		/*REPORT */
		Report report = comparator.generateReport();

		/*print report*/
		System.out.println(" Print Report :");
		if (printReport) {
			System.out.println(report);
		}

		if (!report.isSameBehavior()) {
			System.out.println("\n\nreport changes: " + report.getChanges());
		}
		
		
		p.executeTarget("coverage");

		return report.isSameBehavior();
	}

	public static void main(String[] args) throws IOException {
		String source = args[0];
		String target = args[1];
		String bin = args[2];
		String src = args[3];
		String lib = args[4];
		String timeout = args[5];
		String classes = null;

		Criteria criteria = Criteria.ONLY_COMMON_METHODS_SUBSET_DEFAULT;

		if (args.length > 6) {
			classes = args[6];
		}

		int maxTestsPerMethods = 2;

		/*if (args.length > 7) {
			maxTestsPerMethods = Integer.valueOf(args[7]);
		}
*/
		if (args.length > 8) {
			criteria = Criteria.valueOf(args[8]);
		}
		
		Saferefactor safeRefactor = new Saferefactor(source, target, bin, src, lib, classes, maxTestsPerMethods, criteria);
		
		System.out.println("\n\nsource: " + source);
		System.out.println("target: " + target);
		System.out.println("bin: " + bin);
		System.out.println("src: " + src);
		System.out.println("lib: " + lib);
		System.out.println("classes: " + classes);
		System.out.println("maxTestsPerMethods: " + maxTestsPerMethods);
		System.out.println("criteria: " + safeRefactor.getPinfo().getCriteria()+ "\n\n");
		
		
		
		File methodList = safeRefactor.getAnalyzer().generateMethodListFile(criteria);
		System.out.println("Quantity of method to test: " + safeRefactor.getPinfo().getQuantityOfMethodsToTest());

		if (methodList != null) {
			Main main2 = new Main();

			String[] argsRandoop = {
					"gentests",
					"--methodlist=" + methodList,
					"--timelimit=" + timeout,
					"--log=/home/jefferson/workspace/saferefactoraj/filewriter.log",
					"--junit-output-dir=" + Constants.TEST,
					"--output-nonexec=true",
					"--inputlimit="
							+ (safeRefactor.getPinfo().getQuantityOfMethodsToTest() * safeRefactor.getPinfo().getMaxTestsPerMethod()),
					"--remove-subsequences=false" }; // ->  /home/felype/workspaceMestrado/saferefactoraj/filewriter.log

			if (maxTestsPerMethods > 0) {
						String[] newArgsRandoop = {
						"gentests",
						"--methodlist=" + methodList,
						"--timelimit=" + timeout,
						"--log=/home/jefferson/workspace/saferefactoraj/filewriter.log",
						"--junit-output-dir=" + Constants.TEST,
						"--output-nonexec=true",
						"--inputlimit=" + (safeRefactor.getPinfo().getQuantityOfMethodsToTest() * safeRefactor.getPinfo().getMaxTestsPerMethod()),
						"--remove-subsequences=false" }; // ->  /home/felype/workspaceMestrado/saferefactoraj/filewriter.log

				argsRandoop = newArgsRandoop;
			}
			//gentests --testclass=java.util.TreeSet --testclass=java.util.Collections --timelimit=60
			/* When determining the set of members under test from the --testclass, --classlist or --methodlist options, non-public classes or members are ignored. */
			String[] argsR = {"gentests", "--methodlist=" + methodList, "--timelimit=10", "--junit-output-dir=" + Constants.TESTSRC, "--output-nonexec=true", "--inputlimit=" + (safeRefactor.getPinfo().getQuantityOfMethodsToTest() * safeRefactor.getPinfo().getMaxTestsPerMethod()), "--remove-subsequences=false", "--log=/home/jefferson/workspace/saferefactoraj/filewriter.log"};
			argsRandoop = argsR;
			
			System.out.println(" Args Size: " + argsRandoop.length);
			main2.nonStaticMain(argsRandoop);
		}
		else {
			System.out.println("Existem metodos diferentes entre as versoes source e target.");
		}

	}

	public ProjectInfo getPinfo() {
		return pinfo;
	}
	

}
