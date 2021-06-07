package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorIsPositiveTest extends CalculatorBaseTest {

    @Test
    @DisplayName("Testing calculator's isPositive method")
    public void testIsPositive() {
        assertTrue(calculator.isPositive(10));
    }

    @Test
    @DisplayName("Testing calculator's isPositive method on zero")
    public void testIsZeroPositive() {
        assertFalse(calculator.isPositive(0));
    }
}
