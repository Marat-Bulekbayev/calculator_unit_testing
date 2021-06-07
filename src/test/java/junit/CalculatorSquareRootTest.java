package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorSquareRootTest extends CalculatorBaseTest {

    @Test
    @DisplayName("Testing calculator's square root method")
    public void testSquareRoot() {
        assertEquals(3, calculator.sqrt(9), 0.01);
    }
}
