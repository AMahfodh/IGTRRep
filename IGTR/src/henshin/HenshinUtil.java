package henshin;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.henshin.model.BinaryFormula;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Formula;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.MappingList;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.impl.HenshinPackageImpl;
import org.eclipse.emf.henshin.model.resource.HenshinResourceFactory;

/**
 * Some common Henshin Utils.
 * 
 * @author kehrer
 */
public class HenshinUtil {

	static {
		HenshinPackageImpl.init();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("henshin", new HenshinResourceFactory());
	}

	public static enum FormulaCombineOperator {
		AND, OR, XOR
	}

	public static Module loadModule(File file) {
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);
		Module module = (Module) resource.getContents().get(0);

		return module;
	}

	/**
	 * Serializes a temporary Henshin rule to the system's tmp path.
	 * 
	 * @param rule
	 * @param path
	 */
	public static void serializeTempRule(Rule rule) {
		String path = System.getProperty("java.io.tmpdir");
		Module newModule = HenshinFactory.eINSTANCE.createModule();
		// TransformationSystem newTS =
		// HenshinFactory.eINSTANCE.createTransformationSystem();
		newModule.getUnits().add(rule);

		URI uri = URI.createFileURI(new File(path).getAbsolutePath() + "/temp.henshin");
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add((EObject) newModule);

		Map<String, Boolean> options = new HashMap<String, Boolean>();
		options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

		try {
			resource.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Serializes a Henshin module to the given path.
	 * 
	 * @param module
	 * @param path
	 * 
	 * */
	public static void serializeModule(Module module, String path) {

		String name = module.getName() + ".henshin";

		URI uri = URI.createFileURI(new File(path).getAbsolutePath() + "/" + name);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add((EObject) module);

		Map<String, Boolean> options = new HashMap<String, Boolean>();
		options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

		try {
			resource.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getGraphName(boolean isRHS, boolean isMulti) {
		String res = "";
		if (isMulti) {
			res += "m_";
		}

		if (isRHS) {
			res += "Rhs";
		} else {
			res += "Lhs";
		}

		return res;
	}

	public static boolean isMapped(Node src, Node tgt, MappingList mappings) {
		for (Mapping mapping : mappings) {
			if ((mapping.getOrigin() == src) && (mapping.getImage() == tgt)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Returns whether the node is << preserve >> or not.
	 * 
	 * @param node
	 *            the node to test.
	 * @return true if node is << preserve >>; false otherwise.
	 */
	public static boolean isPreservedNode(Node node) {

		// Load node container
		Object container = node.getGraph().eContainer();

		// Container must be a Rule
		if (!(container instanceof Rule)) {
			return false;
		}

		// Rule that contains the node
		Rule rule = (Rule) container;

		for (Mapping mapping : rule.getMappings()) {

			// Node is preserve node
			if ((mapping.getOrigin() == node) || (mapping.getImage() == node)) {
				return true;
			}
		}

		// Node is not a preserve node
		return false;
	}

	/**
	 * Returns whether the node is << delete >> or not.
	 * 
	 * @param node
	 *            the node to test.
	 * @return true if node is << delete >>; false otherwise.
	 */
	public static boolean isDeletionNode(Node node) {

		// Load node container
		Object container = node.getGraph().eContainer();

		// Container must be a Rule
		if (!(container instanceof Rule)) {
			return false;
		}

		// Rule that contains the node
		Rule rule = (Rule) container;

		for (Mapping mapping : rule.getMappings()) {

			// Node is preserve node
			if (mapping.getOrigin() == node) {
				return false;
			}
		}

		// Node is delete node
		if (rule.getLhs() == node.getGraph()) {
			return true;
		}

		// Node is create node
		return false;
	}

	/**
	 * Returns whether the node is << create >> or not.
	 * 
	 * @param node
	 *            the node to test.
	 * @return true if node is << create >>; false otherwise.
	 */
	public static boolean isCreationNode(Node node) {

		// Load node container
		Object container = node.getGraph().eContainer();

		// Container must be a Rule
		if (!(container instanceof Rule)) {
			return false;
		}

		// Rule that contains the node
		Rule rule = (Rule) container;

		for (Mapping mapping : rule.getMappings()) {

			// Node is preserve node
			if (mapping.getImage() == node) {
				return false;
			}
		}

		// Node is create node
		if (rule.getRhs() == node.getGraph()) {
			return true;
		}

		// Node is delete node
		return false;
	}

	/**
	 * Returns all << delete >> nodes of a rule.
	 * 
	 * @param rule
	 *            the Henshin rule.
	 * @return the << delete >> nodes.
	 */
	public static List<Node> getLHSMinusRHSNodes(Rule rule) {
		List<Node> res = new LinkedList<Node>();
		for (Node lhsNode : rule.getLhs().getNodes()) {
			if (!isNodeMapped(rule.getMappings(), lhsNode)) {
				res.add(lhsNode);
			}
		}

		return res;
	}

	/**
	 * Returns all << create >> nodes of a rule.
	 * 
	 * @param rule
	 *            the Henshin rule.
	 * @return the << create >> nodes.
	 */
	public static List<Node> getRHSMinusLHSNodes(Rule rule) {
		List<Node> res = new LinkedList<Node>();
		for (Node rhsNode : rule.getRhs().getNodes()) {
			if (!isNodeMapped(rule.getMappings(), rhsNode)) {
				res.add(rhsNode);
			}
		}

		return res;
	}

	/**
	 * Returns all LHS nodes of a rule which intersects with a RHS node. These
	 * nodes are << preserve >>.
	 * 
	 * @param rule
	 *            the Henshin rule.
	 * @return the << preserve >> nodes.
	 */
	public static List<Node> getLHSIntersectRHSNodes(Rule rule) {
		List<Node> res = new LinkedList<Node>();
		for (Node lhsNode : rule.getLhs().getNodes()) {
			if (isNodeMapped(rule.getMappings(), lhsNode)) {
				res.add(lhsNode);
			}
		}

		return res;
	}

	/**
	 * Returns all << preserve >> nodes of a rule.
	 * 
	 * @param rule
	 *            the Henshin rule.
	 * @return the << preserve >> nodes.
	 */
	public static List<NodePair> getPreservedNodes(Rule rule) {
		List<NodePair> res = new LinkedList<NodePair>();

		for (Node lhsNode : rule.getLhs().getNodes()) {
			Node rhsNode = getRemoteNode(rule.getMappings(), lhsNode);

			if (rhsNode != null) {
				res.add(new NodePair(lhsNode, rhsNode));
			}
		}

		return res;
	}

	/**
	 * Checks whether the specified node is part of the mappings.
	 * 
	 * @param mappings
	 *            A list of mappings.
	 * @param node
	 *            The node which should be checked for origin or image in one of
	 *            the mappings.
	 * @return true, if the node is mapped
	 */
	public static boolean isNodeMapped(Collection<Mapping> mappings, Node node) {
		return getRemoteNode(mappings, node) != null;
	}

	/**
	 * Returns the image or origin of the specified node. If the node is not
	 * part of a mapping, null will be returned. If the node is part of multiple
	 * mappings, only the first remote node is returned.
	 * 
	 * @param mappings
	 * @param node
	 * @return
	 */
	public static Node getRemoteNode(Collection<Mapping> mappings, Node node) {
		for (Mapping mapping : mappings) {
			if (mapping.getOrigin() == node) {
				return mapping.getImage();
			}
			if (mapping.getImage() == node) {
				return mapping.getOrigin();
			}
		}

		return null;
	}

	public static EAttribute getAttributeDeclaration(Node hNode, String attName) {
		for (EAttribute attType : hNode.getType().getEAllAttributes()) {
			if (attType.getName().equals(attName)) {
				return attType;
			}
		}

		return null;
	}

	public static boolean isDefaultValue(Node hNode, String attName, String value) {
		EAttribute attType = getAttributeDeclaration(hNode, attName);
		if (attType.getDefaultValue() != null) {
			String sValue = value;
			// adjust number format if necessary
			if (attType.getEAttributeType().equals(EcorePackage.eINSTANCE.getEInt())) {
				Double d = Double.parseDouble(value);
				sValue = "" + (int) d.doubleValue();
			}

			return attType.getDefaultValue().toString().equals(sValue);
		}

		// TODO: Treat null values and Strings equally

		return false;
	}

	/**
	 * Returns the mapping of the image and origin node or null if no mapping
	 * exists.
	 * 
	 * @param mappings
	 *            the mappings to search.
	 * @param origin
	 *            the origin node.
	 * @param image
	 *            the image node.
	 * @return the node mapping or null if no mapping exists.
	 */
	public static Mapping findMapping(Collection<Mapping> mappings, Node origin, Node image) {
		for (Mapping mapping : mappings) {
			if (mapping.getImage() == image && mapping.getOrigin() == origin) {
				return mapping;
			}
		}
		return null;
	}

	/**
	 * Checks if the given edge represents a 'creation' edge. This is the case,
	 * if it is contained in a RHS and if there is no corresponding origin edge
	 * in the LHS.
	 * 
	 * @param edge
	 * @return true if the edge could be identified to be a 'creation' edge. In
	 *         every other case this method returns false.
	 */
	public static boolean isCreationEdge(Edge edge) {
		if (edge.getSource() != null && edge.getTarget() != null && edge.getGraph() != null
				&& edge.getGraph().getRule() != null) {
			Rule rule = edge.getGraph().getRule();
			return edge.getGraph().isRhs() && (getEdgeOrigin(edge, rule.getMappings()) == null);
		} else {
			return false;
		}
	}

	/**
	 * Find the origin of an edge.
	 * 
	 * @param edge
	 *            Image edge.
	 * @param mappings
	 *            Mappings.
	 * @return Edge image.
	 */
	public static Edge getEdgeOrigin(Edge edge, List<Mapping> mappings) {
		if (edge.getSource() == null || edge.getTarget() == null) {
			return null;
		}
		Node source = getNodeOrigin(edge.getSource(), mappings);
		Node target = getNodeOrigin(edge.getTarget(), mappings);
		if (source == null || target == null) {
			return null;
		}
		return source.getOutgoing(edge.getType(), target);
	}

	/**
	 * Find the origin of a node with respect to a list of mappings.
	 * 
	 * @param image
	 *            Image node.
	 * @param target
	 *            Target graph.
	 * @param mappings
	 *            Mappings.
	 * @return The image of the node.
	 */
	public static Node getNodeOrigin(Node image, List<Mapping> mappings) {
		Mapping mapping = getNodeOriginMapping(image, mappings);
		return (mapping != null) ? mapping.getOrigin() : null;
	}

	/**
	 * Find the corresponding mapping for a given image node.
	 * 
	 * @param image
	 *            Image node.
	 * @param mappings
	 *            Mappings.
	 * @return Mapping if found, <code>null</code> otherwise.
	 */
	public static Mapping getNodeOriginMapping(Node image, List<Mapping> mappings) {
		for (Mapping mapping : mappings) {
			if (mapping.getImage() == image) {
				return mapping;
			}
		}
		return null;
	}

	/**
	 * This method adds a new Formula to the given LHS. If the LHS already
	 * contains a Formula, a new container Formula will be created under the LHS
	 * where the old Formula and the new Formula will be combined. The old and
	 * the new Formula can be combined with AND, OR or XOR.
	 * 
	 * @param new_formula
	 *            the new Formula
	 * @param lhs
	 *            the containing LHS.
	 * @param operator
	 *            defines how existing Formulas shall be combined with the new
	 *            one.
	 */
	public static void addFormula(Formula new_formula, Graph lhs, FormulaCombineOperator operator) {
		Formula existingFormula = lhs.getFormula();

		if (existingFormula != null) {
			BinaryFormula combiningFormula = null;

			switch (operator) {
			case AND:
				combiningFormula = HenshinFactory.eINSTANCE.createAnd();
				combiningFormula.setLeft(existingFormula);
				combiningFormula.setRight(new_formula);
				lhs.setFormula(combiningFormula);
				break;
			case OR:
				combiningFormula = HenshinFactory.eINSTANCE.createOr();
				combiningFormula.setLeft(existingFormula);
				combiningFormula.setRight(new_formula);
				lhs.setFormula(combiningFormula);
				break;
			case XOR:
				combiningFormula = HenshinFactory.eINSTANCE.createXor();
				combiningFormula.setLeft(existingFormula);
				combiningFormula.setRight(new_formula);
				lhs.setFormula(combiningFormula);
				break;
			}
		} else {

			lhs.setFormula(new_formula);

		}
	}
}