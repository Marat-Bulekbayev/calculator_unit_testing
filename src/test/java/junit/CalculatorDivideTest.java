package junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorDivideTest extends CalculatorBaseTest {

    @Test
    @DisplayName("Testing calculator's divide method with long values")
    public void testDivideWithLongs() {
        assertEquals(2.5, calculator.div(25L, 10L), .01);
    }

    @Test
    @DisplayName("Testing calculator's divide method with double values")
    public void testDivideWithDoubles() {
        assertEquals(1.5, calculator.div(4.5, 3), .01);
    }

    @Test
    @DisplayName("Testing calculator's divide by zero exception throwing")
    public void testDivideByZero() {
        assertThrows(NumberFormatException.class, () -> calculator.div(25L, 0L));
    }
}
