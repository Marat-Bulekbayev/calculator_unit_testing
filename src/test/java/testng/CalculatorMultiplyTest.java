package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorMultiplyTest extends CalculatorBaseTest {

    @Test(groups = {"arithmetic operations test"}, testName = "Testing calculator's mult method with longs",
            dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testMultiplyWithLongs(long firstNumber, long secondNumber, long expectedResult, String errorMessage) {
        long actualResult = calculator.mult(firstNumber, secondNumber);
        Assert.assertEquals(actualResult, expectedResult, errorMessage);
    }

    @Test(groups = {"arithmetic operations test"}, testName = "Testing calculator's mult method with doubles",
            dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testMultiplyWithDoubles(double firstNumber, double secondNumber, double expectedResult, double delta, String errorMessage) {
        double actualResult = calculator.mult(firstNumber, secondNumber);
        Assert.assertEquals(actualResult, expectedResult, delta, errorMessage);
    }
}
