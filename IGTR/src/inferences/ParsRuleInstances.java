package inferences;

import java.util.ArrayList;

public class ParsRuleInstances {

	
	// example of adding rule instance in the database
	private static void addRuleInstance(){
		
		//[1] set rule name
		String ruleName="myRuleName";	
		
		
		//[2] add rule parameters ...
		ArrayList<GParameter> ruleParameters= new ArrayList<GParameter>();
		ruleParameters.add(new GParameter("parType1", "parName1", "parValue1"));
		ruleParameters.add(new GParameter("parType2", "parName2", "parValue2"));
		
		
		//[3] set graphs (gLHS and gRHS) ..
		GraphT gLHS= new GraphT();
		GraphT gRHS= new GraphT();
		
		
		/** example of adding graph elements after paring EMF/ecore files etc.. 
		 * 
		 *  ==>> node ids are critical in defining minimal rule elements <<== 
		 *  */
				
		// nodes in gLHS ******************************************			
		GNode nodeL1 = new GNode("c1", "circle");
		nodeL1.addAttribute(new GAttribute("att1", "string", "nothing"));
		GNode nodeL2 = new GNode("s1", "square");
		GNode nodeL3 = new GNode("s2", "square");
		GNode nodeL4 = new GNode("t1", "triangle");
		
		gLHS.addNode(nodeL1);
		gLHS.addNode(nodeL2);
		gLHS.addNode(nodeL3);
		gLHS.addNode(nodeL4);
		
		// edges in gLHS		
		gLHS.addEdge(new GEdge ("c1", "s1"));
		gLHS.addEdge(new GEdge ("s1", "s2"));
		gLHS.addEdge(new GEdge ("s2", "t1"));
		
		

		// nodes in gRHS ******************************************		
		GNode nodeR1 = new GNode("c1", "circle");
		nodeR1.addAttribute(new GAttribute("att1", "string", "Abdullah"));
		GNode nodeR2 = new GNode("s1", "square");
		GNode nodeR3 = new GNode("s2", "square");
		GNode nodeR4 = new GNode("r1", "rectangle");
		
		gRHS.addNode(nodeR1);
		gRHS.addNode(nodeR2);
		gRHS.addNode(nodeR3);
		gRHS.addNode(nodeR4);
		
		// edges in gRHS
		gRHS.addEdge(new GEdge ("c1", "s1"));
		gRHS.addEdge(new GEdge ("s1", "s2"));
		gRHS.addEdge(new GEdge ("s2", "r1"));
		
		
		
		// create rule instance object ..
		RuleInstance createNewRule= new RuleInstance(
				ruleName, 
				ruleParameters, 
				gLHS, 
				gRHS);
		
		
		// and save it
		System.out.println("is it saved? " + createNewRule.save());

	}
	
	
	
	
	
	
	public static void main(String[] args) {

		addRuleInstance();

	}
	
	
	
	
}
