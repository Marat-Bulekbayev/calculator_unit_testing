package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorCotangentTest extends CalculatorBaseTest {

    @Test(groups = {"trigonometric operations test"}, dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testCotangent(double number, double expectedResult) {
        Assert.assertEquals(calculator.ctg(number), expectedResult, 0.01);
    }
}
