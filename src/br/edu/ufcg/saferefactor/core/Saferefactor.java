package br.edu.ufcg.saferefactor.core;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;
import org.sr.ic.ImpactedClasses;
import org.sr.input.FilePropertiesObject;
import org.sr.input.FilePropertiesReader;

import randoop.main.Main;
import br.edu.ufcg.saferefactor.core.util.Constants;
import br.edu.ufcg.saferefactor.core.util.FileUtil;

public class Saferefactor {

	protected Analyzer analyzer;
	private ResultComparator comparator;
	private ImpactedClasses ic;
	private  FilePropertiesObject input;
	
	public Saferefactor(ImpactedClasses ic, FilePropertiesObject input){
		this.ic = ic;
		this.input = input;
		this.comparator = new ResultComparator(Constants.TESTSRC, Constants.TESTTGT, Constants.TESTSRC2, Constants.TESTSRC3);
	}
	
	public Saferefactor(String source, String target, String bin, String src, String lib) {
		analyzer = new Analyzer();
		this.comparator = new ResultComparator(Constants.TESTSRC, Constants.TESTTGT, Constants.TESTSRC2, Constants.TESTSRC3);
	}

	public Analyzer getAnalyzer() {
		return analyzer;
	}

	public void setAnalyzer(Analyzer analyzer) {
		this.analyzer = analyzer;
	}
	
	public boolean isRefactoring(String timeout, boolean printReport, String generateTestsWith) {
		
		FileUtil.createFolders();
		
		/*Finds a resource with a given name.*/
		URL file = this.getClass().getResource("/build.xml");

		System.out.println("\n\nANT BUILD DIRECTORY: " + file.getPath());
		
		/* Central representation of an Ant project. */
		Project p = new Project();

		/* Set a property. Any existing property of the same name is overwritten, unless it is a user property. */
		String classPath = this.input.getSourceLineDirectory()+ "bin";
		p.setProperty("classpath",classPath);
		p.setProperty("source",this.input.getSourceLineDirectory());
		p.setProperty("target",this.input.getTargetLineDirectory());
		p.setProperty("timeout", this.input.getTimeOut()+"");
		p.setProperty("bin", "bin");
		p.setProperty("lib", "lib");
		p.setProperty("src", "src");
		p.setProperty("tests.folder", Constants.TEST);
		p.setProperty("evosuite.tests", Constants.EVOSUITE_TESTS);
		p.setProperty("evosuite.compiled.tests", Constants.EVOSUITE_COMPILED_TESTS);

		int maxTestsPerMethod = this.input.getInputLimit();

		if (maxTestsPerMethod > 0) {
			/* Set a property. Any existing property of the same name is overwritten, unless it is a user property. */
			p.setProperty("maxTests", String.valueOf(maxTestsPerMethod));
		}

		/* Set a property. Any existing property of the same name is overwritten, unless it is a user property. */
		p.setProperty("criteria", this.input.getWhichMethods().toString());

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
		Report report = new Report();
		if(generateTestsWith.equals("evosuite")){
			p.executeTarget("clean_evosuite_tests");
			Iterator<String> i = this.ic.getModifiedClasses().iterator();
			while(i.hasNext()){
				String clazz = i.next();
				System.out.println("Run evosuite for clazz: " + clazz);
				p.setProperty("clazz", clazz);
				p.executeTarget("generate_with_evosuite");
			}
			p.executeTarget("run_tests_evosuite");
			report = report(printReport);
		}else if (generateTestsWith.equals("randoop")){
			/* Execute default target of the project. */
			p.executeTarget(p.getDefaultTarget());
			report = report(printReport);
			p.executeTarget("coverage");
		}
		
		return report.isSameBehavior();		
	}

	private Report report(boolean printReport) {
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
		return report;
	}
	
	public static void main(String[] args) {
			
		ImpactedClasses impactedClasses = new ImpactedClasses("org.bank.account.Account");
		FilePropertiesReader reader = new FilePropertiesReader("/home/jefferson/workspace/ferramentaLPSSM/inputFiles/bank1.0.properties");
		FilePropertiesObject in = reader.getPropertiesObject();
		Analyzer analyzer = new Analyzer();
		analyzer.setInput(in);
		analyzer.setImpactedClasses(impactedClasses);
		Saferefactor sr = new Saferefactor(impactedClasses, in);
		sr.setAnalyzer(analyzer);
		
		File methodList = sr.getAnalyzer().generateMethodListFile(Criteria.ONLY_COMMON_METHODS_SUBSET_DEFAULT);
		
		if (methodList != null) {
			Main randoopMain = new Main();
			String[] argsRandoop = {
					"gentests",
					"--methodlist=" + methodList,
					"--timelimit=" + in.getTimeOut(),
					"--log=/home/jefferson/workspace/saferefactoraj/filewriter.log",
					"--junit-output-dir=" + Constants.TEST,
					"--output-nonexec=true",
					"--inputlimit="
							+ (in.getInputLimit() * 2),
					"--remove-subsequences=false" }; 
			randoopMain.nonStaticMain(argsRandoop);
		}
		else {
			System.out.println("Existe metodos diferentes entre as versoes source e target.");
		}

	}
}
