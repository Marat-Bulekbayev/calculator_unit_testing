package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorIsPositiveTest extends CalculatorBaseTest {

    @Test(groups = {"arithmetic operations test"}, testName = "Testing calculator's isPositive method",
            dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testIsPositive(long number, boolean expectedResult, String errorMessage) {
        boolean actualResult = calculator.isPositive(number);
        Assert.assertEquals(actualResult, expectedResult, errorMessage);
    }
}
