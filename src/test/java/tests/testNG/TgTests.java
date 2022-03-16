package tests.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;
import static org.testng.Assert.assertEquals;

public class TgTests extends BaseTest {

    @DataProvider
    public static Object[][] doubleOneValue() {
        return new Object[][] {
                {10.0, 1.0},
                {10.9, 1.0},
                {0.0, NaN},
                {-1.0, 1.0},
        };
    }

    @Test(dataProvider = "doubleOneValue")
    public void checkWithDoubles(double a, double expected) {
        double result = calculator.tg(a);
        assertEquals(result, expected, "Invalid result");
    }
}
