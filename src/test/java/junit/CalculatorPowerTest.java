package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorPowerTest extends CalculatorBaseTest{

    @Test
    @DisplayName("Testing calculator's power method")
    public void testPower() {
        assertEquals(8, calculator.pow(2, 3), 0.01);
    }
}
