import static org.junit.Assert.*;

import org.junit.Test;

import ui.CommandLine;


public class AcceptanceTest {

	
	
	@Test
	public void test1() {
		String[] args = {"-src","src","-bin","bin","-lib","lib","-timeout","90", "files/ieeesoftware/JHD_Original_Version/", "files/ieeesoftware/JHotDraw_OO/"}; 
		CommandLine.main(args);
		//TODO: automate the oracle. Currently, check manually if SR detects the behavioral change in the clone method
		
	}

	

}
