package com.javaguru.student_vladimir_petranovski.lesson_6.level_3.task_12;

import java.util.Arrays;

class ArrayUtilTest {
    private final ArrayUtil ar = new ArrayUtil();

    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.replaceAllTest1();
        arrayUtilTest.replaceAllTest2();
        arrayUtilTest.replaceAllTest3();
    }


    public void replaceAllTest1() {
        int[] array = {0, 1, 2, 0, 4, 5, 6, 0, 8, 9};
        int[] expected = {4, 1, 2, 4, 4, 5, 6, 4, 8, 9};
        ar.replaceAll(array, 0, 4);
        int[] actual = array;
        checkResult(Arrays.equals(expected, actual), "replaceTest1");
    }

    public void replaceAllTest2() {
        int[] array = {0, 1, 2, 0, 1, 5, 6, 0, 8, 1};
        int[] expected = {0, 100, 2, 0, 100, 5, 6, 0, 8, 100};
        ar.replaceAll(array, 1, 100);
        int[] actual = array;
        checkResult(Arrays.equals(expected, actual), "replaceTest2");
    }

    public void replaceAllTest3() {
        int[] array = {11, 1, 2, 3, 4, 5, 5, 7, 8, 9};
        int[] expected = {11, 1, 2, 3, 4, 11, 11, 7, 8, 9};
        ar.replaceAll(array, 5, 11);
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
