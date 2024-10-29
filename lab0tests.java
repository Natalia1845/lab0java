package labs.lab0;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class Variant2TestNG {

    /**
     * Тести для методу integerTask
     */
    @Test(dataProvider = "integerTaskProvider")
    public void integerTaskTest(int M, int expected) {
        int actual = new Variant6().integerTask(M);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] integerTaskProvider() {
        return new Object[][]{
                {1200, 1},  // 1200 кг = 1 тонна
                {2500, 2},  // 2500 кг = 2 тонни
                {999, 0},   // 999 кг = 0 тонн
                {5000, 5},  // 5000 кг = 5 тонн
        };
    }

    //////////////////////////////////////////
    // Тести для методу arrayTask

    @Test(dataProvider = "arrayTaskProvider")
    public void arrayTaskTest(int N, int[] expectedArray) {
        int[] actualArray = new Variant6().arrayTask(N);
        assertEquals(actualArray, expectedArray);
    }

    @DataProvider
    public Object[][] arrayTaskProvider() {
        return new Object[][]{
                {5, new int[]{1, 2, 4, 8, 16}},
                {3, new int[]{1, 2, 4}},
                {1, new int[]{1}},
        };
    }

    //////////////////////////////////////////
    // Тести для методу booleanTask

    @Test(dataProvider = "booleanTaskProvider")
    public void booleanTaskTest(int A, boolean expected) {
        boolean actual = new Variant6().booleanTask(A);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] booleanTaskProvider() {
        return new Object[][]{
                {3, true},  // 3 непарне
                {4, false}, // 4 парне
                {0, false}, // 0 парне
                {-5, true}, // -5 непарне
        };
    }

    //////////////////////////////////////////
    // Тести для методу caseTask

    @Test(dataProvider = "caseTaskProvider")
    public void caseTaskTest(int K, String expected) {
        String actual = new Variant6().caseTask(K);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] caseTaskProvider() {
        return new Object[][]{
                {1, "погано"},
                {2, "незадовільно"},
                {3, "задовільно"},
                {4, "добре"},
                {5, "відмінно"},
                {6, "помилка"},
        };
    }

    //////////////////////////////////////////
    // Тести для методу forTask

    @Test(dataProvider = "forTaskProvider")
    public void forTaskTest(int A, int B, int[] expectedArray) {
        int[] actualArray = new Variant6().forTask(A, B);
        assertEquals(actualArray, expectedArray);
    }

    @DataProvider
    public Object[][] forTaskProvider() {
        return new Object[][]{
                {2, 5, new int[]{2, 3, 4, 5}},
                {1, 3, new int[]{1, 2, 3}},
                {0, 0, new int[]{0}},
        };
    }

    //////////////////////////////////////////
    // Тести для методу ifTask

    @Test(dataProvider = "ifTaskProvider")
    public void ifTaskTest(int number, int expected) {
        int actual = new Variant6().ifTask(number);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] ifTaskProvider() {
        return new Object[][]{
                {5, 6},    // Додати 1, якщо позитивне
                {-3, -5},  // Відняти 2, якщо не позитивне
                {0, -2},   // Відняти 2 для 0
        };
    }

    //////////////////////////////////////////
    // Тести для методу whileTask

    @Test(dataProvider = "whileTaskProvider")
    public void whileTaskTest(int A, int B, int expected) {
        int actual = new Variant6().whileTask(A, B);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] whileTaskProvider() {
        return new Object[][]{
                {20, 3, 6},  // 6 разів відрізок 3 поміщається в 20
                {17, 5, 3},  // 3 рази відрізок 5 поміщається в 17
                {10, 2, 5},  // 5 разів відрізок 2 поміщається в 10
        };
    }

    //////////////////////////////////////////
    // Тести для методу matrixTask

    @Test(dataProvider = "matrixTaskProvider")
    public void matrixTaskTest(int M, int N, int[][] expectedMatrix) {
        int[][] actualMatrix = new Variant6().matrixTask(M, N);
        for (int i = 0; i < M; i++) {
            assertEquals(actualMatrix[i], expectedMatrix[i]);
        }
    }

    @DataProvider
    public Object[][] matrixTaskProvider() {
        return new Object[][]{
                {
                        3, 3,
                        new int[][]{
                                {5, 10, 15},
                                {5, 10, 15},
                                {5, 10, 15}
                        }
                },
                {
                        2, 4,
                        new int[][]{
                                {5, 10, 15, 20},
                                {5, 10, 15, 20}
                        }
                },
        };
    }
}
