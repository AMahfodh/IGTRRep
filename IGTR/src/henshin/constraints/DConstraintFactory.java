package henshin.constraints;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import henshin.DBRuleToHenshinRule;

public class DConstraintFactory {

	public static final String PREFIX_PRE = "Pre";
	public static final String PREFIX_POST = "Post";

	static final String return_pattern = "return";
	static final String oneOf_pattern = " one of ";
	static final String numberPattern = "\\d+\\.?\\d*";
	static final String variable2literal_pattern_1 = "(\\S+)_(\\S+)_(\\S+) == \"(\\S+)\"";
	static final String variable2literal_pattern_2 = "(\\S+)_(\\S+)_(\\S+) == (" + numberPattern + ")";
	static final String variable2variable_pattern = "(\\S+)_(\\S+)_(\\S+) == (\\S+)_(\\S+)_(\\S+)";
	static final String variable2parameter_pattern_1 = "(\\S+)_(\\S+)_(\\S+) == (\\S+)_(\\S+)";
	static final String variable2parameter_pattern_2 = "(\\S+)_(\\S+) == (\\S+)_(\\S+)_(\\S+)";
	static final String parameter2parameter_pattern = "(\\S+)_(\\S+) == (\\S+)_(\\S+)_(\\S+)";

	public static DConstraint createDConstraint(String s, DBRuleToHenshinRule dbRule2hRule) {

		// DReturn
		if (s.contains(return_pattern)) {
			return new DReturn(s);
		}

		// DOneOf
		if (s.contains(oneOf_pattern)) {
			return new DOneOf(s);
		}

		// DVariable2Literal
		Matcher m = Pattern.compile(variable2literal_pattern_1).matcher(s);
		if (m.find()) {
			MatchResult r = m.toMatchResult();
			DVariable2Literal c = new DVariable2Literal(s, r.group(1), r.group(2), r.group(3), r.group(4),
					dbRule2hRule);
			return c;
		}

		m = Pattern.compile(variable2literal_pattern_2).matcher(s);
		if (m.find()) {
			MatchResult r = m.toMatchResult();
			DVariable2Literal c = new DVariable2Literal(s, r.group(1), r.group(2), r.group(3), r.group(4),
					dbRule2hRule);
			return c;
		}

		// DVariable2Variable
		m = Pattern.compile(variable2variable_pattern).matcher(s);
		if (m.find()) {
			MatchResult r = m.toMatchResult();
			DVariable2Variable c = new DVariable2Variable(s, r.group(1), r.group(2), r.group(3), r.group(4), r.group(5),
					r.group(6), dbRule2hRule);
			return c;
		}

		// DVariable2Parameter
		m = Pattern.compile(variable2parameter_pattern_1).matcher(s);
		if (m.find()) {
			MatchResult r = m.toMatchResult();
			DVariable2Parameter c = new DVariable2Parameter(s, r.group(1), r.group(2), r.group(3), r.group(5),
					dbRule2hRule);
			return c;
		}
		m = Pattern.compile(variable2parameter_pattern_2).matcher(s);
		if (m.find()) {
			MatchResult r = m.toMatchResult();
			DVariable2Parameter c = new DVariable2Parameter(s, r.group(3), r.group(4), r.group(5), r.group(1),
					dbRule2hRule);
			return c;
		}

		// DParameter2Parameter
		m = Pattern.compile(parameter2parameter_pattern).matcher(s);
		if (m.find()) {
			MatchResult r = m.toMatchResult();
			DParameter2Parameter c = new DParameter2Parameter(s, r.group(1), r.group(2), dbRule2hRule);
			return c;
		}

		return new DConstraint(s);
	}

	// Playing with regex
	public static void main(String[] args) {

		String variable2literal = "N371R_abstract == \"false\"";
		String variable2literal_pattern = "(\\S+)_(\\S+) == \"(\\S+)\"";

		String variable2variable = "N371L_name == N372R_name";
		String variable2variable_pattern = "(\\S+)_(\\S+) == (\\S+)_(\\S+)";

		System.out.println("---");
		Matcher m = Pattern.compile(variable2literal_pattern).matcher(variable2literal);
		m.find();
		MatchResult res = m.toMatchResult();
		for (int i = 1; i <= res.groupCount(); i++) {
			System.out.println(i + ": " + res.group(i));
		}

		System.out.println("---");
		m = Pattern.compile(variable2variable_pattern).matcher(variable2variable);
		m.find();
		res = m.toMatchResult();
		for (int i = 1; i <= res.groupCount(); i++) {
			System.out.println(i + ": " + res.group(i));
		}

		System.out.println("---");
		String decimal_pattern = "(\\d+\\.?\\d*)";
		m = Pattern.compile(decimal_pattern).matcher("0");
		m.find();
		res = m.toMatchResult();
		for (int i = 1; i <= res.groupCount(); i++) {
			System.out.println(i + ": " + res.group(i));
		}
	}

}
