package tests.jUnit;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;

public class BaseTest {

    protected Calculator calculator;

    @Before
    public void start() {
        calculator = new Calculator();
    }

    @After
    public void stop() {
        calculator = null;
    }
}
