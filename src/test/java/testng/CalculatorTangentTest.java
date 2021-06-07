package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTangentTest extends CalculatorBaseTest {

    @Test(groups = {"trigonometric operations test"}, testName = "Testing calculator's tg method",
            dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testTangent(double number, double expectedResult, double delta, String errorMessage) {
        double actualResult = calculator.tg(number);
        Assert.assertEquals(actualResult, expectedResult, delta, errorMessage);
    }
}
