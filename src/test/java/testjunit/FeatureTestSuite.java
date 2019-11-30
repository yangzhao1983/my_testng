package testjunit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by kaiser_zhao on 2019/10/15.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculatorTest.class,
        CalculatorTest2.class,
})

public class FeatureTestSuite {
}
