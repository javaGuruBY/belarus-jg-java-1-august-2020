package com.javaguru.student_vladimir_petranovski.lesson_6.level_3.task_13;

import java.util.Arrays;

class ArrayUtilTest {
    private final ArrayUtil arrayUtil = new ArrayUtil();

    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.coupArrayTest1();
        arrayUtilTest.coupArrayTest2();
        arrayUtilTest.coupArrayTest3();
    }

    public void coupArrayTest1() {
        int[] ar = {1, 2, 3};
        int[] expected = {3, 2, 1};
        arrayUtil.coupArray(ar);
        int[] actual = ar;
        checkResult(Arrays.equals(expected, actual), "coupArrayTest1");
    }

    public void coupArrayTest2() {
        int[] ar = {9, 10, 15, 100};
        int[] expected = {100, 15, 10, 9};
        arrayUtil.coupArray(ar);
        int[] actual = ar;
        checkResult(Arrays.equals(expected, actual), "coupArrayTest2");
    }

    public void coupArrayTest3() {
        int[] ar = {-5, 2, 3, 7, -10};
        int[] expected = {-10, 7, 3, 2, -5};
        arrayUtil.coupArray(ar);
        int[] actual = ar;
        checkResult(Arrays.equals(expected, actual), "coupArrayTest3");
    }

    public  void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = SUCCESS");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }
}
