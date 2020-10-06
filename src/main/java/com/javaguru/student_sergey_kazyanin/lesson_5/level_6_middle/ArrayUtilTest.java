/*
В классе ArrayUtilTest напишите автоматический тест
для метода int findMaxNumber(int[] array)
из предыдущего задания.

 */
package com.javaguru.student_sergey_kazyanin.lesson_5.level_6_middle;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {


    }

    public void shouldFillArrayWithRandomNumbers() {

    }

    public void shouldFindMaxNumber() {
        int[] array = {34, 66, 23, 77, 3};
        ArrayUtil arrayUtil = new ArrayUtil();
        int actualResult = arrayUtil.findMaxNumber(array);
        int expectedResult = 77;
        printResult(actualResult, expectedResult, "shouldFindMaxNumber");
    }

    public void shouldFindMinNumber() {
        int[] array = {34, 66, 23, 77, 3};
        ArrayUtil arrayUtil = new ArrayUtil();
        int actualResult = arrayUtil.findMinNumber(array);
        int expectedResult = 3;
        printResult(actualResult, expectedResult, "shouldFindMinNumber");
    }

    public void printResult(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " test = PASSED");
        } else {
            System.out.println(testName + " test = FAILURE!!! actualResult = " + actualResult + " | expectedResult = " + expectedResult);
        }
    }
}
