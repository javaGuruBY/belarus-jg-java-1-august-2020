package com.javaguru.student_vladimir_petranovski.lesson_6.level_3.task_10;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.countWhetherNumberTestTrue1();
        arrayUtilTest.countWhetherNumberTestTrue2();
        arrayUtilTest.countWhetherNumberTestTrue3();

    }

    ArrayUtil ar = new ArrayUtil();

    int[] arr = {0, 1, 0, 1, 0, 1, 0, 3, 3};

    public void countWhetherNumberTestTrue1() {
        int expected = 3;
        int actual = ar.countWhetherNumber(1);
        checkResult(expected == actual, "countWhetherNumberTestTrue1");
    }

    public void countWhetherNumberTestTrue2() {
        int expected = 4;
        int actual = ar.countWhetherNumber(0);
        checkResult(expected == actual, "countWhetherNumberTestTrue2");
    }

    public void countWhetherNumberTestTrue3() {
        int expected = 2;
        int actual = ar.countWhetherNumber(3);
        checkResult(expected == actual, "countWhetherNumberTestTrue3");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = SUCCESS");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }
}
