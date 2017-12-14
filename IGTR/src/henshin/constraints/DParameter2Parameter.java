package henshin.constraints;

import henshin.DBRuleToHenshinRule;

public class DParameter2Parameter extends DEquation {

	public String parameter1;
	public String parameter2;

	public DParameter2Parameter(String string, String parameter1, String parameter2, DBRuleToHenshinRule dbRule2hRule) {
		super(string, dbRule2hRule);

		this.parameter1 = parameter1;
		this.parameter2 = parameter2;
	}

	@Override
	public String toString() {
		String res = super.toString() + "\n";
		res += "\t\tparameter1: " + parameter1 + "\n";
		res += "\t\tparameter2: " + parameter2;

		return res;
	}
}
