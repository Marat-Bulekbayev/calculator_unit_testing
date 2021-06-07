package testng;

import dataprovider.DataProviderForCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorSquareRootTest extends CalculatorBaseTest {

    @Test(dataProvider = "data provider", dataProviderClass = DataProviderForCalculator.class)
    public void testSquareRoot(double firstNumber, double expectedResult) {
        Assert.assertEquals(calculator.sqrt(firstNumber), expectedResult, 0.01);
    }
}
