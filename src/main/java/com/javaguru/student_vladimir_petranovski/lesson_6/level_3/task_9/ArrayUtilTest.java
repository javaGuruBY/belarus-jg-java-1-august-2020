package com.javaguru.student_vladimir_petranovski.lesson_6.level_3.task_9;

class ArrayUtilTest {

    private final ArrayUtil ar = new ArrayUtil();
    private final int arrayLength = 10;

    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.isWhetherAnArraySpecifiedNumberTrue();
        arrayUtilTest.isWhetherAnArraySpecifiedNumberFalse();
    }

    public void isWhetherAnArraySpecifiedNumberTrue() {
        boolean expected = true;
        boolean actual = ar.isWhetherAnArraySpecifiedNumber(arrayLength, 0);
        checkResult(expected == actual, "isWhetherAnArraySpecifiedNumberTrue");
    }

    public void isWhetherAnArraySpecifiedNumberFalse() {
        boolean expected = false;
        boolean actual = ar.isWhetherAnArraySpecifiedNumber(arrayLength, 10);
        checkResult(expected == actual, "isWhetherAnArraySpecifiedNumberFalse");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = SUCCESS");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }
}
