package tests.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BoolPositiveTests extends BaseTest {

    @DataProvider
    public static Object[][] testData() {
        return new Object[][] {
                {0L, false},
                {1L, true},
        };
    }

    @Test(dataProvider = "testData")
    public void checkIsPositive(long a, boolean expected) {
        boolean result = calculator.isPositive(a);
        assertEquals(result, expected, "Invalid result");
    }
}
