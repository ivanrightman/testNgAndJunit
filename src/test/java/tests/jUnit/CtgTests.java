package tests.jUnit;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class CtgTests extends BaseTest {

    @DataProvider
    public static Object[][] doubleOneValue() {
        return new Object[][] {
                {10.0, 0.9999999958776927},
                {10.9, 0.9999999993185872},
                {0.0, 0.0},
                {-1.0, -0.7615941559557649},
        };
    }

    @Test
    @UseDataProvider("doubleOneValue")
    public void checkWithDoubles(double a, double expected) {
        double result = calculator.ctg(a);
        assertEquals(result, expected, 1);
    }
}
