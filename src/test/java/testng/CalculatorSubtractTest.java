package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorSubtractTest extends CalculatorBaseTest {

    @Test(groups = {"arithmetic operations test"}, testName = "Testing calculator's sub method with longs",
            dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testSubtractWithLongs(long firstNumber, long secondNumber, long expectedResult, String errorMessage) {
        long actualResult = calculator.sub(firstNumber, secondNumber);
        Assert.assertEquals(actualResult, expectedResult, errorMessage);
    }

    @Test(groups = {"arithmetic operations test"}, testName = "Testing calculator's sub method with doubles",
            dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testSubtractWithDoubles(double firstNumber, double secondNumber, double expectedResult, double delta, String errorMessage) {
        double actualResult = calculator.sub(firstNumber, secondNumber);
        Assert.assertEquals(actualResult, expectedResult, delta, errorMessage);
    }
}
