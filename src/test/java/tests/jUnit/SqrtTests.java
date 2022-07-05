package tests.jUnit;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class SqrtTests extends BaseTest {

    @DataProvider
    public static Object[][] doubleOneValue() {
        return new Object[][] {
                {10.0, 3.1622776601683795},
                {10.9, 3.3015148038438356},
                {0.0, 0},
                {-1.0, 1.0},
        };
    }

    @Test
    @UseDataProvider("doubleOneValue")
    public void checkWithDoubles(double a, double expected) {
        double result = calculator.sqrt(a);
        assertEquals(result, expected, 1);
    }
}
