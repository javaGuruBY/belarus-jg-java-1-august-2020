package com.javaguru.student_vladimir_petranovski.lesson_6.level_4.task_14;

import java.util.Arrays;

class ArrayUtilTest {
    private final ArrayUtil ra = new ArrayUtil();

    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.sortArrayAscending1();
        arrayUtilTest.sortArrayAscending2();
        arrayUtilTest.sortArrayAscending3();
        arrayUtilTest.sortArrayDescending1();
        arrayUtilTest.sortArrayDescending2();
        arrayUtilTest.sortArrayDescending3();
    }

    public void sortArrayAscending1() {
        int[] array = {1, 4, 2, 8, 3, 5, 7, 6, 10, 4};
        int[] expected = {1, 2, 3, 4, 4, 5, 6, 7, 8, 10};
        ra.sortArrayAscending(array);
        int[] actual = array;
        checkResult(Arrays.equals(expected, actual), "sortArrayAscending1");
    }

    public void sortArrayAscending2() {
        int[] array = {4, 3, 2, 4, 3, 5, -1, 6, 10, 4};
        int[] expected = {-1, 2, 3, 3, 4, 4, 4, 5, 6, 10};
        ra.sortArrayAscending(array);
        int[] actual = array;
        checkResult(Arrays.equals(expected, actual), "sortArrayAscending2");
    }

    public void sortArrayAscending3() {
        int[] array = {-100, 20, 15, 4, 36, 5, -1, 6, 10, -19};
        int[] expected = {-100, -19, -1, 4, 5, 6, 10, 15, 20,36};
        ra.sortArrayAscending(array);
        int[] actual = array;
        checkResult(Arrays.equals(expected, actual), "sortArrayAscending3");
    }

    public void sortArrayDescending1() {
        int[] array = {1, 4, 2, 8, 3, 5, 7, 6, 10, 4};
        int[] expected = {10, 8, 7, 6, 5, 4, 4, 3, 2, 1};
        ra.sortArrayDescending(array);
        int[] actual = array;
        checkResult(Arrays.equals(expected, actual), "sortArrayDescending1");
    }

    public void sortArrayDescending2() {
        int[] array = {4, 3, 2, 4, 3, 5, -1, 6, 10, 4};
        int[] expected = {10, 6, 5, 4, 4, 4, 3, 3, 2, -1};
        ra.sortArrayDescending(array);
        int[] actual = array;
        checkResult(Arrays.equals(expected, actual), "sortArrayDescending2");
    }

    public void sortArrayDescending3() {
        int[] array = {-100, 20, 15, 4, 36, 5, -1, 6, 10, -19};
        int[] expected = {36, 20, 15, 10, 6, 5, 4, -1, -19, -100};
        ra.sortArrayDescending(array);
        int[] actual = array;
        checkResult(Arrays.equals(expected, actual), "sortArrayDescending3");
    }

    public  void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = SUCCESS");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }

}
