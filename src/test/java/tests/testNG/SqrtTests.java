package tests.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SqrtTests extends BaseTest {

    @DataProvider
    public static Object[][] doubleOneValue() {
        return new Object[][] {
                {10.0, 3.1622776601683795},
                {10.9, 3.3015148038438356},
                {0.0, 0},
                {-1.0, 1.0},
        };
    }

    @Test(dataProvider = "doubleOneValue")
    public void checkWithDoubles(double a, double expected) {
        double result = calculator.sqrt(a);
        assertEquals(result, expected, "Invalid result");
    }
}
