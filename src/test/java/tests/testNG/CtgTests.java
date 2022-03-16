package tests.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CtgTests extends BaseTest {

    @DataProvider
    public static Object[][] doubleOneValue() {
        return new Object[][] {
                {10.0, 0.9999999958776927},
                {10.9, 0.9999999993185872},
                {0.0, 0.0},
                {-1.0, -0.7615941559557649},
        };
    }

    @Test(dataProvider = "doubleOneValue")
    public void checkWithDoubles(double a, double expected) {
        double result = calculator.ctg(a);
        assertEquals(result, expected, "Invalid result");
    }
}
