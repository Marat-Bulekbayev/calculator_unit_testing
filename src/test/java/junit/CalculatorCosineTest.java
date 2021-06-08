package junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorCosineTest extends CalculatorBaseTest {

    @Test
    @DisplayName("Testing calculator's cosine method")
    public void testCosine() {
        double expectedResult = 0.52;
        double actualResult = calculator.cos(45);
        assertEquals(expectedResult, actualResult, 0.01, "Actual result: " + actualResult + " isn't equals to expected: " + expectedResult);
    }
}
