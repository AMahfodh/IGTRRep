package henshin.constraints;

import henshin.DBRuleToHenshinRule;
import henshin.HenshinUtil;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.henshin.model.Node;

public class DVariable2Parameter extends DEquation {

	public String node;
	public String prefix;
	public String attribute;
	public String parameter;

	public DVariable2Parameter(String string, String node, String prefix, String attribute, String parameter,
			DBRuleToHenshinRule dbRule2hRule) {
		super(string, dbRule2hRule);

		assert (prefix.equals(DConstraintFactory.PREFIX_PRE) || prefix.equals(DConstraintFactory.PREFIX_POST));

		this.node = node;
		this.prefix = prefix;
		this.attribute = attribute;
		this.parameter = parameter;
	}

	public DVariable2LiteralKind getKind() {
		if (prefix.equals(DConstraintFactory.PREFIX_PRE)) {
			return DVariable2LiteralKind.PRE;
		}
		if (prefix.equals(DConstraintFactory.PREFIX_POST)) {
			return DVariable2LiteralKind.POST;
		}

		return null;
	}

	public Node getNode() {
		switch (getKind()) {
		case PRE:
			return getHNodeByID(node, false, false);

		case POST:
			return getHNodeByID(node, true, false);

		}

		return null;
	}

	public EAttribute getAttributeDeclaration() {
		return HenshinUtil.getAttributeDeclaration(getNode(), attribute);
	}

	@Override
	public String toString() {
		String res = super.toString() + "\n";
		res += "\t\tkind: " + getKind() + "\n";
		res += "\t\tnode: " + node + " " + getNode() + " \n";
		res += "\t\tattribute: " + attribute + "\n";
		res += "\t\tparameter: " + parameter;

		return res;
	}
}
