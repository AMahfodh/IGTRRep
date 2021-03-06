package inferences;

import henshin.DBRule;
import henshin.DBRuleToHenshinRule;
import henshin.HenshinUtil;

import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Rule;

import com.sun.rowset.CachedRowSetImpl;

import emf.domain.DomainConfigurationFactory;
import emf.domain.IDomainConfiguration;

public class ExportAllToHenshin {

	// Some internal config params
	private static final String ALL_RULES = "allRules";

	// Domain info
	private IDomainConfiguration domainConfig = DomainConfigurationFactory.createDomainConfiguration();

	// Collected rules
	private Collection<DBRule> dbRulesWithoutMO = new ArrayList<DBRule>();
	private Collection<DBRule> dbRulesWithMO = new ArrayList<DBRule>();

	// Mappings
	private Map<DBRule, Rule> dbRule2hRule = new HashMap<DBRule, Rule>();
	private Map<Rule, DBRule> hRule2dbRule = new HashMap<Rule, DBRule>();

	/**
	 * Exporting all abstract (maximal) rules and rules with multi objects. All
	 * rules are stored in a single Henshin module at the given strLocation.
	 * 
	 * @param strLocation
	 * @return
	 * @throws Exception
	 */
	public boolean exportHenshinModel(String strLocation) {
		Module hModule = createHenshinModuleFromDB();
		if (hModule == null) {
			System.out.println("Generating henshin module failed, no file saved!");
			return false;
		} else {
			saveHenshinFile(hModule, strLocation);
			System.out.println("Generating henshin file completed!");
			return true;
		}
	}

	public Module createHenshinModuleFromDB() {
		// Collect and prepare all maximal rules for exporting them
		boolean res = collectAndPrepareRules();
		if (!res) {
			return null;
		}

		// Create module
		Module hModule = createModule(ALL_RULES);

		// Create Henshin rules (without multi-objects)
		System.out.println("Creating Henshin rules ..");
		for (DBRule dbRule : dbRulesWithoutMO) {
			System.out.println(dbRule.name);
			transformRule(dbRule, hModule);
		}

		// Create Henshin rules (with multi-objects)
		System.out.println("Creating Henshin rules with multi-objects ..");
		for (DBRule dbRule : dbRulesWithMO) {
			System.out.println(dbRule.name);
			// transformRule(dbRule, hModule);
		}

		return hModule;
	}

	private boolean collectAndPrepareRules() {
		System.out.println("Preparing all maximal rules ..");

		CachedRowSetImpl crsAllAbstractRule = DBRecord.getByQueryStatement(
				"select CONCAT(Observation_IDREFF,'_', RuleName), Observation_IDREFF, 0 from TblBasicRule "
						+ " where isAbstract=true and isApplicable=true group by CONCAT(RuleName, groupID) "
						+ " union all "
						+ " select CONCAT(RuleName, '_MO') as RuleName, Observation_IDREFF, 1 from TblBasicRule "
						+ " where isAbstract=true and isApplicable=true " + " and isAbstractMO=true;");

		try {
			while (crsAllAbstractRule.next()) {
				DBRule dbRule = new DBRule(crsAllAbstractRule.getString(1), crsAllAbstractRule.getInt(2),
						crsAllAbstractRule.getBoolean(3));

				System.out.println(dbRule);

				if (dbRule.isMulti) {
					dbRulesWithMO.add(dbRule);
				} else {
					dbRulesWithoutMO.add(dbRule);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		// If there is a rule with multi-objects, we do not want the maximal
		// rules that correspond to that rule with MO
		for (Iterator<DBRule> iterator = dbRulesWithoutMO.iterator(); iterator.hasNext();) {
			DBRule dbRule = iterator.next();
			if (hasRuleWithMO(dbRule)) {
				iterator.remove();
			}
		}

		return true;
	}

	private boolean hasRuleWithMO(DBRule ruleWithoutMO) {
		for (DBRule dbRuleMO : dbRulesWithMO) {
			if (dbRuleMO.name.equals(ruleWithoutMO.name + "_MO")) {
				return true;
			}
		}

		return false;
	}

	private Module createModule(String name) {
		// Initialize module
		Module hModule = HenshinFactory.eINSTANCE.createModule();
		hModule.setName(name);

		// Organize imports
		hModule.getImports().add(domainConfig.getEPackage());

		return hModule;
	}

	private void transformRule(DBRule dbRule, Module hModule) {
		DBRuleToHenshinRule ruleTransformer = new DBRuleToHenshinRule();
		Rule hRule = ruleTransformer.transform(dbRule);
		hModule.getUnits().add(hRule);

		dbRule2hRule.put(dbRule, hRule);
		hRule2dbRule.put(hRule, dbRule);
	}

	private void saveHenshinFile(Module hModule, String strLocation) {
		System.out.println("Save Henshin file ..");
		HenshinUtil.serializeModule(hModule, strLocation);
	}

	public static void main(String[] args) throws Exception {
		new ExportAllToHenshin().exportHenshinModel(new File("").getAbsolutePath() + File.separator + "HenshinOutput");
	}
}
