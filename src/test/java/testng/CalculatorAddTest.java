package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorAddTest extends CalculatorBaseTest {

    @Test(groups = {"arithmetic operations test"},
            description = "Testing calculator's sum method",
            dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testAddWithLongs(long firstNumber, long secondNumber, long expectedResult) {
        Assert.assertEquals(calculator.sum(firstNumber, secondNumber), expectedResult);
    }

    @Test(groups = {"arithmetic operations test"}, dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testAddWithDoubles(double firstNumber, double secondNumber, double expectedResult) {
        Assert.assertEquals(calculator.sum(firstNumber, secondNumber), expectedResult, 0.01);
    }
}
