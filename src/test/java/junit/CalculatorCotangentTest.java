package junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorCotangentTest extends CalculatorBaseTest {

    @Test
    @DisplayName("Testing calculator's cotangent method")
    public void testCotangent() {
        double expectedResult = 1.61;
        double actualResult = calculator.ctg(45);
        assertEquals(expectedResult, actualResult, 0.01, "Actual result: " + actualResult + " isn't equals to expected: " + expectedResult);
    }
}
