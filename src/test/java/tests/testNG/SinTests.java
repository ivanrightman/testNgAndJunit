package tests.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SinTests extends BaseTest {

    @DataProvider
    public static Object[][] doubleOneValue() {
        return new Object[][] {
                {10.0, -0.5440211108893698},
                {10.9, -0.9954362533063774},
                {0.0, 0.0},
                {-1.0, -0.8414709848078965},
        };
    }

    @Test(dataProvider = "doubleOneValue")
    public void checkWithDoubles(double a, double expected) {
        double result = calculator.sin(a);
        assertEquals(result, expected, "Invalid result");
    }
}
