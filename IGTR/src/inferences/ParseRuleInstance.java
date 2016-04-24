package inferences;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

import emf.domain.DomainConfigurationFactory;
import emf.domain.IDomainConfiguration;
import emf.matching.Correspondence;
import emf.matching.IMatcher;
import emf.matching.Matching;
import emf.util.EMFMetaUtil;
import emf.util.EMFResourceUtil;
import emf.util.EObjectLocation;

public class ParseRuleInstance {

	// Original and changed model of an example
	private Resource modelA;
	private Resource modelB;

	// Corresponding objects in A and B
	private Matching matching;

	// Domain Configuration
	private IDomainConfiguration domainConfig;

	// Bidirectional Traces: eObjects in models to nodes in graphs (and vice versa)
	private Map<EObject, GNode> modelA2lhs;
	private Map<EObject, GNode> modelB2rhs;
	private Map<GNode, EObject> lhs2modelA;
	private Map<GNode, EObject> rhs2modelB;

	// ID Counters ...
	// ... for corresponding nodes
	private IDGenerator counterC;
	// ... for nodes specific to the original model
	private IDGenerator counterA;
	// ... for nodes specific to the changed model
	private IDGenerator counterB;

	// LHS and RHS graphs
	private GraphT gLHS;
	private GraphT gRHS;
	protected int iRuleInstanceID=0;
	
	
	
	/**
	 * Parses an example, i.e. a pair of models (original model and changed
	 * model) into a graph representing a "rule instance".
	 * 
	 * @param modelType
	 * @param ruleName
	 * @param pathA
	 * @param pathB
	 */
	public void parse(String modelType, String ruleName, String pathA, String pathB) {
		
		if (!new File(pathA).exists() || 
			!new File(pathB).exists()){
			return;
		}
		
		modelA = EMFResourceUtil.loadModel(pathA);
		modelB = EMFResourceUtil.loadModel(pathB);

		modelA2lhs = new HashMap<EObject, GNode>();
		modelB2rhs = new HashMap<EObject, GNode>();
		lhs2modelA = new HashMap<GNode, EObject>();
		rhs2modelB = new HashMap<GNode, EObject>();

		counterC = new IDGenerator("c");
		counterA = new IDGenerator("a");
		counterB = new IDGenerator("b");

		domainConfig = DomainConfigurationFactory.createDomainConfiguration(modelType);
		IMatcher matcher = domainConfig.createMatcher(modelA, modelB);
		System.out.println("Using matcher " + matcher.getClass().getName());
		matching = matcher.createMatching(modelA, modelB);
		System.out.println(matching);

		gLHS = new GraphT();
		gRHS = new GraphT();

		// First, we map the eObjects to graph nodes
		traverseMatching();
		mapObjects(modelA, gLHS, counterA, modelA2lhs, lhs2modelA);
		mapObjects(modelB, gRHS, counterB, modelB2rhs, rhs2modelB);

		// Secondly, for each eReference, we create a corresponding graph edge
		createEdges(modelA, gLHS, modelA2lhs);
		createEdges(modelB, gRHS, modelB2rhs);

		// Empty parameter list since we retrieve params from maximal rule
		ArrayList<GParameter> ruleParameters = new ArrayList<GParameter>();		

		
		// Finally, create rule or NAC instance ..
		RuleInstance createNewRule=null;
		
		if (this.iRuleInstanceID!=0){
			createNewRule = new RuleInstance(ruleName, ruleParameters, gLHS, gRHS, true, this.iRuleInstanceID);
		}
		else {
			createNewRule = new RuleInstance(ruleName, ruleParameters, gLHS, gRHS);
		}
		
		// ...and save it
		System.out.println("is it saved? " + createNewRule.save());
		this.iRuleInstanceID=createNewRule.ruleInsID;		
	}

	
	/** 
	 * overload parse method, allowing to instantiate and store NAC examples ..
	 * */
	public void parse(String modelType, String ruleName, String pathA, String pathB, int INACReference) {
		this.iRuleInstanceID=INACReference;
		this.parse(modelType, ruleName, pathA, pathB);
	}
	
	
	
	/**
	 * Traverses the matching and maps all eObjects to graph nodes.
	 */
	private void traverseMatching() {
		for (Correspondence c : matching.getCorrespondences()) {
			assert (c.getObjA().eClass() == c.getObjB().eClass());
			if (domainConfig.getUnconsideredNodeTypes().contains(c.getObjA().eClass())) {
				continue;
			}

			// Map objects to nodes
			String id = counterC.generate();
			GNode lhsNode = eObject2Node(c.getObjA(), id);
			GNode rhsNode = eObject2Node(c.getObjB(), id);
			gLHS.addNode(lhsNode);
			gRHS.addNode(rhsNode);

			// Store the mapping traces
			modelA2lhs.put(c.getObjA(), lhsNode);
			modelB2rhs.put(c.getObjB(), rhsNode);
			lhs2modelA.put(lhsNode, c.getObjA());
			rhs2modelB.put(rhsNode, c.getObjB());
		}
	}

	/**
	 * Traverses the given model and maps all eObjects to graph nodes.
	 * 
	 * @param model
	 * @param graph
	 * @param idGen
	 * @param model2graph
	 * @param graph2model
	 */
	private void mapObjects(Resource model, GraphT graph, IDGenerator idGen, Map<EObject, GNode> model2graph,
			Map<GNode, EObject> graph2model) {
		// Iterate over all model objects
		TreeIterator<EObject> iterator = model.getAllContents();

		while (iterator.hasNext()) {
			EObject eObject = iterator.next();
			EClass eClass = eObject.eClass();

			if (matching.isMatched(eObject) || domainConfig.getUnconsideredNodeTypes().contains(eClass)) {
				continue;
			}

			// Map object to node
			String id = idGen.generate();
			GNode node = eObject2Node(eObject, id);
			graph.addNode(node);

			// Store the mapping traces
			model2graph.put(eObject, node);
			graph2model.put(node, eObject);
		}
	}

	/**
	 * Traverses the given model. For each reference found in the model, a
	 * corresponding graph edge is being created.
	 * 
	 * @param model
	 * @param graph
	 * @param model2Graph
	 */
	private void createEdges(Resource model, GraphT graph, Map<EObject, GNode> model2Graph) {
		// Iterate over all model objects
		TreeIterator<EObject> iterator = model.getAllContents();

		while (iterator.hasNext()) {
			EObject eObject = iterator.next();
			EClass eClass = eObject.eClass();

			if (domainConfig.getUnconsideredNodeTypes().contains(eClass)) {
				continue;
			}

			// Check all eReference types (also inherited)
			for (EReference eReference : eClass.getEAllReferences()) {

				if (EMFMetaUtil.isUnconsideredStructualFeature(eReference)
						|| domainConfig.getUnconsideredEdgeTypes().contains(eReference)) {
					continue;
				}

				// Check the objects reference targets for imports
				if (eReference.isMany()) {
					@SuppressWarnings("unchecked")
					List<EObject> targets = (List<EObject>) eObject.eGet(eReference);

					for (int i = 0; i < targets.size(); i++) {
						EObject target = targets.get(i);
						EObjectLocation location = EMFResourceUtil.locate(model, target);

						if (location == EObjectLocation.PACKAGE_REGISTRY) {
							assert (false);
						} else {
							createEdge(graph, model2Graph, eObject, target, eReference);
						}
					}
				} else {
					EObject target = (EObject) eObject.eGet(eReference);

					if (target != null) {
						EObjectLocation location = EMFResourceUtil.locate(model, target);

						if (location == EObjectLocation.PACKAGE_REGISTRY) {
							assert (false);
						} else {
							createEdge(graph, model2Graph, eObject, target, eReference);
						}
					}
				}
			}
		} // end iterate
	}

	private GNode eObject2Node(EObject obj, String id) {
		GNode node = new GNode(id, obj.eClass().getName());


//TODO: Handle unnecessary context properly!		
//		/* Just to for testing, 
//			assume that the node 'EPackage' has been specified by domain expert to be unnecessary context!
//		*/
//		if (node.nodeType.equalsIgnoreCase("EPackage")){
//			node.isUnnecessaryContext=true;
//		}
		
		
		
		
		// attributes
		for (EAttribute eAttribute : obj.eClass().getEAllAttributes()) {
			if (domainConfig.getUnconsideredAttributeTypes().contains(eAttribute)
					|| EMFMetaUtil.isUnconsideredStructualFeature(eAttribute)) {
				continue;
			}

			String attName = eAttribute.getName();
			String attType = eAttribute.getEType().getName();
			Object attValue = obj.eGet(eAttribute);
			if (attValue != null) {
				node.addAttribute(new GAttribute(attName, attType, attValue.toString()));
			}
		}

		return node;
	}

	private void createEdge(GraphT graph, Map<EObject, GNode> model2Graph, EObject srcObj, EObject tgtObj,
			EReference referenceType) {
		GNode srcNode = model2Graph.get(srcObj);
		GNode tgtNode = model2Graph.get(tgtObj);

		GEdge edge = new GEdge(srcNode.nodeID, tgtNode.nodeID, referenceType.getName());
		graph.addEdge(edge);
	}

	protected class IDGenerator {

		private int count;
		private String prefix;

		protected IDGenerator(String prefix) {
			this.prefix = prefix;
			this.count = 0;
		}

		protected String generate() {
			String id = prefix + count;
			count++;
			return id;
		}
	}

}
