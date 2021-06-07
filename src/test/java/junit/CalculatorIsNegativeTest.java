package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorIsNegativeTest extends CalculatorBaseTest {

    @Test
    @DisplayName("Testing calculator's isNegative method")
    public void testIsNegative() {
        assertTrue(calculator.isNegative(-10));
    }

    @Test
    @DisplayName("Testing calculator's isNegative method on zero")
    public void testIsZeroNegative() {
        assertFalse(calculator.isNegative(0));
    }
}
