package inferences;

import java.io.File;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.codec.digest.DigestUtils;

import com.sun.rowset.CachedRowSetImpl;

public class ExportToHenshin {

	
	private String strEcorePrefix = null;
	private String encryptedXmiId = this.getEncryptedXmiId();

	private PrintWriter henshinWriter = null;
	private ArrayList<String> listInvariantConstraints = new ArrayList<String>();
	private Set<String> setInvConstraintsAsParameters = new HashSet<String>();
	private String charSeparator = String.valueOf(((char) 007));
	private boolean printingRuleWithMultiObjects = false;

	public boolean exportHenshinModel(String strLocation) throws Exception {

		// exporting all abstract (maximal) rules and rule with multi objects	
		this.henshinWriter = new PrintWriter(strLocation, "UTF-8");

		this.printHeaderAndFooterFile(true);

		System.out.println("preparing all maximal rules ..");
		// preparing all maximal rules for exporting them to Henshin ..
		CachedRowSetImpl crsAllAbstractRule = DBRecord
				.getByQueryStatement("select RuleName, Observation_IDREFF, 0 from TblBasicRule "
						+ " where isAbstract=true and isApplicable=true" + " union all "
						+ " select CONCAT(RuleName, '_MO') as RuleName, Observation_IDREFF, 1 from TblBasicRule "
						+ " where isAbstract=true and isApplicable=true " + " and isAbstractMO=true;");

		try {

			while (crsAllAbstractRule.next()) {

				if (!this.printingRuleWithMultiObjects && crsAllAbstractRule.getInt(3) == 1) {

					this.printingRuleWithMultiObjects = true;
					System.out.println("pritning rules with MOs ..");
				}

				this.printRule(crsAllAbstractRule.getString(1), crsAllAbstractRule.getInt(2));

			}

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		this.printHeaderAndFooterFile(false);
		this.henshinWriter.close();

		// get all abstract rule attributes based on mapped abstract node IDs
		System.out.println("Generating henshin file completed");

		return true;
	}

	private void printHeaderAndFooterFile(boolean isHeader) {

		if (isHeader) {
			this.strEcorePrefix = "http://www.eclipse.org/emf/2002/Ecore#//";

			this.henshinWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + System.lineSeparator());
			this.henshinWriter
					.write("<henshin:Module xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore#/\"  xmlns:henshin=\"http://www.eclipse.org/emf/2011/Henshin#/\" xmi:id=\"_qWu8UPNUEeS14"
							+ this.encryptedXmiId + "\" name=\"ExtractedRules2Ecore\" >" + System.lineSeparator());
			// this.henshinWriter.write("<imports href=\"" + this.ecoreName +
			// ".ecore#/\"/>" + System.lineSeparator());
		} else {
			this.henshinWriter.write("</henshin:Module>" + System.lineSeparator());
		}
	}

	private void printRule(String ruleName, int iObservation) {

		System.out.println(ruleName + " " + iObservation);

		this.henshinWriter.write("<units xsi:type=\"henshin:Rule\" xmi:id=\"_X" + iObservation + ""
				+ this.encryptedXmiId + "\" name=\"" + iObservation + "_" + ruleName + "\">" + System.lineSeparator());

		// print parameters and also generate required ones based on inferred
		// invariants
		this.printRuleParameters(iObservation);

		int iLHSGraphID = -1;
		int iRHSGraphID = -1;
		CachedRowSetImpl crsGraphsIDAndRuleName = DBRecord
				.getByQueryStatement("select graphType, GraphID  from TblGraph  " + "where Observation_IDREFF="
						+ iObservation + ";");

		try {

			while (crsGraphsIDAndRuleName.next()) {

				if (!crsGraphsIDAndRuleName.getBoolean(1)) {
					iLHSGraphID = crsGraphsIDAndRuleName.getInt(2);
				} else {

					iRHSGraphID = crsGraphsIDAndRuleName.getInt(2);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (!this.printingRuleWithMultiObjects) {
			this.printNodesWithAttributes(new GraphT(iLHSGraphID, true, false, true), false);
			this.printNodesWithAttributes(new GraphT(iRHSGraphID, true, false, true), true);
		} else {
			// for node with MO
			GraphT graphWithMo = new GraphT();

			// loading lhs graph
			graphWithMo.graphID = iLHSGraphID;
			graphWithMo.graphType = 0;
			graphWithMo.LoadMultiObjects(false, true);
			this.printNodesWithAttributes(graphWithMo, false);

			// loading rhs graph
			graphWithMo = new GraphT();
			graphWithMo.graphID = iRHSGraphID;
			graphWithMo.graphType = 1;
			graphWithMo.LoadMultiObjects(false, true);
			this.printNodesWithAttributes(graphWithMo, true);

		}

		this.henshinWriter.write("</units>" + System.lineSeparator());
	}

	private void printRuleParameters(int iObservation) {

		// currently I didn't consider data (parameters/attributes) conditions
		// on rule with multi objects
		if (this.printingRuleWithMultiObjects) {
			return;
		}

		System.out.println("\t printing rule parameters ..");

		this.loadInvariantConstraints(iObservation);

		String[] listOfParameters = null;
		CachedRowSetImpl crsRuleParameters = DBRecord
				.getByQueryStatement("select RuleParameters from TblObservationOutput  " + "where Observation_ID="
						+ iObservation + " and RuleParameters <>'';");

		try {
			if (crsRuleParameters.next()) {
				listOfParameters = crsRuleParameters.getString(1).split(this.charSeparator);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (listOfParameters == null) {
			return;
		}

		int i = 0;
		for (i = 0; i < listOfParameters.length; i++) {

			int iEqualIndex = listOfParameters[i].indexOf("=");

			if (iEqualIndex == -1 || listOfParameters[i].toLowerCase().contains("return")) {
				continue;
			}

			String[] par = listOfParameters[i].substring(0, iEqualIndex).trim().split(" ");

			if (par.length != 2) {
				System.out.println("\t\tSkipping parameter " + listOfParameters[i]);
				continue;
			}

			// par[0] type, par[1] name and par[2] is value
			this.henshinWriter.write("	<parameters xmi:id=\"_XF7_P" + i + "" + iObservation + "" + this.encryptedXmiId
					+ "\" name=\"" + par[1] + "\"/>" + System.lineSeparator());
		}

		// add extra parameters as variables
		for (String extraParameters : this.setInvConstraintsAsParameters) {

			this.henshinWriter.write("	<parameters xmi:id=\"_XF7_P" + (++i) + "" + iObservation + ""
					+ this.encryptedXmiId + "\" name=\"" + extraParameters + "\"/>" + System.lineSeparator());

			// String strEDataType="EString";
			// if ("EString EInt".contains(strEDataType)){
			// this.henshinWriter.write("		<type xsi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//"
			// + strEDataType + "\"/>" + System.lineSeparator());
			// }
			// this.henshinWriter.write("	</parameters>" +
			// System.lineSeparator());
		}
	}

	private void loadInvariantConstraints(int iObservationID) {

		// clear current set/list of invariants
		this.setInvConstraintsAsParameters.clear();
		this.listInvariantConstraints.clear();

		// load invariants from DB
		System.out.println("\t load constraints for [" + iObservationID + "]..");
		CachedRowSetImpl crsConstants = DBRecord
				.getByQueryStatement("select RuleAttributeConditions from TblObservationOutput "
						+ "where (RuleAttributeConditions is not null or RuleAttributeConditions='') and Observation_ID="
						+ iObservationID + ";");

		try {

			if (crsConstants.next()) {

				char chars[] = crsConstants.getString(1).toCharArray();

				String strLineInvariant = "";
				for (int i = 0; i < chars.length; i++) {

					if (chars[i] == '\n') {

						this.addInvariantToCurrentSet(strLineInvariant);
						strLineInvariant = "";
						continue;
					}

					strLineInvariant += chars[i];
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void addInvariantToCurrentSet(String strLineInvariant) {

		strLineInvariant = strLineInvariant.trim().replace("Pre_", "").replace("Post_", "");
		this.listInvariantConstraints.add(strLineInvariant);

		// extracting left variable
		int iSpaceIndex = strLineInvariant.indexOf(" ");

		if (iSpaceIndex == -1) {
			return;
		}

		String leftVar = strLineInvariant.substring(0, iSpaceIndex);
		if (leftVar.startsWith("N") && (leftVar.contains("L_") || leftVar.contains("R_"))) {

			this.setInvConstraintsAsParameters.add(leftVar);
		}

		// and here for the right variable
		iSpaceIndex = strLineInvariant.lastIndexOf(" ") + 1;
		if (iSpaceIndex > 4 && iSpaceIndex < strLineInvariant.length()) {

			strLineInvariant = strLineInvariant.substring(iSpaceIndex);

			if (strLineInvariant.startsWith("N")
					&& (strLineInvariant.contains("L_") || strLineInvariant.contains("R_"))) {
				this.setInvConstraintsAsParameters.add(strLineInvariant);
			}
		}
	}

	private void printNodesWithAttributes(GraphT lrhs, boolean isRHS) {

		System.out.println("\t node and attributes for side .. " + isRHS);
		String side = "";

		// opening tage
		if (isRHS) {
			this.henshinWriter.write("<rhs xmi:id=\"_XR" + lrhs.graphID + "" + this.encryptedXmiId + "\" name=\"RHS\">"
					+ System.lineSeparator());
			side = "R";
		} else {
			this.henshinWriter.write("<lhs xmi:id=\"_XL" + lrhs.graphID + "" + this.encryptedXmiId + "\" name=\"LHS\">"
					+ System.lineSeparator());
			side = "L";
		}

		// print nodes
		for (int i = 0; i < lrhs.gNodes.size(); i++) {

			GNode printNode = lrhs.gNodes.get(i);

			// update node id
			if (this.printingRuleWithMultiObjects) {
				String preNodeID = printNode.AbstractID;
				printNode.AbstractID = printNode.nodeID;
				printNode.nodeID = preNodeID;
			}

			String incomingOutgoingEdges = this.getIncomingOutgoingConnectedEdges(printNode, lrhs);

			String nodeIdName = "";
			if (printNode.iParameterIndex > 0) {
				nodeIdName = " name=\"Par" + printNode.iParameterIndex + "\"";
			}

			this.henshinWriter.write("<nodes xmi:id=\"_" + side + printNode.nodeID + "" + this.encryptedXmiId + "\""
					+ nodeIdName + incomingOutgoingEdges + ">" + System.lineSeparator());
			this.henshinWriter.write("        <type href=\"" + this.strEcorePrefix + printNode.nodeType + "\"/>"
					+ System.lineSeparator());

			// print attributes for normal node only
			if (!this.printingRuleWithMultiObjects) {
				this.printNodesAttributes(printNode);
			} else {
				// print tags for multi object node..
				if (printNode.isMulti) {
					this.henshinWriter.write("<multiRules><multiMappings /></multiRules>");
				}
			}

			this.henshinWriter.write("      </nodes>" + System.lineSeparator());
		}

		// print edges
		for (int i = 0; i < lrhs.gEdges.size(); i++) {

			GEdge printEdge = lrhs.gEdges.get(i);

			this.henshinWriter.write("      <edges xmi:id=\"_edg" + lrhs.graphID + "" + i + "" + this.encryptedXmiId
					+ "\" source=\"_" + side + printEdge.sourceID + "" + this.encryptedXmiId + "\" target=\"_" + side
					+ printEdge.targetID + "" + this.encryptedXmiId + "\">" + System.lineSeparator());

			// sourceType/targetType
			this.henshinWriter.write("      	<type href=\"" + this.strEcorePrefix + printEdge.sourceTargetType + "\"/>"
					+ System.lineSeparator());

			this.henshinWriter.write("      </edges>" + System.lineSeparator());
		}

		// closing rule tag
		if (isRHS) {
			this.henshinWriter.write("</rhs>" + System.lineSeparator());

			this.printInvariantConstants();
			this.printNodesMappings(lrhs);

		} else {
			this.henshinWriter.write("</lhs>" + System.lineSeparator());
		}

	}

	private String getIncomingOutgoingConnectedEdges(GNode gNode, GraphT lrhs) {

		String incoming = "";
		String outgoing = "";

		for (int i = 0; i < lrhs.gEdges.size(); i++) {

			GEdge printEdge = lrhs.gEdges.get(i);

			String edgeID = "_edg" + lrhs.graphID + "" + i + "" + this.encryptedXmiId;

			if (gNode.nodeID.equalsIgnoreCase(printEdge.targetID)) {
				incoming += edgeID + " ";
			}

			if (gNode.nodeID.equalsIgnoreCase(printEdge.sourceID)) {
				outgoing += edgeID + " ";
			}
		}

		if (incoming.length() != 0) {
			incoming = "incoming=\"" + incoming.trim() + "\"";
		}

		if (outgoing.length() != 0) {
			outgoing = "outgoing=\"" + outgoing.trim() + "\"";
		}

		incoming = " " + incoming + " " + outgoing;

		if (incoming.trim().length() == 0) {
			return "";
		} else {
			return incoming;
		}

	}

	private void printNodesAttributes(GNode gNode) {

		if (gNode.gAttribute.size() < 1) {
			return;
		}

		for (int j = 0; j < gNode.gAttribute.size(); j++) {

			GAttribute nodeAttribute = gNode.gAttribute.get(j);

			// to exclude ref attributes
			if (nodeAttribute.attIsObjectRelation) {
				continue;
			}

			String strNodeAttType = null;

			if (nodeAttribute.attName.equalsIgnoreCase("name")) {
				strNodeAttType = "ENamedElement/" + nodeAttribute.attName;
			} else {
				strNodeAttType = gNode.nodeType + "/" + nodeAttribute.attName;
			}

			this.henshinWriter.write("        <attributes xmi:id=\"_ATT" + gNode.nodeID + "" + j + this.encryptedXmiId
					+ "\" value=\"" + gNode.AbstractID + "_" + nodeAttribute.attName + "\">" + System.lineSeparator());
			this.henshinWriter.write("          <type href=\"" + this.strEcorePrefix + strNodeAttType + "\"/>"
					+ System.lineSeparator());
			this.henshinWriter.write("        </attributes>" + System.lineSeparator());

		}
	}

	private void printNodesMappings(GraphT rhs) {

		System.out.println("\t set mapping between nodes .. ");

		for (int i = 0; i < rhs.gNodes.size(); i++) {

			GNode printNode = rhs.gNodes.get(i);

			// mapping only nodes that exists in the both graphs
			if (printNode.isInitialized) {
				continue;
			}

			this.henshinWriter.write("<mappings xmi:id=\"_XG" + rhs.graphID + "" + i + "" + this.encryptedXmiId
					+ "\" origin=\"_L" + printNode.nodeID + "" + this.encryptedXmiId + "\" image=\"_R"
					+ printNode.nodeID + "" + this.encryptedXmiId + "\"/>" + System.lineSeparator());

		}
	}

	private void printInvariantConstants() {

		// no data conditions on rule with multi objects
		if (this.printingRuleWithMultiObjects) {
			return;
		}

		int iInv = 0;
		for (String strInv : listInvariantConstraints) {
			this.henshinWriter.write("<attributeConditions xmi:id=\"_inv" + (iInv++) + this.encryptedXmiId + "\""
					+ " name=\"InvCondition" + iInv + "\" conditionText=\"" + strInv.replace("\"", "&quot;") + "\"/>"
					+ System.lineSeparator());
		}
	}

	private String getEncryptedXmiId() {
		return "_" + DigestUtils.sha1Hex(System.nanoTime() + "").substring(0, 8);
	}

	public static void main(String[] args) throws Exception {
		new ExportToHenshin().exportHenshinModel(new File("").getAbsolutePath() + File.separator + "HenshinOutput"
				+ File.separator + "old.henshin");
	}
}
