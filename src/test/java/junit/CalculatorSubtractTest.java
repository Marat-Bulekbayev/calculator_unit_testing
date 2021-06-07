package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorSubtractTest extends CalculatorBaseTest{

    @Test
    @DisplayName("Testing calculator's subtract method with long values")
    public void testSubtractWithLongs() {
        assertEquals(-5, calculator.sub(5L, 10L));
    }

    @Test
    @DisplayName("Testing calculator's subtract method with double values")
    public void testSubtractWithDoubles() {
        assertEquals(-2.75, calculator.sub(2.5, 5.25), .01);
    }
}
