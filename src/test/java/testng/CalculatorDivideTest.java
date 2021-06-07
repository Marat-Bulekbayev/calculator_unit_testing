package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorDivideTest extends CalculatorBaseTest {

    @Test(groups = {"arithmetic operations test"}, testName = "Testing calculator's div method with longs",
            dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testDivideWithLongs(long firstNumber, long secondNumber, long expectedResult, String errorMessage) {
        long actualResult = calculator.div(firstNumber, secondNumber);
        Assert.assertEquals(actualResult, expectedResult, errorMessage);
    }

    @Test(groups = {"arithmetic operations test"}, testName = "Testing calculator's div method with doubles",
            dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testDivideWithDoubles(double firstNumber, double secondNumber, double expectedResult, double delta, String errorMessage) {
        double actualResult = calculator.div(firstNumber, secondNumber);
        Assert.assertEquals(actualResult, expectedResult, delta, errorMessage);
    }

    @Test(groups = {"arithmetic operations test"}, testName = "Testing calculator's divide by zero exception")
    public void testDivideByZero() {
        assertThrows(NumberFormatException.class, () -> calculator.div(25L, 0L));
    }
}
