package testng;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;

public class CalculatorBaseTest {

    protected Calculator calculator;

    @BeforeClass(groups = {"setup"})
    public void setUp() {
        calculator = new Calculator();
    }
}
