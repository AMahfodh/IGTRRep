package emf.util;

import org.eclipse.emf.ecore.EStructuralFeature;

public class EMFMetaUtil {

	public static boolean isUnconsideredStructualFeature(EStructuralFeature structualFeatureType) {
		if ((structualFeatureType.isChangeable() == false) || (structualFeatureType.isDerived() == true)
				|| (structualFeatureType.isTransient() == true)) {
			return true;
		} else {
			return false;
		}
	}

}
