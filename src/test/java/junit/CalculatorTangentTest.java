package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTangentTest extends CalculatorBaseTest {

    @Test
    @DisplayName("Testing calculator's tangent method")
    public void testTangent() {
        assertEquals(1.61, calculator.tg(45), 0.01);
    }
}
