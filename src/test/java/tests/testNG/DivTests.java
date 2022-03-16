package tests.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DivTests extends BaseTest {

    @DataProvider
    public static Object[][] numberTwoValues() {
        return new Object[][] {
                {10, 23, 0},
                {10, -1, -10},
                {0, 10, 0},
                {-1, 10, 0},
        };
    }

    @DataProvider
    public static Object[][] doubleTwoValues() {
        return new Object[][] {
                {10.0, 23.0, 0.43478260869565216},
                {10.9, -1.0, -10.9},
                {0.0, 10.0, 0.0},
                {-1.0, 10.1, -0.09900990099009901},
        };
    }

    @Test(dataProvider = "numberTwoValues")
    public void checkWithNumbers(long a, long b, long expected) {
        long result = calculator.div(a, b);
        assertEquals(result, expected, "Invalid result");
    }

    @Test(dataProvider = "doubleTwoValues")
    public void checkWithDoubles(double a, double b, double expected) {
        double result = calculator.div(a, b);
        assertEquals(result, expected, "Invalid result");
    }

    @Test(expectedExceptions = {NumberFormatException.class}, expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void divideByZero() {
        long result = calculator.div(10, 0);
    }
}
