package inferences;

public class TestInferencesFromJavaTracing {

	
	private void commitLearning() throws Exception {


		// commit generalisation
		int iMinRepeatedMultiObjects = 1;
		new RuleInferenceFromJavaTracing().generaliseRuleInstance(iMinRepeatedMultiObjects);
		
		new AttributeInferenceFromJavaTracing().commit();
	}
	
	public static void main(String[] args) throws Exception {
		new TestInferencesFromJavaTracing().commitLearning();
	}

}
