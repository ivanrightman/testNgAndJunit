package tests.jUnit;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
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

    @Test
    @UseDataProvider("doubleTwoValues")
    public void checkWithDoubles(double a, double b, double expected) {
        double result = calculator.pow(a, b);
        assertEquals(result, expected, 1);
    }
}
