package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorAddTest extends CalculatorBaseTest{

    @Test
    @DisplayName("Testing calculator's add method with long values")
    public void testAddWithLongs() {
        long expectedResult = 12;
        long actualResult = calculator.sum(5L, 10L);
        assertEquals(expectedResult, actualResult, "Actual result: " + actualResult + " isn't equals to expected: " + expectedResult);
    }

    @Test
    @DisplayName("Testing calculator's add method with double values")
    public void testAddWithDoubles() {
        double expectedResult = 8.2;
        double actualResult = calculator.sum(2.5, 5.25);
        assertEquals(expectedResult, actualResult, 0.01, "Actual result: " + actualResult + " isn't equals to expected: " + expectedResult);
    }
}
