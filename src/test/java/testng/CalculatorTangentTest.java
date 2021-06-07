package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTangentTest extends CalculatorBaseTest {

    @Test(groups = {"trigonometric operations test"}, dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testTangent(double number, double expectedResult) {
        Assert.assertEquals(calculator.tg(number), expectedResult, 0.01);
    }
}
