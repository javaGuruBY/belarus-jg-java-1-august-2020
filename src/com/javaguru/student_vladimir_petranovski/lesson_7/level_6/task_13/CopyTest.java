package com.javaguru.student_vladimir_petranovski.lesson_7.level_6.task_13;

import java.util.Arrays;

class CopyTest {
    private Copy copy = new Copy();

    public static void main(String[] args) {
        CopyTest test = new CopyTest();
        test.copyArrayInAnotherArrayTestOne();
        test.copyArrayInAnotherArrayTestTwo();

        test.findLengthFinishArrayTestOne();
        test.findLengthFinishArrayTestTwo();
        test.findLengthFinishArrayTestThree();

        test.copyInRangeTestOne();
        test.copyInRangeTestTwo();
        test.copyInRangeTestThree();
    }

    void copyArrayInAnotherArrayTestOne() {
        int[] in = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = {3, 4, 5, 6, 7};
        int[] actual = copy.copyArrayInAnotherArray(in, 2, 7);
        checkResult(Arrays.equals(expected, actual), "copyArrayInAnotherArrayTestOne");
    }

    void copyArrayInAnotherArrayTestTwo() {
        int[] in = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expected = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] actual = copy.copyArrayInAnotherArray(in, 1, 10);
        checkResult(Arrays.equals(expected, actual), "copyArrayInAnotherArrayTestTwo");
    }

    void findLengthFinishArrayTestOne() {
        int[] in = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = 5;
        int actual = copy.findLengthFinishArray(in, 2, 7);
        checkResult(expected == actual, "findLengthFinishArrayTestOne");
    }

    void findLengthFinishArrayTestTwo() {
        int[] in = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int expected = 0;
        int actual = copy.findLengthFinishArray(in, 1, 5);
        checkResult(expected == actual, "findLengthFinishArrayTestTwo");
    }

    void findLengthFinishArrayTestThree() {
        int[] in = {0, 3, -3, 7, -5, 1, 4, 3, -7, 1};
        int expected = 5;
        int actual = copy.findLengthFinishArray(in, 1, 9);
        checkResult(expected == actual, "findLengthFinishArrayTestThree");
    }

    void copyInRangeTestOne() {
        int[] in = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expected = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] actual = copy.copyInRange(in, 1, 10);
        checkResult(Arrays.equals(expected, actual), "copyInRangeTestOne");
    }

    void copyInRangeTestTwo() {
        int[] in = {0, 3, -22, 7, 9, -1, 4, 3, -6, 1};
        int[] expected = {0, 3, 7, 9, 4, 3};
        int[] actual = copy.copyInRange(in, 0, 9);
        checkResult(Arrays.equals(expected, actual), "copyInRangeTestTwo");
    }

    void copyInRangeTestThree() {
        int[] in = {10, 100, 200, -1, 50, 5, -4, 8, 250, 1000};
        int[] expected = {5, 8};
        int[] actual = copy.copyInRange(in, 5, 8);
        checkResult(Arrays.equals(expected, actual), "copyInRangeTestThree");
    }

    void checkResult(boolean condition, String testName) {
        if(condition) {
            System.out.println(testName + " = SUCCESS");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }
}
