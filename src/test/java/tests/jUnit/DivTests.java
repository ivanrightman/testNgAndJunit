package tests.jUnit;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
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

    @Test
    @UseDataProvider("numberTwoValues")
    public void checkWithNumbers(long a, long b, long expected) {
        long result = calculator.div(a, b);
        assertEquals(result, expected);
    }

    @Test
    @UseDataProvider("doubleTwoValues")
    public void checkWithDoubles(double a, double b, double expected) {
        double result = calculator.div(a, b);
        assertEquals(result, expected, 1);
    }


    @Test
    public void divideByZero() {
        try {
            calculator.div(10, 0);
        } catch (NumberFormatException ex) {
           assertEquals(ex.getMessage(), "Attempt to divide by zero");
        }

    }
}
