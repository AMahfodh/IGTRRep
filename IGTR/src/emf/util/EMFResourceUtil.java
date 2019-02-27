package emf.util;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.uml.UMLPackage;

import graph.GraphPackage;

/**
 * Static utility functions for dealing with EMF Resources.
 *
 */
public class EMFResourceUtil {

	static {
		// Initialize the required meta-models
		EcorePackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();
		GraphPackage.eINSTANCE.eClass();
				
		// Register the resource factories for the required model types
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("ecore", new XMIResourceFactoryImpl());
		m.put("uml", new XMIResourceFactoryImpl());
		m.put("graph", new XMIResourceFactoryImpl());
	}

	/**
	 * Returns the location of the given eObject from the viewpoint of the given
	 * model Resource. It can be either located in the same Resource, in the
	 * same ResourceSet, or in the global registry.
	 * 
	 * @param model
	 * @param eObject
	 * @return
	 */
	public static EObjectLocation locate(Resource model, EObject eObject) {
		// RESOURCE_INTERNAL..?
		if (contains(model, eObject)) {
			return EObjectLocation.RESOURCE_INTERNAL;
		}

		// RESOURCE_SET_INTERNAL..?
		for (Resource r : model.getResourceSet().getResources()) {
			if (r == model) {
				continue;
			}
			if (contains(r, eObject)) {
				return EObjectLocation.RESOURCE_SET_INTERNAL;
			}
		}

		// Must be found in PACKAGE_REGISTRY
		assert (EPackage.Registry.INSTANCE.containsValue(eObject.eClass().getEPackage())) : "" + eObject;

		return EObjectLocation.PACKAGE_REGISTRY;
	}

	/**
	 * Simply checks whether the given eObject is contained in the given
	 * resource.
	 * 
	 * @param resource
	 * @param eObject
	 * @return
	 */
	public static boolean contains(Resource resource, EObject eObject) {
		for (Iterator<EObject> iterator = resource.getAllContents(); iterator.hasNext();) {
			if (eObject == iterator.next()) {
				return true;
			}
		}

		return false;
	}

	public static Resource loadModel(String path) {
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI.createFileURI(path), true);
		return resource;
	}
}
