package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorSinusTest extends CalculatorBaseTest {

    @Test(groups = {"trigonometric operations test"}, dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testSinus(double number, double expectedResult) {
        Assert.assertEquals(calculator.sin(number), expectedResult, 0.01);
    }
}
