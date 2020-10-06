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
        System.out.println();
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
        int arraySize = 4;
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] testArray = arrayUtil.createArray(arraySize);
        arrayUtil.fillArrayWithRandomNumbers(testArray);
        System.out.println("===========BEGIN TEST Random data ...========");
        int actualResult = sumArrayNumbers(testArray);
//        for (int i: testArray) {System.out.println(i);}
        System.out.println("1st sum - " + actualResult);

        arrayUtil.fillArrayWithRandomNumbers(testArray);
        arrayUtil.fillArrayWithRandomNumbers(testArray);
        arrayUtil.fillArrayWithRandomNumbers(testArray);
        arrayUtil.fillArrayWithRandomNumbers(testArray);
        arrayUtil.fillArrayWithRandomNumbers(testArray);

        int expectedResult = sumArrayNumbers(testArray);
//        for (int i: testArray) {System.out.println(i);}

        System.out.println("2nd sum - " + expectedResult);

        printResult(actualResult, expectedResult, "END TEST Random data to Array");

    }

    public void printResult(int[] actualResult, int[] expectedResult, String testName) {
        if (actualResult.length == expectedResult.length) {
            System.out.println(testName + " test = PASSED");
        } else {
            System.out.println(testName + " test = FAILURE!!! actualResult = " + actualResult + " | expectedResult = " + expectedResult);
        }
    }

    public void printResult(int actualResult, int expectedResult, String testName) {
        if (actualResult != expectedResult) {
            System.out.println(testName + " test = PASSED");
        } else {
            System.out.println(testName + " test = FAILURE!!! actualResult = " + actualResult + " | expectedResult = " + expectedResult);
        }
    }

    public int sumArrayNumbers(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

}
