package com.javaguru.student_vladimir_petranovski.lesson_6.level_3.task_11;

import java.util.Arrays;

class ArrayUtilTest {
    private final ArrayUtil ar = new ArrayUtil();
    private final int arrayLength = 10;
    int[] arr = ar.createArray(arrayLength);

    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.createArrayTest();
        arrayUtilTest.replaceTest1();
        arrayUtilTest.replaceTest2();
        arrayUtilTest.replaceTest3();
    }

    public void createArrayTest() {
        boolean expected = true;
        boolean actual = ar.isCreateArray(arr);
        checkResult(expected == actual, "createArrayTest");
    }

    public void replaceTest1() {
        int[] array = {0, 1, 2, 0, 4, 5, 6, 0, 8, 9};
        int[] expected = {4, 1, 2, 0, 4, 5, 6, 0, 8, 9};
        ar.replace(array, 0, 4);
        int[] actual = array;
        checkResult(Arrays.equals(expected, actual), "replaceTest1");
    }

    public void replaceTest2() {
        int[] array = {0, 1, 2, 0, 1, 5, 6, 0, 8, 1};
        int[] expected = {0, 100, 2, 0, 1, 5, 6, 0, 8, 1};
        ar.replace(array, 1, 100);
        int[] actual = array;
        checkResult(Arrays.equals(expected, actual), "replaceTest2");
    }

    public void replaceTest3() {
        int[] array = {11, 1, 2, 3, 4, 5, 5, 7, 8, 9};
        int[] expected = {11, 1, 2, 3, 4, 11, 5, 7, 8, 9};
        ar.replace(array, 5, 11);
        int[] actual = array;
        checkResult(Arrays.equals(expected, actual), "replaceTest3");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = SUCCESS");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }
}
