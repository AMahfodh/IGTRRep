package inferences;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.File;
import java.io.IOException;
import java.util.logging.*;

public class TestInferences {

	
	public void commitLearning() throws Exception{
		
		
		// commit generalisation 		
		int iMinRepeatedMultiObjects =1;
		new RuleInference().generaliseRuleInstance(iMinRepeatedMultiObjects);
		
		
		
		// learning invariant constraints on rule attributes and parameters 
		AttributeInference learningInvariantConstraints = new AttributeInference();		
		learningInvariantConstraints.generateCSVToBeUsedByPerl();
		learningInvariantConstraints.exeDaikon();
		learningInvariantConstraints.storeDaikonOutputBackToDB();
		
		
		
		// exportToHenshin
		//new ExportToHenshin().exportHenshinModel(
		//		new File("").getAbsolutePath() + 
		//			File.separator + "HenshinOutput" + 
		//			File.separator + "myModel.henshin", 
		//		"");
		


	}
	
	
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		
		Logger GTlogger = Logger.getLogger("GTlog"); 
	    try {  
	         
	    	boolean isAppend=false;
	    	FileHandler fh = new FileHandler("GT.log", isAppend);
	        	    	
	    	GTlogger.addHandler(fh);
	        SimpleFormatter formatter = new SimpleFormatter() {
	        	public String format(LogRecord record) {
	        		return record.getMessage() + System.lineSeparator();	        		
	             }
	        };
	        GTlogger.setLevel(Level.ALL);
	        fh.setFormatter(formatter); 
	        //GTlogger.addHandler(new ConsoleHandler());
	        GTlogger.setUseParentHandlers(false);	       

	    } 
	    catch (SecurityException e) { e.printStackTrace(); }
	    catch (IOException e) {  e.printStackTrace(); }
		
		
		
		
		new TestInferences().commitLearning();

	}



}
