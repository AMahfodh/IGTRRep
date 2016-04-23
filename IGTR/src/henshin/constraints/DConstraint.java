package henshin.constraints;

public class DConstraint {

	protected String string;

	public DConstraint(String string) {
		super();
		this.string = string;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "\n\t\texpr: " + string;
	}
}
