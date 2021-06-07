package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorCotangentTest extends CalculatorBaseTest {

    @Test(groups = {"trigonometric operations test"}, testName = "Testing calculator's ctg method",
            dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testCotangent(double number, double expectedResult, double delta, String errorMessage) {
        double actualResult = calculator.ctg(number);
        Assert.assertEquals(actualResult, expectedResult, delta, errorMessage);
    }
}
