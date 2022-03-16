package tests.jUnit;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class SubTests extends BaseTest {

    @DataProvider
    public static Object[][] numberTwoValues() {
        return new Object[][] {
                {10, 23, -13},
                {10, -1, 11},
                {0, 0, 0},
                {-1, 10, -11},
        };
    }

    @DataProvider
    public static Object[][] doubleTwoValues() {
        return new Object[][] {
                {10.0, 23.0, -13.0},
                {10.9, -1.0, 11.9},
                {0.0, 0.0, 0},
                {-1.0, 10.1, -11.1},
        };
    }

    @Test
    @UseDataProvider("numberTwoValues")
    public void checkWithNumbers(long a, long b, long expected) {
        long result = calculator.sub(a, b);
        assertEquals(result, expected);
    }

    @Test
    @UseDataProvider("doubleTwoValues")
    public void checkWithDoubles(double a, double b, double expected) {
        double result = calculator.sub(a, b);
        assertEquals(result, expected, 1);
    }
}
