package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorIsNegativeTest extends CalculatorBaseTest {

    @Test(dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testIsNegative(long number) {
        Assert.assertTrue(calculator.isNegative(number));
    }
}
