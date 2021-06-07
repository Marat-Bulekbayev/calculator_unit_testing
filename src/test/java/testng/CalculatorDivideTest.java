package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorDivideTest extends CalculatorBaseTest {

    @Test(groups = {"arithmetic operations test"}, dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testDivideWithLongs(long firstNumber, long secondNumber, long expectedResult) {
        Assert.assertEquals(calculator.div(firstNumber, secondNumber), expectedResult);
    }

    @Test(groups = {"arithmetic operations test"}, dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testDivideWithDoubles(double firstNumber, double secondNumber, double expectedResult) {
        Assert.assertEquals(calculator.div(firstNumber, secondNumber), expectedResult, .01);
    }

    @Test(groups = {"arithmetic operations test"})
    public void testDivideByZero() {
        assertThrows(NumberFormatException.class, () -> calculator.div(25L, 0L));
    }
}
