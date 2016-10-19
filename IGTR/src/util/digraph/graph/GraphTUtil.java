package util.digraph.graph;

import inferences.GNode;
import emf.domain.DomainConfigurationFactory;
import emf.domain.IDomainConfiguration;

public class GraphTUtil {

	public static boolean isValueNode(GNode node) {
		IDomainConfiguration domainConfig = DomainConfigurationFactory.createDomainConfiguration();
		return domainConfig.deriveNodeType(node.nodeType) == null;
	}

	public static boolean isNormalNode(GNode node) {
		IDomainConfiguration domainConfig = DomainConfigurationFactory.createDomainConfiguration();
		return domainConfig.deriveNodeType(node.nodeType) != null;
	}
}
