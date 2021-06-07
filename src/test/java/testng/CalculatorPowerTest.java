package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorPowerTest extends CalculatorBaseTest {

    @Test(groups = {"arithmetic operations test"}, testName = "Testing calculator's pow method",
            dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testPower(double firstNumber, double exponent, double expectedResult, double delta, String errorMessage) {
        double actualResult = calculator.pow(firstNumber, exponent);
        Assert.assertEquals(actualResult, expectedResult, delta, errorMessage);
    }
}
