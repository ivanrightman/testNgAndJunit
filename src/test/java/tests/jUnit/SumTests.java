package tests.jUnit;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class SumTests extends BaseTest {

    @DataProvider
    public static Object[][] numberTwoValues() {
        return new Object[][] {
                {10, 23, 33},
                {10, -1, 9},
                {0, 0, 0},
                {-1, 10, 9},
        };
    }

    @DataProvider
    public static Object[][] doubleTwoValues() {
        return new Object[][] {
                {10.0, 23.0, 33.0},
                {10.9, -1.0, 9.9},
                {0.0, 0.0, 0},
                {-1.0, 10.1, 9.1},
        };
    }

    @Test
    @UseDataProvider("numberTwoValues")
    public void checkWithNumbers(long a, long b, long expected) {
        long result = calculator.sum(a, b);
        assertEquals(result, expected);
    }

    @Test
    @UseDataProvider("numberTwoValues")
    public void checkWithDoubles(double a, double b, double expected) {
        double result = calculator.sum(a, b);
        assertEquals(result, expected, 1);
    }
}
