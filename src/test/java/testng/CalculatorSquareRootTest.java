package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorSquareRootTest extends CalculatorBaseTest {

    @Test(groups = {"arithmetic operations test"}, testName = "Testing calculator's sqrt method",
            dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testSquareRoot(double firstNumber, double expectedResult, double delta, String errorMessage) {
        double actualResult = calculator.sqrt(firstNumber);
        Assert.assertEquals(actualResult, expectedResult, delta, errorMessage);
    }
}
