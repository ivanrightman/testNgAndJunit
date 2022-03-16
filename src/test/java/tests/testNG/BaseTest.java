package tests.testNG;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected Calculator calculator;

    @BeforeClass
    public void start() {
        calculator = new Calculator();
    }

    @AfterClass
    public void stop() {
        calculator = null;
    }
}
