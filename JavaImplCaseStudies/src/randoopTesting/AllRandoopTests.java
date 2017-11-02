package randoopTesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ErrorTest.class, ErrorTest0.class, ErrorTest1.class, RegressionTest.class, RegressionTest0.class,
		RegressionTest1.class, RegressionTest2.class, RegressionTest3.class })
public class AllRandoopTests {

}
