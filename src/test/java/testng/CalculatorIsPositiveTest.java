package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorIsPositiveTest extends CalculatorBaseTest {

    @Test(dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testIsPositive(long number) {
        Assert.assertTrue(calculator.isPositive(number));
    }
}
