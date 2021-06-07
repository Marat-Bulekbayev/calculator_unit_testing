package junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorCotangentTest extends CalculatorBaseTest {

    @Test
    @DisplayName("Testing calculator's cotangent method")
    public void testCotangent() {
        assertEquals(1.61, calculator.ctg(45), 0.01);
    }
}
