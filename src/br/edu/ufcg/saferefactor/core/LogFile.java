package br.edu.ufcg.saferefactor.core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.logging.Log;

import br.edu.ufcg.saferefactor.core.util.Constants;


public class LogFile {

	private BufferedWriter log;
	private static LogFile instance;
	
	public static LogFile getInstance(){
        if(instance==null){
        	instance = new LogFile();
        	instance.createBufferWriter();
        }
        return instance;
    }
	
	private LogFile(){
		super();
	}
	
	private void createBufferWriter() {
		String file = Constants.PROJECT_DIRECTORY +"/logFile.txt";
		File f = new File(file);
		try {
			this.log = getLogFile(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private BufferedWriter getLogFile(File file) throws IOException {
		if(!file.exists())
			file.createNewFile();
		if (this.log==null){
			try {
				return new BufferedWriter(new FileWriter(file,true));
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		return this.log;
	}
	public BufferedWriter getLog() {
		return log;
	}
	public void setLog(BufferedWriter log) {
		this.log = log;
	}
}
