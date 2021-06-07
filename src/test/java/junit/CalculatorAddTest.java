package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorAddTest extends CalculatorBaseTest{

    @Test
    @DisplayName("Testing calculator's add method with long values")
    public void testAddWithLongs() {
        assertEquals(15, calculator.sum(5L, 10L));
    }

    @Test
    @DisplayName("Testing calculator's add method with double values")
    public void testAddWithDoubles() {
        assertEquals(7.75, calculator.sum(2.5, 5.25), .01);
    }
}
