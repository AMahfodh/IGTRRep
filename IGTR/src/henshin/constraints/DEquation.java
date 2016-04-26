package henshin.constraints;

import henshin.DBRuleToHenshinRule;
import henshin.ElementKind;
import henshin.MapPair;
import inferences.GNode;

import org.eclipse.emf.henshin.model.Node;

public class DEquation extends DConstraint {

	protected DBRuleToHenshinRule dbRule2hRule;
	
	public DEquation(String string, DBRuleToHenshinRule dbRule2hRule) {
		super(string);	
		this.dbRule2hRule = dbRule2hRule;
	}
	
	protected Node getHNodeByID(String id, boolean isRHS, boolean isMulti) {
		GNode gNode = getNodeByID(id, isRHS, isMulti);
		Node hNode = dbRule2hRule.getHNode(gNode, isRHS, isMulti);
		assert (hNode != null);

		return hNode;
	}

	protected GNode getNodeByID(String id, boolean isRHS, boolean isMulti) {
		MapPair mapPair = dbRule2hRule.getMapPair(ElementKind.NODE, isRHS, isMulti);
		for (Object o : mapPair.g2h.keySet()) {
			GNode node = (GNode) o;
			if (node.nodeID.equals(id) || node.AbstractID.equals(id)) {
				return node;
			}
		}

		return null;
	}

}
