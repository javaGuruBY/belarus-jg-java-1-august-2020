/*
Task_32
Создайте класс ArrayUtilTest.
В этом классе напишите автоматический тест
метода int[] createArray(int arrayLength)
из предыдущего задания.

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        // Write test implementation here !!!
    }

}

Task_34
В классе ArrayUtilTest напишите автоматический тест
метода void fillArrayWithRandomNumbers(int[] array)
из предыдущего задания.
 */
package com.javaguru.student_sergey_kazyanin.lesson_5.level_5_middle;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
    }

    public void shouldCreateArray() {
        int arraySize = 4;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] actualResult = arrayUtil.createArray(arraySize);
        int[] expectedResult = new int[arraySize];
        printResult(actualResult, expectedResult, "Create Array");
    }

    public void shouldFillArrayWithRandomNumbers() {
        // Write test implementation here !!!
        int arraySize = 4;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] actualResult = arrayUtil.createArray(arraySize);
        for (int i: actualResult) {System.out.println(i);}

        arrayUtil.fillArrayWithRandomNumbers(actualResult);
        for (int i: actualResult) {System.out.println(i);}
        System.out.println();
        arrayUtil.fillArrayWithRandomNumbers(actualResult);
        for (int i: actualResult) {System.out.println(i);}

        int[] expectedResult = new int[arraySize];
        printResult(actualResult, expectedResult, "Put data to Array");

    }

    public void printResult(int[] actualResult, int[] expectedResult, String testName) {
        if (actualResult.length == expectedResult.length) {
            System.out.println(testName + " test = PASSED");
        } else {
            System.out.println(testName + " test = FAILURE!!! actualResult = " + actualResult + " | expectedResult = " + expectedResult);
        }
    }

}
