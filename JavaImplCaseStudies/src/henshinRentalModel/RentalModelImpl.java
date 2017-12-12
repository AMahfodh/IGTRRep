package henshinRentalModel;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
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
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.impl.HenshinPackageImpl;
import org.eclipse.emf.henshin.model.resource.HenshinResourceFactory;

import org.eclipse.emf.henshin.interpreter.Engine;

import inferences.ExportAllToHenshin;
import rentalServiceModel.impl.RentalServicePackageImpl;

public class RentalModelImpl implements IRentalModel {

	private Module henshinModule;
	private JObjectGraph2EMFObjectGraph jObjectGraph2EMFObjectGraph;

	static {
		HenshinPackageImpl.init();
		RentalServicePackageImpl.init();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("henshin", new HenshinResourceFactory());
		m.put("xmi", new XMIResourceFactoryImpl());

	}

	@Override
	public void initRulesFromVCs() {
		System.out.println(this.getClass().getName() + "::  initRulesFromVCs");

		henshinModule = new ExportAllToHenshin().createHenshinModuleFromDB();

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
		Copier copier = new Copier();
		Collection<EObject> clone = copier.copyAll(jObjectGraph2EMFObjectGraph.allEObjects);
		copier.copyReferences();

		System.out.println("---");
		for (EObject eObject : clone) {
			System.out.println(eObject);
		}
		System.out.println("---");

		UnitApplication unitApplication = createUnitApplication(ruleName, args, clone);
		return unitApplication.execute(null);
	}

	@Override
	public void applyRule(String ruleName, List<RuleArgument> args) {
		UnitApplication unitApplication = createUnitApplication(ruleName, args, jObjectGraph2EMFObjectGraph.allEObjects);
		unitApplication.execute(null);
	}

	@Override
	public void dumpHenshinRules(String moduleName) {
		serialize(henshinModule, new File("").getAbsolutePath() + File.separator + "HenshinOutput", moduleName,
				"henshin");
	}

	@Override
	public void dumpObjectModel(String modelName) {
		System.out.println("---");
		for (EObject eObject : jObjectGraph2EMFObjectGraph.allEObjects) {
			System.out.println(eObject);
		}
		System.out.println("---");

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

	private UnitApplication createUnitApplication(String ruleName, List<RuleArgument> args,
			Collection<EObject> eObjects) {
		// Engine
		Engine engine = new EngineImpl();

		// Graph
		EGraph graph = new EGraphImpl();
		for (EObject eObject : eObjects) {
			graph.add(eObject);
		}

		// Unit
		Unit unit = henshinModule.getUnit("");

		// UnitApplication
		UnitApplication unitApplication = new UnitApplicationImpl(engine);
		unitApplication.setEGraph(graph);
		unitApplication.setUnit(unit);

		// Params
		for (RuleArgument arg : args) {
			unitApplication.setParameterValue(arg.getParamName(), arg.getParamValue());
		}

		return unitApplication;
	}

}
