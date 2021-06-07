package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorSinusTest extends CalculatorBaseTest {

    @Test(groups = {"trigonometric operations test"}, testName = "Testing calculator's sin method",
            dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testSinus(double number, double expectedResult, double delta, String errorMessage) {
        double actualResult = calculator.sin(number);
        Assert.assertEquals(actualResult, expectedResult, delta, errorMessage);
    }
}
