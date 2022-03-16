package tests.jUnit;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class CosTests extends BaseTest {

    @DataProvider
    public static Object[][] doubleOneValue() {
        return new Object[][] {
                {10.0, -0.8390715290764524},
                {10.9, -0.09542885100095065},
                {0.0, 1.0},
                {-1.0, 0.5403023058681398},
        };
    }

    @Test
    @UseDataProvider("doubleOneValue")
    public void checkWithDoubles(double a, double expected) {
        double result = calculator.cos(a);
        assertEquals(result, expected, 1);
    }
}
