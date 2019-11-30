package testng.testproviders;

import org.testng.ITest;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

/**
 * Created by kaiser_zhao on 2019/10/11.
 *
 * If a test class implements this interface, it will receive a special treatment, such as having
 * the test name displayed in the HTML reports.
 */
public class RestResources implements ITest{

    protected String mTestCaseName = "";

    public String getTestName() {
        return this.mTestCaseName;
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp(Method method, Object[] testData) throws Exception {
        String testName = "";
//        if (testData != null && testData.length > 0) {
//            TestParameters testParams = null;
//            // Check if test method has actually received required parameters
//            for (Object testParameter : testData) {
//                if (testParameter instanceof TestParameters) {
//                    testParams = (TestParameters) testParameter;
//                    break;
//                }
//            }
//            if (testParams != null) {
//                testName = testParams.getTestName();
//            }
//        }
        this.mTestCaseName = testName;
    }
}
