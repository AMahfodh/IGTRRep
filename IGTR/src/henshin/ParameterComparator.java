package henshin;

import java.util.Comparator;

import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.ParameterKind;

public class ParameterComparator implements Comparator<Parameter> {

	@Override
	public int compare(Parameter p1, Parameter p2) {
		if (p1.getKind() == ParameterKind.VAR && p2.getKind() != ParameterKind.VAR){
			return -1;
		}
		
		return p1.getName().compareTo(p2.getName());
	}

}
