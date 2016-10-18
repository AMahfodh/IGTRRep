package emf.util;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;

import emf.domain.DomainConfigurationFactory;
import emf.domain.IDomainConfiguration;

public class EMFModelUtil {

	/**
	 * Returns the xmi:id attribute value for the given eObject as a
	 * <tt>String</tt>. Returns <b>null</b> in case there's no containing
	 * resource or the eObject simply does not have an xmi:id attribute.
	 */
	public static String getXmiId(EObject eObject) {
		String objectID = null;
		if (eObject != null && eObject.eResource() instanceof XMIResource) {
			objectID = ((XMIResource) eObject.eResource()).getID(eObject);
		}
		return objectID;
	}

}
