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
import emf.util.DataNodeWrapper;
import emf.util.EMFMetaUtil;
import emf.util.EMFResourceUtil;
import emf.util.EObjectLocation;

//TODO: For reasons of maintainability, this class should be spilt into Positive and Negative handling
public class ParseRuleInstance {

	// Name of the rule
	private String ruleName;

	// Original and changed model of an example
	private Resource modelA;
	private Resource modelB;

	// Corresponding objects in A and B
	private Matching matching_A_B;

	// Domain Configuration
	private IDomainConfiguration domainConfig;

	// Bidirectional Traces: eObjects in models to nodes in graphs (and vice
	// versa)
	private Map<EObject, GNode> modelA2lhs;
	private Map<EObject, GNode> modelB2rhs;
	private Map<GNode, EObject> lhs2modelA;
	private Map<GNode, EObject> rhs2modelB;

	// Mapping: attribute value -> special node
	private Map<Object, GNode> attrValue2lhs;
	private Map<Object, GNode> attrValue2rhs;

	// ID Counters ...
	// ... for corresponding nodes
	private IDGenerator counterC;
	// ... for nodes specific to the original model
	private IDGenerator counterA;
	// ... for nodes specific to the changed model
	private IDGenerator counterB;
	// ... for corresponding nodes
	private IDGenerator counterAttr;

	// LHS and RHS graphs
	private GraphT gLHS;
	private GraphT gRHS;

	// Parameters of the rule instance
	ArrayList<GParameter> ruleParameters;

	private RuleInstance instance;

	// In case of NACs, this is the parser that created the positive rule
	// instance we refer to
	private ParseRuleInstance positive;

	// In case of NACs, this is the matching to the LHS of the positive example
	private Matching matching_NAC_LHS;

	/**
	 * Parses a positive example, i.e. a pair of models (original model and
	 * changed model) into LHS and RHS graphs representing a "rule instance".
	 * 
	 * @param modelType
	 * @param ruleName
	 * @param pathA
	 * @param pathB
	 */
	public void parseRuleInstance(String ruleName, String pathA, String pathB) {
		// Init
		if (!new File(pathA).exists() || !new File(pathB).exists()) {
			assert (false);
			return;
		}

		this.ruleName = ruleName;
		this.modelA = EMFResourceUtil.loadModel(pathA);
		this.modelB = EMFResourceUtil.loadModel(pathB);

		// parse and save
		parse(false);
		save();
	}

	public void parseNacExample(String ruleName, String pathA, String pathB, ParseRuleInstance positive) {
		// Init
		if (!new File(pathA).exists() || !new File(pathB).exists()) {
			assert (false);
			return;
		}

		this.ruleName = ruleName;
		this.modelA = EMFResourceUtil.loadModel(pathA);
		this.modelB = EMFResourceUtil.loadModel(pathB);
		this.positive = positive;

		// parse and save
		parse(true);
		save();
	}

	private void parse(boolean isNAC) {

		modelA2lhs = new HashMap<EObject, GNode>();
		modelB2rhs = new HashMap<EObject, GNode>();
		lhs2modelA = new HashMap<GNode, EObject>();
		rhs2modelB = new HashMap<GNode, EObject>();

		attrValue2lhs = new HashMap<Object, GNode>();
		attrValue2rhs = new HashMap<Object, GNode>();

		counterC = new IDGenerator("c", isNAC);
		counterA = new IDGenerator("a", isNAC);
		counterB = new IDGenerator("b", isNAC);
		counterAttr = new IDGenerator("attr", isNAC);

		domainConfig = DomainConfigurationFactory.createDomainConfiguration();
		IMatcher matcher = domainConfig.createMatcher(modelA, modelB);
		System.out.println("Using matcher " + matcher.getClass().getName());
		matching_A_B = matcher.createMatching(modelA, modelB);
		System.out.println("Matching A <-> B: " + matching_A_B);

		if (isNAC) {
			matcher = domainConfig.createMatcher(modelA, positive.modelA);
			matching_NAC_LHS = matcher.createMatching(modelA, positive.modelA);
			System.out.println("Matching NAC <-> LHS: " + matching_A_B);
		}

		gLHS = new GraphT();
		gRHS = new GraphT();

		// Create special nodes for attribute values
		if (domainConfig.treatAttributesAsNodes()) {
			createSpecialAttributeNodes();
		}

		// First, we map the eObjects to graph nodes
		traverseMatching();
		mapObjects(modelA, gLHS, counterA, modelA2lhs, lhs2modelA);
		mapObjects(modelB, gRHS, counterB, modelB2rhs, rhs2modelB);

		// Secondly, for each eReference, we create a corresponding graph edge
		createEdges(modelA, gLHS, modelA2lhs);
		createEdges(modelB, gRHS, modelB2rhs);

		// Parameters
		this.ruleParameters = new ArrayList<GParameter>();
		if (domainConfig.doDeriveParameters()) {
			// Empty parameter list since we retrieve params from maximal rule
		} else {

		}
	}

	/**
	 * Create rule or NAC instance and save it to the DB.
	 * 
	 * @return
	 */
	private void save() {
		// Create instance....
		instance = null;

		if (this.positive != null) {
			instance = new RuleInstance(ruleName, ruleParameters, gLHS, gRHS, true, positive.instance.ruleInsID);
		} else {
			instance = new RuleInstance(ruleName, ruleParameters, gLHS, gRHS);
		}

		// ...and save it
		boolean saved = instance.save();
		assert (saved);
	}

	/**
	 * Traverses the matching and maps all eObjects to graph nodes.
	 */
	private void traverseMatching() {
		for (Correspondence c : matching_A_B.getCorrespondences()) {
			assert (c.getObjA().eClass() == c.getObjB().eClass());
			if (domainConfig.getUnconsideredNodeTypes().contains(c.getObjA().eClass())) {
				continue;
			}

			// Map objects to nodes
			String id = null;
			if (positive == null) {
				id = counterC.generateRuleInstance();
			} else {
				id = counterC.generateNAC(c.getObjA(), true);
			}
			GNode lhsNode = eObject2Node(gLHS, c.getObjA(), id);
			GNode rhsNode = eObject2Node(gRHS, c.getObjB(), id);

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

			if (matching_A_B.isMatched(eObject) || domainConfig.getUnconsideredNodeTypes().contains(eClass)) {
				continue;
			}

			// Map object to node
			String id = null;
			if (positive == null) {
				id = idGen.generateRuleInstance();
			} else {
				id = idGen.generateNAC(eObject, model == modelA);
			}
			GNode node = eObject2Node(graph, eObject, id);

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

	private GNode eObject2Node(GraphT graph, EObject obj, String id) {
		GNode node = new GNode(id, obj.eClass().getName());
		graph.addNode(node);

		// TODO: Handle unnecessary context properly!
		// /* Just to for testing,
		// assume that the node 'EPackage' has been specified by domain expert
		// to be unnecessary context!
		// */
		// if (node.nodeType.equalsIgnoreCase("EPackage")){
		// node.isUnnecessaryContext=true;
		// }

		// attributes
		for (EAttribute eAttribute : obj.eClass().getEAllAttributes()) {
			if (domainConfig.getUnconsideredAttributeTypes().contains(eAttribute)
					|| EMFMetaUtil.isUnconsideredStructualFeature(eAttribute)
					|| !domainConfig.getVisibleAttributeTypes(obj.eClass()).contains(eAttribute)) {
				continue;
			}

			String attName = eAttribute.getName();
			String attType = eAttribute.getEType().getName();
			Object attValue = obj.eGet(eAttribute);
			if (attValue == null) {
				continue;
			}

			if (domainConfig.treatAttributesAsNodes()) {
				// Create special edge to special attribute node
				GNode srcNode = node;
				GNode tgtNode = null;
				if (graph == gLHS) {
					tgtNode = attrValue2lhs.get(attValue);
				} else {
					assert (graph == gRHS);
					tgtNode = attrValue2rhs.get(attValue);
				}

				GEdge edge = new GEdge(srcNode.nodeID, tgtNode.nodeID, attName);
				graph.addEdge(edge);

			} else {
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

	private void createSpecialAttributeNodes() {
		DataNodeWrapper wrapper = new DataNodeWrapper(modelA, modelB);

		for (Object value : wrapper.getDisctinctAttributeValues()) {
			// Map attribute value to special nodes
			String id = null;
			if (positive == null) {
				id = counterAttr.generateRuleInstance();
			} else {
				id = counterAttr.generateNAC(value, true);
			}

			String syntheticType = wrapper.getRepresentativeDataSortElement(value);
			if (syntheticType == null) {
				syntheticType = value.toString();
			}

			GNode lhsNode = new GNode(id, syntheticType);
			GNode rhsNode = new GNode(id, syntheticType);
			gLHS.addNode(lhsNode);
			gRHS.addNode(rhsNode);

			// Store the mapping traces
			attrValue2lhs.put(value, lhsNode);
			attrValue2rhs.put(value, rhsNode);
		}
	}

	protected class IDGenerator {

		private int count;
		private String prefix;
		private boolean isNac;

		protected IDGenerator(String prefix, boolean isNAC) {
			this.prefix = prefix;
			this.count = 0;
		}

		protected String generateNAC(Object oNAC, boolean isLHS) {
			assert (isNac);

			// try to get id from corresponding LHS
			if (prefix.equals("attr")) {
				String id = "n_" + prefix + count;
				count++;

				// if (isLHS && attrValue2lhs.containsKey(o)) {
				// id = attrValue2lhs.get(o).nodeID;
				// }
				// if (attrValue2rhs.containsKey(o)) {
				// id = attrValue2rhs.get(o).nodeID;
				// }
				// if (id == null) {
				// // specific to nac, just count
				// id = "n_" + prefix + count;
				// count++;
				// }

				return id;
			}

			
			String id = null;

			// Try to get corresponding node from positive rule instance
			EObject oPositive = matching_NAC_LHS.getCorresponding((EObject) oNAC);
			
			if (oPositive != null) {
				if (isLHS && positive.modelA2lhs.containsKey(oPositive)) {
					id = positive.modelA2lhs.get(oPositive).nodeID;
				}
				if (positive.modelB2rhs.containsKey(oPositive)) {
					id = positive.modelB2rhs.get(oPositive).nodeID;
				}
			}

			if (id == null) {
				// specific to nac, just count
				id = "n_" + prefix + count;
				count++;
			}

			return id;

		}

		protected String generateRuleInstance() {
			assert (!isNac);

			// just count and increment counter
			String id = prefix + count;
			count++;

			return id;
		}
	}

}
