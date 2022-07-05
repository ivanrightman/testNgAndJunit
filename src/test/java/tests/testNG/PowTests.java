package tests.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PowTests extends BaseTest {

    @DataProvider
    public static Object[][] doubleTwoValues() {
        return new Object[][] {
                {10.0, 23.0, 1.0000000000000001E23},
                {10.9, -1.0, 0.09174311926605504},
                {0.0, 10.0, 0.0},
                {-1.0, 10.1, 1.0},
        };
    }

    @Test(dataProvider = "doubleTwoValues")
    public void checkWithDoubles(double a, double b, double expected) {
        double result = calculator.pow(a, b);
        assertEquals(result, expected, "Invalid result");
    }
}
