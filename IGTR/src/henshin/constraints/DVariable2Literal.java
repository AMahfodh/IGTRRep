package henshin.constraints;

public class DVariable2Literal extends DEquation {

	public String nodeL;
	public String prefixL;
	public String attributeL;
	public String literal;

	public DVariable2Literal(String string, String nodeL, String prefixL, String attributeL, String literal) {
		super(string);

		assert (prefixL.equals(DConstraintFactory.PREFIX_PRE) || prefixL.equals(DConstraintFactory.PREFIX_POST));

		this.nodeL = nodeL;
		this.prefixL = prefixL;
		this.attributeL = attributeL;
		this.literal = literal;
	}

	@Override
	public String toString() {
		String res = super.toString() + "\n";
		res += "\t\tnodeL: " + nodeL + "\n";
		res += "\t\tattributeL: " + attributeL + "\n";
		res += "\t\tliteral: " + literal;

		return res;
	}
}
