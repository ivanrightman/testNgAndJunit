package tests.jUnit;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class SinTests extends BaseTest {

    @DataProvider
    public static Object[][] doubleOneValue() {
        return new Object[][] {
                {10.0, -0.5440211108893698},
                {10.9, -0.9954362533063774},
                {0.0, 0.0},
                {-1.0, -0.8414709848078965},
        };
    }

    @Test
    @UseDataProvider("doubleOneValue")
    public void checkWithDoubles(double a, double expected) {
        double result = calculator.sin(a);
        assertEquals(result, expected, 1);
    }
}
