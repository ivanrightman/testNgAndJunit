package tests.jUnit;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static java.lang.Double.NaN;
import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
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

    @Test
    @UseDataProvider("doubleOneValue")
    public void checkWithDoubles(double a, double expected) {
        double result = calculator.tg(a);
        assertEquals(result, expected, 1);
    }
}
