package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorIsNegativeTest extends CalculatorBaseTest {

    @Test(groups = {"arithmetic operations test"}, testName = "Testing calculator's isNegative method",
            dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testIsNegative(long number, boolean expectedResult, String errorMessage) {
        boolean actualResult = calculator.isNegative(number);
        Assert.assertEquals(actualResult, expectedResult, errorMessage);
    }
}
