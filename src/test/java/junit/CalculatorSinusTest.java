package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorSinusTest extends CalculatorBaseTest {

    @Test
    @DisplayName("Testing calculator's sinus method")
    public void testSinus() {
        Assertions.assertEquals(0.85, calculator.sin(45), 0.01);
    }
}
