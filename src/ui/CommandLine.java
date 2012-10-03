package ui;


import java.io.File;

import br.edu.ufcg.saferefactor.core.Saferefactor;
import br.edu.ufcg.saferefactor.core.util.Constants;

public class CommandLine {

	private static String srcPath = "";
	private static String binPath = "";
	private static String libPath = "";
	private static String source = "";
	private static String target = "";
	private static String timeout = "2";
	private static boolean quiet= false;
	

	public static void main(String[] args) {

		parseArguments(args);

		File sourceFile = new File(source);
		File targetFile = new File(target);
		
		try {
			if (!sourceFile.exists())
				throw new Throwable("Directory not found:"
						+ sourceFile.getAbsolutePath());
			if (!targetFile.exists())
				throw new Throwable("Directory not found:"
						+ targetFile.getAbsolutePath());
			
			Saferefactor sr = new Saferefactor(sourceFile.getAbsolutePath(),
					targetFile.getAbsolutePath(), binPath, srcPath, libPath);
			
			if (sr.isRefactoring(timeout, quiet))
				System.out.println("SafeRefactor found no behavioral changes");
			else { 
				System.out.println("SafeRefactor found behavioral changes");
				System.out.println("Tests' dir:" + Constants.TEST);
			}
				
			
		} catch (Throwable e) {			
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

		

	}

	private static void parseArguments(String[] args) {
		boolean vflag = false;
		String arg;
		int i = 0;
		while (i < args.length && args[i].startsWith("-")) {
			arg = args[i++];
			
			
			
			if (arg.equals("-src")) {
				if (i < args.length)
					srcPath = args[i++];
				else
					System.err.println("-src requires a path");
				if (vflag)
					System.out.println("src path= " + srcPath);
			} else if (arg.equals("-bin")) {
				if (i < args.length)
					binPath = args[i++];
				else
					System.err.println("-bin requires a path");
				if (vflag)
					System.out.println("bin path= " + binPath);
			} else if (arg.equals("-lib")) {
				if (i < args.length)
					libPath = args[i++];
				else
					System.err.println("-lib requires a path");
				if (vflag)
					System.out.println("lib path= " + libPath);
			} else if (arg.equals("-timeout")) {
				if (i < args.length)
					timeout = args[i++];
				else
					System.err.println("-timeout requires a time");
				if (vflag)
					System.out.println("timeout= " + libPath);
			}
		}

		if (i == args.length || i + 1 == args.length)
			System.err
					.println("Usage: Main [-src path] [-bin path] [-lib path] [-timeout t] original_project_path refactored_project_path");

		source = args[i];
		target = args[i + 1];
	}

}
