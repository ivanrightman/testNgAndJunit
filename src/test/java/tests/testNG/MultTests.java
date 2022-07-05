package tests.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MultTests extends BaseTest {

    @DataProvider
    public static Object[][] numberTwoValues() {
        return new Object[][] {
                {10, 23, 230},
                {10, -1, -10},
                {0, 0, 0},
                {-1, 10, -10},
        };
    }

    @DataProvider
    public static Object[][] doubleTwoValues() {
        return new Object[][] {
                {10.0, 23.0, 230.0},
                {10.9, -1.0, -11.0},
                {0.0, 0.0, 0},
                {-1.0, 10.1, -11.0},
        };
    }

    @Test(dataProvider = "numberTwoValues")
    public void checkWithNumbers(long a, long b, long expected) {
        long result = calculator.mult(a, b);
        assertEquals(result, expected, "Invalid result");
    }

    @Test(dataProvider = "doubleTwoValues")
    public void checkWithDoubles(double a, double b, double expected) {
        double result = calculator.mult(a, b);
        assertEquals(result, expected, "Invalid result");
    }
}
