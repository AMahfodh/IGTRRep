package henshin.constraints;

import henshin.DBRuleToHenshinRule;
import henshin.HenshinUtil;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.henshin.model.Node;

public class DVariable2Variable extends DEquation {

	public String nodeL;
	public String prefixL;
	public String attributeL;
	public String nodeR;
	public String prefixR;
	public String attributeR;

	public DVariable2Variable(String string, String nodeL, String prefixL, String attributeL, String nodeR,
			String prefixR, String attributeR, DBRuleToHenshinRule dbRule2hRule) {
		super(string, dbRule2hRule);

		assert (prefixL.equals(DConstraintFactory.PREFIX_PRE) || prefixL.equals(DConstraintFactory.PREFIX_POST));
		assert (prefixR.equals(DConstraintFactory.PREFIX_PRE) || prefixR.equals(DConstraintFactory.PREFIX_POST));

		this.nodeL = nodeL;
		this.prefixL = prefixL;
		this.attributeL = attributeL;
		this.nodeR = nodeR;
		this.prefixR = prefixR;
		this.attributeR = attributeR;
	}

	public DVariable2VariableKind getKind() {
		if (prefixL.equals(DConstraintFactory.PREFIX_PRE) && prefixR.equals(DConstraintFactory.PREFIX_PRE)) {
			return DVariable2VariableKind.PRE_PRE;
		}
		if (prefixL.equals(DConstraintFactory.PREFIX_POST) && prefixR.equals(DConstraintFactory.PREFIX_POST)) {
			return DVariable2VariableKind.POST_POST;
		}
		if (prefixL.equals(DConstraintFactory.PREFIX_PRE) && prefixR.equals(DConstraintFactory.PREFIX_POST)) {
			return DVariable2VariableKind.PRE_POST;
		}
		if (prefixL.equals(DConstraintFactory.PREFIX_POST) && prefixR.equals(DConstraintFactory.PREFIX_PRE)) {
			assert (false);
		}

		return null;
	}

	public Node getLNode() {
		if (prefixL.equals(DConstraintFactory.PREFIX_PRE)){
			return getHNodeByID(nodeL, false, false);
		}else{
			return getHNodeByID(nodeL, true, false);
		}	
	}

	public Node getRNode() {
		if (prefixR.equals(DConstraintFactory.PREFIX_PRE)){
			return getHNodeByID(nodeR, false, false);
		}else{
			return getHNodeByID(nodeR, true, false);
		}		
	}

	public EAttribute getAttributeDeclarationL() {
		return HenshinUtil.getAttributeDeclaration(getLNode(), attributeL);
	}

	public EAttribute getAttributeDeclarationR() {
		return HenshinUtil.getAttributeDeclaration(getRNode(), attributeR);
	}

	@Override
	public String toString() {
		String res = super.toString() + "\n";
		res += "\t\tnodeL: " + nodeL + " " + getLNode() + "\n";
		res += "\t\tattributeL: " + attributeL + "\n";
		res += "\t\tnodeR: " + nodeR + " " + getRNode() + "\n";
		res += "\t\tattributeR: " + attributeR;

		return res;
	}
}
