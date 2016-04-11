package emf.matching;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;

import emf.domain.IDomainConfiguration;
import emf.util.EMFModelUtil;

/**
 * XMI-IDs are used as matching criterion. Works only if the resources have XMI
 * IDs, otherwise we can't handle them.
 * 
 */
public class UUIDMatcher extends AbstractMatcher {

	public UUIDMatcher(IDomainConfiguration domainConfiguration) {
		super(domainConfiguration);
		// TODO Auto-generated constructor stub
	}

	/**
	 * We check if the resources really have XMI IDs.
	 */
	@Override
	public boolean canHandle(Resource modelA, Resource modelB) {
		// Check modelA
		if (!checkHasUUIDs(modelA)) {
			return false;
		}

		// Check modelB
		if (!checkHasUUIDs(modelB)) {
			return false;
		}

		// Everything fine
		return true;
	}

	@Override
	protected boolean isCorresponding(EObject elementA, EObject elementB) {
		if (elementA != null && elementB != null) {
			String idA = EMFModelUtil.getXmiId(elementA);
			String idB = EMFModelUtil.getXmiId(elementB);
			if (idA != null && idB != null) {
				return idA.equals(idB);
			}
		}

		return false;
	}

	private boolean checkHasUUIDs(Resource r) {
		// Does resource provide IDs..?
		if (!(r instanceof XMIResource)) {
			return false;
		}

		// Are ids really unique..?
		Map<String, EObject> ids = new HashMap<String, EObject>();

		TreeIterator<EObject> iter = r.getAllContents();
		while (iter.hasNext()) {
			EObject element = iter.next();
			if (domainConfiguration.getUnconsideredNodeTypes().contains(element.eClass())){
				continue;
			}
			
			String id = EMFModelUtil.getXmiId(element);
			if (id == null) {
				return false;
			}

			if (ids.containsKey(id)) {
				return false;
			}

			ids.put(id, element);
		}

		return true;
	}

}
