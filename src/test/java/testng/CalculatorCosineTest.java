package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorCosineTest extends CalculatorBaseTest {

    @Test(groups = {"trigonometric operations test"}, dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testCosine(double number, double expectedResult) {
        Assert.assertEquals(calculator.cos(number), expectedResult, 0.01);
    }
}
