package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorCosineTest extends CalculatorBaseTest {

    @Test(groups = {"trigonometric operations test"}, testName = "Testing calculator's cos method",
            dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testCosine(double number, double expectedResult, double delta, String errorMessage) {
        double actualResult = calculator.cos(number);
        Assert.assertEquals(actualResult, expectedResult, delta, errorMessage);
    }
}
