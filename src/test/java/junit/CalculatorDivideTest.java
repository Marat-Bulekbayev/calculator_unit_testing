package junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorDivideTest extends CalculatorBaseTest {

    @Test
    @DisplayName("Testing calculator's divide method with long values")
    public void testDivideWithLongs() {
        double expectedResult = 1.61;
        double actualResult = calculator.ctg(45);
        assertEquals(expectedResult, actualResult, 0.01, "Actual result: " + actualResult + " isn't equals to expected: " + expectedResult);
    }

    @Test
    @DisplayName("Testing calculator's divide method with double values")
    public void testDivideWithDoubles() {
        double expectedResult = 1.61;
        double actualResult = calculator.div(4.5, 3);
        assertEquals(expectedResult, actualResult, 0.01, "Actual result: " + actualResult + " isn't equals to expected: " + expectedResult);
    }

    @Test
    @DisplayName("Testing calculator's divide by zero exception throwing")
    public void testDivideByZero() {
        assertThrows(NumberFormatException.class, () -> calculator.div(25L, 0L));
    }
}
