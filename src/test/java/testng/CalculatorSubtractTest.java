package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorSubtractTest extends CalculatorBaseTest {

    @Test(groups = {"arithmetic operations test"}, dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testSubtractWithLongs(long firstNumber, long secondNumber, long expectedResult) {
        Assert.assertEquals(calculator.sub(firstNumber, secondNumber), expectedResult);
    }

    @Test(groups = {"arithmetic operations test"}, dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testSubtractWithDoubles(double firstNumber, double secondNumber, double expectedResult) {
        Assert.assertEquals(calculator.sub(firstNumber, secondNumber), expectedResult, 0.01);
    }
}
