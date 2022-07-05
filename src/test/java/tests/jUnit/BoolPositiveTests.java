package tests.jUnit;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class BoolPositiveTests extends BaseTest {

    @DataProvider
    public static Object[][] testData() {
        return new Object[][] {
                {0L, false},
                {1L, true},
        };
    }

    @Test
    @UseDataProvider(value = "testData")
    public void checkIsPositive(long a, boolean expected) {
        boolean result = calculator.isPositive(a);
        assertEquals(result, expected);
    }
}
