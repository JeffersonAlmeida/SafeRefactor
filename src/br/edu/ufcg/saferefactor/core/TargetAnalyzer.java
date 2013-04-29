package br.edu.ufcg.saferefactor.core;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Map;
import br.edu.ufcg.saferefactor.core.ast.SClass;
import br.edu.ufcg.saferefactor.core.util.Constants;

public class TargetAnalyzer {
	
	public static void main(String[] args) {
		String target = args[0];
		Analyzer analyzer = new Analyzer();
		Map<String, SClass> mapClasses2 = analyzer.mapClasses2(target);
		OutputStream file;
		try {
			file = new FileOutputStream(Constants.TEST + Constants.FILE_SEPARATOR + "mapClasses2.ser");
			OutputStream buffer = new BufferedOutputStream(file);
			ObjectOutput output = new ObjectOutputStream(buffer);
			try {
				output.writeObject(mapClasses2);
			} finally {
				output.close();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
