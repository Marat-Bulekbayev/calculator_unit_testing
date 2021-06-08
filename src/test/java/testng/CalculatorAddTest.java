package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorAddTest extends CalculatorBaseTest {

    @Test(groups = {"arithmetic operations test"}, testName = "Testing calculator's sum method with longs",
            dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testAddWithLongs(long firstNumber, long secondNumber, long expectedResult, String errorMessage) {
        long actualResult = calculator.sum(firstNumber, secondNumber);
        Assert.assertEquals(actualResult, expectedResult, errorMessage);
    }

    @Test(groups = {"arithmetic operations test"}, testName = "Testing calculator's sum method with doubles",
            dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testAddWithDoubles(double firstNumber, double secondNumber, double expectedResult, double delta, String errorMessage) {
        double actualResult = calculator.sum(firstNumber, secondNumber);
        Assert.assertEquals(actualResult, expectedResult, delta, errorMessage);
    }
}
