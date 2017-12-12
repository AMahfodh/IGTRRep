package henshinRentalModel;

import java.util.List;

/**
 * Main API for communicating with Henshin during experiments. Encapsulates
 * internal EMF object model and the Henshin rules designated to operate on
 * this.
 */
public interface IRentalModel {

	/**
	 * Read from DB and derive Henshin rules.
	 */
	public void initRulesFromVCs();

	/**
	 * Initializes an EMF model from the Java objects, container is top-most
	 * container (e.g. Rental)
	 * 
	 * @param container
	 */
	public void initObjectModel(Object container);

	/**
	 * Tests if the rule with name ruleName is applicable. This test is free of
	 * side-effects, i.e., it does not change the state of internal object
	 * model.
	 * 
	 * @param ruleName
	 * @param args
	 * @return
	 */
	public boolean isRuleApplicable(String ruleName, List<RuleArgument> args);

	/**
	 * Assumes that the rule with name ruleName is applicable. The application
	 * of this rule leads to an update of the internal object model.
	 * 
	 * @param ruleName
	 *            The name of the Henshin rule which is to be applied.
	 * @param args
	 *            List of actual parameters to be passed to the rule.
	 */
	public void applyRule(String ruleName, List<RuleArgument> args);
	
	
	/**
	 * This is only useful for debugging, it serializes the current Henshin rules derived from VCs.
	 * 
	 * @param moduleName
	 */
	public void dumpHenshinRules(String moduleName);
	
	/**
	 * This is only useful for debugging, it serializes the current state of the EMF object model.
	 * 
	 * @param modelName
	 */
	public void dumpObjectModel(String modelName);
}