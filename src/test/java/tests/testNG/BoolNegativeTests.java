package tests.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BoolNegativeTests extends BaseTest {

    @DataProvider
    public static Object[][] testData() {
        return new Object[][] {
                {0L, false},
                {1L, false},
        };
    }

    @Test(dataProvider = "testData")
    public void checkIsNegative(long a, boolean expected) {
        boolean result = calculator.isNegative(a);
        assertEquals(result, expected, "Invalid result");
    }
}
