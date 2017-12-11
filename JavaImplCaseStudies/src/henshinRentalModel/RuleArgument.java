package henshinRentalModel;

public class RuleArgument {

	private String paramName;
	
	private Object paramValue;

	public RuleArgument(String paramName, Object paramValue) {
		super();
		this.paramName = paramName;
		this.paramValue = paramValue;
	}

	public String getParamName() {
		return paramName;
	}

	public Object getParamValue() {
		return paramValue;
	}
	
}
