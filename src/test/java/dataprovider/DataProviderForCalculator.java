package dataprovider;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviderForCalculator {

    @DataProvider(name = "data provider")
    public static Object[][] provideLongValues(Method testMethodName) {
        switch (testMethodName.getName()) {
            case "testAddWithLongs" :
                return new Object[][]{
                        {5, 3, 8},
                        {10, 3, 13},
                        {-2, 4, 2}
                };
            case "testAddWithDoubles" :
                return new Object[][]{
                        {5.0, 2.1, 7.1},
                        {10.05, 3.11, 13.16},
                        {-2.55, 4, 1.45}
                };
            case "testSubtractWithLongs" :
                return new Object[][]{
                        {5, 3, 2},
                        {10, 3, 7},
                        {-2, 4, -6}
                };
            case "testSubtractWithDoubles" :
                return new Object[][]{
                        {5.0, 2.1, 2.9},
                        {10.05, 3.11, 6.94},
                        {-2.55, 4, -6.55}
                };
            case "testMultiplyWithLongs" :
                return new Object[][]{
                        {3, 3, 9},
                        {10, 3, 30},
                        {-2, 4, -8}
                };
            case "testMultiplyWithDoubles" :
                return new Object[][]{
                        {5.0, 2.1, 10.5},
                        {10.05, 3, 30.15},
                        {-2.55, 4, -10.2}
                };
            case "testDivideWithLongs" :
                return new Object[][]{
                        {3, 3, 1},
                        {10, 3, 3},
                        {-2, 4, 0}
                };
            case "testDivideWithDoubles" :
                return new Object[][]{
                        {5.0, 2.5, 2},
                        {6.75, 3, 2.25},
                        {8, 4, 2}
                };
            case "testPower" :
                return new Object[][]{
                        {3, 3, 27},
                        {2, 2, 4},
                        {2, -3, 0.125}
                };
            case "testSquareRoot" :
                return new Object[][]{
                        {3, 1.73},
                        {2, 1.41},
                        {9, 3}
                };
            case "testTangent" :
                return new Object[][]{
                        {90, 1.63},
                        {45, 1},
                        {30, 0.57}
                };
            case "testCotangent" :
                return new Object[][]{
                        {90, 6.12},
                        {45, 1},
                        {30, 1.73}
                };
            case "testCosine" :
                return new Object[][]{
                        {90, 0},
                        {45, 0.7},
                        {30, 0.86}
                };
            case "testSinus" :
                return new Object[][]{
                        {90, 1},
                        {45, 0.7},
                        {30, 0.5}
                };
            case "testIsPositive" :
                return new Object[][]{
                        {5},
                        {0},
                        {-6}
                };
            case "testIsNegative" :
                return new Object[][]{
                        {1},
                        {0},
                        {-6}
                };
            default :
                return new Object[][]{};
        }
    }
}
