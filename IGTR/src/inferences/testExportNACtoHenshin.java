package inferences;

import java.util.ArrayList;

import inferences.GNACs.NACinstance;

public class testExportNACtoHenshin {

	public static void main(String[] args) {
		
		
		/* 
		 * I expect to use the folloing code for each DBRule (maximal rule or rule with MO), 
		 * probably in class (DBRuleToHenshinRule) to load/export list of NACs and their constraints
		 * 
		*/
		
		
		// for loading NACs you need just to pass observation-Id	
		
		
		int observationId = 513;	// example 
		System.out.println("test printing a list of NACs for: " + observationId);
			
		
		
		GNACs nInferredRule = new GNACs(observationId);

		// iteration over list of NACs
		for (NACinstance nacInstance: nInferredRule.NACs){
			
			GraphT preNAC = nacInstance.getPreNAC();			
			preNAC.printGraph();	// print graph elements
			
			
			// attribute constraints relevant to this NAC
			ArrayList<String> strListAttributesConstraints= nacInstance.getAttributesConstraints();			
			System.out.println("Attributes constraints (" + strListAttributesConstraints.size() + "): ");
			
			for (String strConstraint : strListAttributesConstraints){
				System.out.println("\t" + strConstraint);
			}
			
		}
		

	}
	
	
	
	
	
	
	
	

}
