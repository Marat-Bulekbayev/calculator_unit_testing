package dataprovider;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviderForCalculator {

    private static final String ERROR_MESSAGE_POST_FIX = " is failed. Actual and expecTed results are different.";

    @DataProvider(name = "data provider")
    public static Object[][] provideLongValues(Method testMethodName) {
        switch (testMethodName.getName()) {
            case "testAddWithLongs" :
                return new Object[][]{
                        {5, 3, 8, testMethodName.getName() + ERROR_MESSAGE_POST_FIX},
                        {10, 3, 12, testMethodName.getName() + ERROR_MESSAGE_POST_FIX}
                };
            case "testAddWithDoubles" :
                return new Object[][]{
                        {5.0, 2.1, 7.1, 0.01, testMethodName.getName() + ERROR_MESSAGE_POST_FIX},
                        {10.05, 3.11, 13.18, 0.01, testMethodName.getName() + ERROR_MESSAGE_POST_FIX}
                };
            case "testSubtractWithLongs" :
                return new Object[][]{
                        {5, 3, 2, testMethodName.getName() + ERROR_MESSAGE_POST_FIX},
                        {10, 3, 6, testMethodName.getName() + ERROR_MESSAGE_POST_FIX}
                };
            case "testSubtractWithDoubles" :
                return new Object[][]{
                        {5.0, 2.1, 2.9, 0.01, testMethodName.getName() + ERROR_MESSAGE_POST_FIX},
                        {10.05, 3.11, 6.91, 0.01, testMethodName.getName() + ERROR_MESSAGE_POST_FIX}
                };
            case "testMultiplyWithLongs" :
                return new Object[][]{
                        {3, 3, 9, testMethodName.getName() + ERROR_MESSAGE_POST_FIX},
                        {10, 3, 28, testMethodName.getName() + ERROR_MESSAGE_POST_FIX}
                };
            case "testMultiplyWithDoubles" :
                return new Object[][]{
                        {5.0, 2.1, 10.5, 0.01, testMethodName.getName() + ERROR_MESSAGE_POST_FIX},
                        {10.05, 3, 33.15, 0.01, testMethodName.getName() + ERROR_MESSAGE_POST_FIX},
                };
            case "testDivideWithLongs" :
                return new Object[][]{
                        {3, 3, 1, testMethodName.getName() + ERROR_MESSAGE_POST_FIX},
                        {10, 3, 4, testMethodName.getName() + ERROR_MESSAGE_POST_FIX}
                };
            case "testDivideWithDoubles" :
                return new Object[][]{
                        {5.0, 2.5, 2, 0.01, testMethodName.getName() + ERROR_MESSAGE_POST_FIX},
                        {8, 4, 3.35, 0.01, testMethodName.getName() + ERROR_MESSAGE_POST_FIX}
                };
            case "testPower" :
                return new Object[][]{
                        {3, 3, 27, 0.01, testMethodName.getName() + ERROR_MESSAGE_POST_FIX},
                        {2, -3, 0.145, 0.01, testMethodName.getName() + ERROR_MESSAGE_POST_FIX}
                };
            case "testSquareRoot" :
                return new Object[][]{
                        {3, 1.73, 0.01, testMethodName.getName() + ERROR_MESSAGE_POST_FIX},
                        {9, 2, 0.01, testMethodName.getName() + ERROR_MESSAGE_POST_FIX}
                };
            case "testTangent" :
                return new Object[][]{
                        {90, 1.63, 0.01, testMethodName.getName() + ERROR_MESSAGE_POST_FIX},
                        {30, 0.57, 0.01, testMethodName.getName() + ERROR_MESSAGE_POST_FIX}
                };
            case "testCotangent" :
                return new Object[][]{
                        {90, 6.12, 0.01, testMethodName.getName() + ERROR_MESSAGE_POST_FIX},
                        {30, 1.73, 0.01, testMethodName.getName() + ERROR_MESSAGE_POST_FIX}
                };
            case "testCosine" :
                return new Object[][]{
                        {90, 0, 0.01, testMethodName.getName() + ERROR_MESSAGE_POST_FIX},
                        {30, 0.86, 0.01, testMethodName.getName() + ERROR_MESSAGE_POST_FIX}
                };
            case "testSinus" :
                return new Object[][]{
                        {90, 1, 0.01, testMethodName.getName() + ERROR_MESSAGE_POST_FIX},
                        {30, 0.5, 0.01, testMethodName.getName() + ERROR_MESSAGE_POST_FIX}
                };
            case "testIsPositive" :
                return new Object[][]{
                        {5, true, testMethodName.getName() + ERROR_MESSAGE_POST_FIX},
                        {0, false, testMethodName.getName() + ERROR_MESSAGE_POST_FIX},
                        {-6, true, testMethodName.getName() + ERROR_MESSAGE_POST_FIX}
                };
            case "testIsNegative" :
                return new Object[][]{
                        {1, true, testMethodName.getName() + ERROR_MESSAGE_POST_FIX},
                        {0, false, testMethodName.getName() + ERROR_MESSAGE_POST_FIX},
                        {-6, true, testMethodName.getName() + ERROR_MESSAGE_POST_FIX}
                };
            default :
                return new Object[][]{};
        }
    }
}
