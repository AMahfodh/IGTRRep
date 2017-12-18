package henshinRentalModel;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.impl.HenshinPackageImpl;
import org.eclipse.emf.henshin.model.resource.HenshinResourceFactory;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

import inferences.ExportAllToHenshin;
import rentalServiceModel.RentalServicePackage;
import rentalServiceModel.impl.RentalServicePackageImpl;

public class RentalModelImpl implements IRentalModel {

	static int COUNT = 0;
	
	private Module henshinModule;
	private JObjectGraph2EMFObjectGraph jObjectGraph2EMFObjectGraph;

	static {
		HenshinPackageImpl.init();
		HenshinPackage.eINSTANCE.eClass();
		RentalServicePackageImpl.init();
		RentalServicePackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("henshin", new HenshinResourceFactory());
		m.put("xmi", new XMIResourceFactoryImpl());

	}

	@Override
	public void initRulesFromVCs() {
		System.out.println(this.getClass().getName() + "::  initRulesFromVCs");

		henshinModule = new ExportAllToHenshin().createHenshinModuleFromDB();

		dumpHenshinRules("allRules-" + ++COUNT);
		for (Unit u : henshinModule.getUnits()) {
			System.out.println(u.getName());
		}
	}

	@Override
	public void initObjectModel(Object container) {
		jObjectGraph2EMFObjectGraph = new JRental2EMFRental();
		jObjectGraph2EMFObjectGraph.convert(container);

	}

	@Override
	public boolean isRuleApplicable(String ruleName, List<RuleArgument> args) {
		// We first copy the complete object model
		Copier copier = new Copier();
		Collection<EObject> clone = copier.copyAll(jObjectGraph2EMFObjectGraph.allEObjects);
		copier.copyReferences();

		// And then try to apply the rule on the copy (to not change the
		// original as a side effect)
		return executeRule(ruleName, args, clone);
	}

	@Override
	public void applyRule(String ruleName, List<RuleArgument> args) {
		executeRule(ruleName, args, jObjectGraph2EMFObjectGraph.allEObjects);
	}

	@Override
	public List<RuleArgument> createArgumentList(Object... values) {
		ArrayList<RuleArgument> args = new ArrayList<RuleArgument>();
		int argCount = 0;
		for (Object value : values) {
			argCount++;
			RuleArgument arg = new RuleArgument("Par" + argCount, value);
			args.add(arg);
		}
		
		return args;
	}

	@Override
	public void dumpHenshinRules(String moduleName) {
		serialize(henshinModule, new File("").getAbsolutePath() + File.separator + "HenshinOutput", moduleName,
				"henshin");
	}

	@Override
	public void dumpObjectModel(String modelName) {
		serialize(jObjectGraph2EMFObjectGraph.eRoot,
				new File("").getAbsolutePath() + File.separator + "ObjectModelOutput", modelName, "xmi");
	}

	private void serialize(EObject eObject, String path, String name, String suffix) {
		URI uri = URI.createFileURI(new File(path).getAbsolutePath() + File.separator + name + "." + suffix);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(eObject);

		Map<String, Boolean> options = new HashMap<String, Boolean>();
		options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

		try {
			resource.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private boolean executeRule(String ruleName, List<RuleArgument> args, Collection<EObject> eObjects) {
		// Engine
		Engine engine = new EngineImpl();

		// Graph
		EGraph graph = new EGraphImpl();
		for (EObject eObject : eObjects) {
			graph.add(eObject);
		}

		// Get Rule
		Rule rule = null;
		for (Unit unit : henshinModule.getUnits()) {
			if (unit.getName().substring(unit.getName().indexOf("_") + 1, unit.getName().length()).equalsIgnoreCase(ruleName)){
				rule = (Rule) unit;
			}
		}

		// If rule is not found, it is not applicable (not yet learned)
		if (rule == null){
			return false;
		}
		
		// Only DEBUG
		rule.getAttributeConditions().clear();
		// End DEBUG
		
		// Find all matches
		Iterator<Match> matchFinder = engine.findMatches(rule, graph, null).iterator();

		// Find all matches
		while (matchFinder.hasNext()) {
			System.out.println("MATCH");
			Match match = matchFinder.next();

			// Create Rule Application with prematch, which is actually a
			// complete match)
			RuleApplication ruleApp = new RuleApplicationImpl(engine);
			ruleApp.setEGraph(graph);
			ruleApp.setRule(rule);
			ruleApp.setCompleteMatch(match);

			// Params
			for (RuleArgument arg : args) {
				if (rule.getParameter(arg.getParamName()) != null){
					ruleApp.setParameterValue(arg.getParamName(), arg.getParamValue());
				}
			}

			// And now try to execute
//			boolean success = ruleApp.execute(null);
//			if (success) {
//				return true;
//			}
		}

		return false;
	}

	public void loadModuleFromFile(String path, String filename) {
		HenshinResourceSet resourceSet = new HenshinResourceSet(path);
		this.henshinModule = resourceSet.getModule(filename, false);

//		for (Unit u : henshinModule.getUnits()) {
//			System.out.println(u.getName());
//		}
	}

	public void loadObjectModelFromFile(String file){
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createFileURI(file), true);
		
		ArrayList<EObject> allObjects = new ArrayList<EObject>();
		for (Iterator<EObject> iterator = resource.getAllContents(); iterator.hasNext();) {
			EObject eObject = iterator.next();
			allObjects.add(eObject);			
		}
		jObjectGraph2EMFObjectGraph = new JRental2EMFRental();
		jObjectGraph2EMFObjectGraph.allEObjects = allObjects;		
	}
	
	public static void main(String[] args) {

		RentalModelImpl rentalModel = new RentalModelImpl();
		rentalModel.loadModuleFromFile("../IGTR/HenshinOutput", "allRules.henshin");
	}

}
