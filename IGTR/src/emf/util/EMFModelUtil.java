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

	public static Set getDistinctAttributeValues(Resource... models) {
		Set res = new HashSet();

		for (Resource model : models) {
			addDisctinctAttributevalues(model, res);
		}

		return res;
	}

	public static void addDisctinctAttributevalues(Resource model, Set values) {
		IDomainConfiguration domainConfig = DomainConfigurationFactory.createDomainConfiguration();
		TreeIterator<EObject> iterator = model.getAllContents();

		while (iterator.hasNext()) {
			EObject eObject = iterator.next();

			for (EAttribute eAttribute : eObject.eClass().getEAllAttributes()) {
				if (domainConfig.getUnconsideredAttributeTypes().contains(eAttribute)
						|| EMFMetaUtil.isUnconsideredStructualFeature(eAttribute)
						|| !domainConfig.getVisibleAttributeTypes().contains(eAttribute)) {
					continue;
				}

				Object attValue = eObject.eGet(eAttribute);
				if (attValue != null && !values.contains(attValue)) {
					values.add(attValue);
				}
			}
		}
	}
}
