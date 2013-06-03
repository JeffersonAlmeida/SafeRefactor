package br.edu.ufcg.saferefactor.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;
import org.sr.ic.ImpactedClasses;
import org.sr.input.FilePropertiesObject;
import org.sr.input.FilePropertiesReader;

import br.edu.ufcg.saferefactor.core.util.Constants;
import br.edu.ufcg.saferefactor.core.util.FileUtil;

public class Saferefactor {

	protected Analyzer analyzer;
	private ResultComparator comparator;
	private ImpactedClasses ic;
	private  FilePropertiesObject input;
	
	public Saferefactor(String classes, FilePropertiesObject inputObject) {
		this.ic = new ImpactedClasses(classes);
		this.input = inputObject;
		this.comparator = new ResultComparator();
	}
	
	public Saferefactor(ImpactedClasses ic, FilePropertiesObject input){
		this.ic = ic;
		this.input = input;
		this.comparator = new ResultComparator();
	}
	
	public Analyzer getAnalyzer() {
		return analyzer;
	}

	public void setAnalyzer(Analyzer analyzer) {
		this.analyzer = analyzer;
	}
	
	public boolean isRefactoring(String timeout, boolean printReport, String generateTestsWith) throws MalformedURLException {
		FileUtil.createFolders(this.input);
		URL file;
		if(generateTestsWith.equals("randoop")){
			file = this.getClass().getResource("/randoopBuild.xml");	
		}else{
			file = this.getClass().getResource("/evosuiteBuild.xml");
		}
		Project p = new Project(); /* Central representation of an Ant project. */
		p.setProperty("source",this.input.getSourceLineDirectory());
		p.setProperty("target",this.input.getTargetLineDirectory());
		p.setProperty("timeout", this.input.getTimeOut()+"");
		p.setProperty("evosuite.tests", this.input.getSourceLineDirectory() + "src");
		p.setProperty("maxTests", String.valueOf( this.input.getInputLimit()));
		p.setProperty("criteria", this.input.getWhichMethods().toString());
		p.setProperty("project.dir", Constants.PROJECT_DIRECTORY);
		String classPath = this.input.getSourceLineDirectory()+ "bin";
		p.setProperty("classpath",classPath);
		p.setProperty("randoop.source", this.input.getSourceLineDirectory() + "src" + System.getProperty("file.separator") + "randoop");
		p.setProperty("randoop.target", this.input.getTargetLineDirectory() + "src" + System.getProperty("file.separator") + "randoop");
		p.setProperty("randoop.test.dir",  this.input.getSourceLineDirectory() + "src");
		p.setProperty("randoop.test.bin",  this.input.getSourceLineDirectory() + "bin");
		String methodList = input.getSourceLineDirectory() + "methods-to-test-list" + "/methods-list.txt";
		File file1 = new File(methodList);
		p.setProperty("method.list.file", methodList);
		p.setProperty("time.limit", this.input.getTimeOut()+"");
		p.setProperty("log.file.name", "ant-build-log.log");
		p.setProperty("temp.dir", Constants.TEMP);
		p.setProperty("output.dir", this.input.getSourceLineDirectory() + "src");
		p.setProperty("input.limit", this.input.getInputLimit()+"");
		p.setProperty("junit.package", "randoop.tests");
		String junitOutputSource = this.input.getSourceLineDirectory()+System.getProperty("file.separator")+ "JunitXmlOutput";
		File xmlOutputFileSource = new File(junitOutputSource);
		xmlOutputFileSource.mkdir();
		String junitOutputTarget = this.input.getTargetLineDirectory()+System.getProperty("file.separator")+ "JunitXmlOutput";
		File xmlOutputFileTarget = new File(junitOutputTarget);
		xmlOutputFileTarget.mkdir();
		p.setProperty("junit.output.source", xmlOutputFileSource.getAbsolutePath() );
		p.setProperty("junit.output.target", xmlOutputFileTarget.getAbsolutePath() );
		
		this.getComparator().setTestsrc(junitOutputSource);
		this.getComparator().setTesttgt(junitOutputTarget);
		
		setAntLogConsole(p);
		setBuildLogConsole(p);
		
		p.init(); /* Initialise ANT project.*/
		ProjectHelper helper = ProjectHelper.getProjectHelper();
		p.addReference("ant.projectHelper", helper);
		helper.parse(p, file); /* Parses the ANT project file, configuring the project as it goes.*/
		
		
		Report report = new Report();
		
		if(generateTestsWith.equals("evosuite")){
			p.executeTarget("compile_source_and_target");
			p.executeTarget("generate_evosuite_propertiesFile");
			// manipulate evosuite.properties file
			manipulatePropertiesFile();
			Iterator<String> i = this.ic.getModifiedClasses().iterator();
			while(i.hasNext()){
				String clazz = i.next();
				if(clazz.contains("src.")){
					String[] array = clazz.split("src.");
					clazz = array[1];
				}
				System.out.println("Run evosuite for clazz: " + clazz);
				p.setProperty("clazz", clazz);
				p.executeTarget("generate_with_evosuite");
			}
			p.executeTarget("run");
			report = report(printReport);
		}else{
			
			if(file1.delete()){
    			System.out.println(file1.getName() + " is deleted!");
    		}else{
    			System.out.println("Delete operation is failed.");
    		}
			
			p.executeTarget("compile_source_and_target");
			
			this.getAnalyzer().generateMethodListFile(input.getWhichMethods());
		
			
			p.executeTarget("run");
			
			report = report(printReport);
			
			//p.executeTarget("coverage");
		}
		
		return report.isSameBehavior();		
	}

	/**
	 *  Manipulate evosuite.properties file
	 */
	private void manipulatePropertiesFile() {
		Properties evosuiteProperties = new Properties();
		String evosuitePropertiesFile = this.input.getSourceLineDirectory() + "evosuite-files/evosuite.properties";
		try {
			InputStream is = new FileInputStream(evosuitePropertiesFile);
			
			evosuiteProperties.load(is);
			evosuiteProperties.setProperty("test_dir", "src/evosuite-tests"); // test_dir=src/evosuite-tests
			evosuiteProperties.setProperty("report_dir", "src/evosuite-report"); // report_dir=src/evosuite-report
			evosuiteProperties.setProperty("search_budget", "5000");
			is.close();
			OutputStream os = new FileOutputStream(evosuitePropertiesFile);
			evosuiteProperties.store(os, "changing variable");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
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

	public ResultComparator getComparator() {
		return comparator;
	}
	public void setComparator(ResultComparator comparator) {
		this.comparator = comparator;
	}

	public FilePropertiesObject getInput() {
		return input;
	}

	public void setInput(FilePropertiesObject input) {
		this.input = input;
	}

	public ImpactedClasses getIc() {
		return ic;
	}

	public void setIc(ImpactedClasses ic) {
		this.ic = ic;
	}
	
	
}
