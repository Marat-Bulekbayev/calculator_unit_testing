package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorMultiplyTest extends CalculatorBaseTest {

    @Test
    @DisplayName("Testing calculator's multiply method with long values")
    public void testMultiplyWithLongs() {
        assertEquals(50, calculator.mult(5L, 10L));
    }

    @Test
    @DisplayName("Testing calculator's multiply method with double values")
    public void testMultiplyWithDoubles() {
        assertEquals(13.12, calculator.mult(2.5, 5.25), .12);
    }
}
