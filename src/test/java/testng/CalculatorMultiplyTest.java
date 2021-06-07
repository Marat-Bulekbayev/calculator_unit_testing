package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorMultiplyTest extends CalculatorBaseTest {

    @Test(groups = {"arithmetic operations test"}, dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testMultiplyWithLongs(long firstNumber, long secondNumber, long expectedResult) {
        Assert.assertEquals(calculator.mult(firstNumber, secondNumber), expectedResult);
    }

    @Test(groups = {"arithmetic operations test"}, dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testMultiplyWithDoubles(double firstNumber, double secondNumber, double expectedResult) {
        Assert.assertEquals(calculator.mult(firstNumber, secondNumber), expectedResult, .01);
    }
}
