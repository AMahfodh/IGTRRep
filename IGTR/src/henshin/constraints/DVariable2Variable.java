package henshin.constraints;

public class DVariable2Variable extends DEquation {

	public String nodeL;
	public String prefixL;
	public String attributeL;
	public String nodeR;
	public String prefixR;
	public String attributeR;

	public DVariable2Variable(String string, String nodeL, String prefixL, String attributeL, String nodeR,
			String prefixR, String attributeR) {
		super(string);

		assert (prefixL.equals(DConstraintFactory.PREFIX_PRE) || prefixL.equals(DConstraintFactory.PREFIX_POST));
		assert (prefixR.equals(DConstraintFactory.PREFIX_PRE) || prefixR.equals(DConstraintFactory.PREFIX_POST));

		this.nodeL = nodeL;
		this.prefixL = prefixL;
		this.attributeL = attributeL;
		this.nodeR = nodeR;
		this.prefixR = prefixR;
		this.attributeR = attributeR;
	}

	@Override
	public String toString() {
		String res = super.toString() + "\n";
		res += "\t\tnodeL: " + nodeL + "\n";
		res += "\t\tattributeL: " + attributeL + "\n";
		res += "\t\tnodeR: " + nodeR + "\n";
		res += "\t\tattributeR: " + attributeR;

		return res;
	}
}
