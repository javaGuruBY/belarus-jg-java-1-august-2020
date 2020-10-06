package com.javaguru.student_vladimir_petranovski.lesson_5.level_6.task_39;
/*
В классе ArrayUtilTest напишите автоматический тест
для метода int findMinNumber(int[] array)
из предыдущего задания.
class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }
    public void shouldCreateArray() {
        // Write test implementation here !!!
    }
    public void shouldFillArrayWithRandomNumbers() {
        // Write test implementation here !!!
    }
    public void shouldFindMaxNumber() {
        // Write test implementation here !!!
    }
    public void shouldFindMinNumber() {
        // Write test implementation here !!!
    }
}
 */
class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }
    ArrayUtil arrayUtil = new ArrayUtil();
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
        System.out.println();
    }
    public void shouldFindMaxNumber() {
        int[] arr = {-3, 3, 9, -100};
        int expectedMax = 9;
        int actualMax = arrayUtil.findMaxNumber(arr);
        checkResult(expectedMax == actualMax, "Test shouldFindMaxNumber");
        System.out.println();
    }
    public void shouldFindMinNumber() {
        int[] arr = {-3, -100, 10, -100, 15};
        int expectedMin = -100;
        int actualMin = arrayUtil.findMinNumber(arr);
        checkResult(expectedMin == actualMin, "Test shouldFindMinNumber");
    }
    public void checkResult (boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = Ok");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
