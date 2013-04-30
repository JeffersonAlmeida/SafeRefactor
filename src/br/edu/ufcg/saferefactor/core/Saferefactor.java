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
		
		FileUtil.createFolders(this.input);
		
		/*Finds a resource with a given name.*/
		URL file = this.getClass().getResource("/build.xml");
		
		Project p = new Project(); /* Central representation of an Ant project. */

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
		p.setProperty("maxTests", String.valueOf( this.input.getInputLimit()));
		p.setProperty("criteria", this.input.getWhichMethods().toString());
		p.setProperty("project.dir", Constants.PROJECT_DIRECTORY);

		setAntLogConsole(p);
		setBuildLogConsole(p);
		
		p.init(); /* Initialise ANT project.*/
		ProjectHelper helper = ProjectHelper.getProjectHelper();
		p.addReference("ant.projectHelper", helper);
		helper.parse(p, file); /* Parses the ANT project file, configuring the project as it goes.*/
		
		
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
			String methodList = input.getSourceLineDirectory() + "methods-to-test-list" + "/methods-list.txt";
			File file1 = new File(methodList);
			if(file1.delete()){
    			System.out.println(file1.getName() + " is deleted!");
    		}else{
    			System.out.println("Delete operation is failed.");
    		}
			this.getAnalyzer().generateMethodListFile(input.getWhichMethods());
			
			p.setProperty("randoop.test.dir",  this.input.getSourceLineDirectory() + "src");
			p.setProperty("randoop.test.bin",  this.input.getSourceLineDirectory() + "bin");
			p.setProperty("method.list.file", methodList);
			p.setProperty("time.limit", this.input.getTimeOut()+"");
			p.setProperty("log.file.name", "ant-build-log.log");
			p.setProperty("temp.dir", Constants.TEMP);
			p.setProperty("output.dir", this.input.getSourceLineDirectory() + "src");
			p.setProperty("input.limit", this.input.getInputLimit()+"");
			p.setProperty("junit.package", "randoop.tests");
			File xmlOutputFile = new File( this.input.getSourceLineDirectory()+System.getProperty("file.separator")+ "JunitXmlOutput");
			xmlOutputFile.mkdir();
			p.setProperty("junit.output", xmlOutputFile.getAbsolutePath() );
			p.setProperty("randoop.source", this.input.getSourceLineDirectory() + "src" + System.getProperty("file.separator") + "randoop");
			
			
			p.executeTarget("run");
			
			
			//p.executeTarget("compile");
			
			/*p.executeTarget(p.getDefaultTarget());
			report = report(printReport);
			p.executeTarget("coverage");*/
		}
		
		return report.isSameBehavior();		
	}

	/**
	 *  ANT LOG CONSOLE */
	private void setAntLogConsole(Project p) {
		DefaultLogger consoleLogger = new DefaultLogger();
		consoleLogger.setErrorPrintStream(System.err);
		consoleLogger.setOutputPrintStream(System.out);
		consoleLogger.setMessageOutputLevel(Project.MSG_INFO);
		p.addBuildListener(consoleLogger);
	}

	/**
	 *  ANT BUILD LOG CONSOLE */
	private void setBuildLogConsole(Project p) {
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
}
