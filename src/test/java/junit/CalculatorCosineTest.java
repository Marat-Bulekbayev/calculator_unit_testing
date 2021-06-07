package junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorCosineTest extends CalculatorBaseTest {

    @Test
    @DisplayName("Testing calculator's cosine method")
    public void testCosine() {
        assertEquals(0.52, calculator.cos(45), 0.01);
    }
}
