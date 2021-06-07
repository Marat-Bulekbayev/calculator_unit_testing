package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorPowerTest extends CalculatorBaseTest {

    @Test(dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testPower(double firstNumber, double exponent, double expectedResult) {
        Assert.assertEquals(calculator.pow(firstNumber, exponent), expectedResult);
    }
}
