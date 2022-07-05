package tests.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CosTests extends BaseTest {

    @DataProvider
    public static Object[][] doubleOneValue() {
        return new Object[][] {
                {10.0, -0.8390715290764524},
                {10.9, -0.09542885100095065},
                {0.0, 1.0},
                {-1.0, 0.5403023058681398},
        };
    }

    @Test(dataProvider = "doubleOneValue")
    public void checkWithDoubles(double a, double expected) {
        double result = calculator.cos(a);
        assertEquals(result, expected, "Invalid result");
    }
}
