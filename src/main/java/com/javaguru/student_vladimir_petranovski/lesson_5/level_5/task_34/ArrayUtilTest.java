package com.javaguru.student_vladimir_petranovski.lesson_5.level_5.task_34;

import org.w3c.dom.ls.LSOutput;

/*
В классе ArrayUtilTest напишите автоматический тест
метода void fillArrayWithRandomNumbers(int[] array)
из предыдущего задания.
class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
    }
    public void shouldCreateArray() {
        // Write test implementation here !!!
    }
    public void shouldFillArrayWithRandomNumbers() {
        // Write test implementation here !!!
    }
}
 */
class ArrayUtilTest {
    private ArrayUtil arrayUtil = new ArrayUtil();
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
    }
    public void shouldCreateArray() {
        int[] expectedLength = new int[5];
        int[] actualLength = arrayUtil.createArray(5);
        checkResult(expectedLength.length == actualLength.length, "Test shouldCreateArray");
        System.out.println();
    }
    public void shouldFillArrayWithRandomNumbers() {
        int[] expected = {1, 4, 7, -23, -19, -123};
        int[] actual = arrayUtil.createArray(6);
        arrayUtil.fillArrayWithRandomNumbers(actual);
        for (int i = 0; i < expected.length; i++) {
            checkResult(expected[i] != actual[i], "Test shouldFillArrayWithRandomNumbers");
        }
    }
    public void checkResult (boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = Ok");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
