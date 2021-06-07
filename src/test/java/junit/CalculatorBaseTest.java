package junit;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeAll;

public class CalculatorBaseTest {

    protected static Calculator calculator;

    @BeforeAll
    public static void setUp() {
        calculator = new Calculator();
    }
}
