package br.edu.ufcg.saferefactor.core;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;

import randoop.main.Main;
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

//		public Saferefactor(String source, String target, String bin, String src, String lib, String classes) {
//			start = System.currentTimeMillis();
//			pinfo = new ProjectInfo(source, target, bin, src, lib, classes, 0);
//			analyzer = new Analyzer(pinfo);
//	
//			this.comparator = new ResultComparator(Constants.TESTSRC, Constants.TESTTGT, Constants.TESTSRC2, Constants.TESTSRC3);
//		}

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

	public static void main(String[] args) {
		String source = args[0];
		String target = args[1];
		String bin = args[2];
		String src = args[3];
		String lib = args[4];
		String timeout = args[5];
		String classes = null;

		Criteria criteria = null;

		if (args.length > 6) {
			classes = args[6];
		}

		int maxTestsPerMethods = 0;

		if (args.length > 7) {
			maxTestsPerMethods = Integer.valueOf(args[7]);
		}

		if (args.length > 8) {
			criteria = Criteria.valueOf(args[8]);
		}

		Saferefactor safeRefactor = new Saferefactor(source, target, bin, src, lib, classes, maxTestsPerMethods, criteria);
		File methodList = safeRefactor.getAnalyzer().generateMethodListFile(criteria);

		if (methodList != null) {
			Main main2 = new Main();

			String[] argsRandoop = {
					"gentests",
					"--methodlist=" + methodList,
					"--timelimit=" + timeout,
					"--log=/workspace/saferefactoraj/filewriter.log",
					"--junit-output-dir=" + Constants.TEST,
					"--output-nonexec=true",
					"--inputlimit="
							+ (safeRefactor.getPinfo().getQuantityOfMethodsToTest() * safeRefactor.getPinfo().getMaxTestsPerMethod()),
					"--remove-subsequences=false" }; // ->  /home/felype/workspaceMestrado/saferefactoraj/filewriter.log

			if (maxTestsPerMethods > 0) {
				//			String[] newArgsRandoop = { "gentests", "--remove-subsequences=false", "--timelimit=" + 100,
				//					"--inputlimit=" + (maxTestsPerMethods * safeRefactor.getPinfo().getMaxTestsPerMethod()), "--methodlist=" + methodList,
				//					"--log=/home/felype/workspaceMestrado/saferefactoraj/filewriter.log",
				//					"--junit-output-dir=" + Constants.TEST, "--output-nonexec=true" };

				String[] newArgsRandoop = {
						"gentests",
						"--methodlist=" + methodList,
						"--timelimit=" + timeout,
						"--log=/workspace/saferefactoraj/filewriter.log",
						"--junit-output-dir=" + Constants.TEST,
						"--output-nonexec=true",
						"--inputlimit="
								+ (safeRefactor.getPinfo().getQuantityOfMethodsToTest() * safeRefactor.getPinfo().getMaxTestsPerMethod()),
						"--remove-subsequences=false" }; // ->  /home/felype/workspaceMestrado/saferefactoraj/filewriter.log

				argsRandoop = newArgsRandoop;
			}

			main2.nonStaticMain(argsRandoop);
		}
		else {
			System.out.println("H� m�todos diferentes entre as vers�es source e target.");
		}

	}

	public ProjectInfo getPinfo() {
		return pinfo;
	}
}
