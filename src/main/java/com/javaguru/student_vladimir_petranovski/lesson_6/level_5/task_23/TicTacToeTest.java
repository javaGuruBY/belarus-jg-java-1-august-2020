package com.javaguru.student_vladimir_petranovski.lesson_6.level_5.task_23;

class TicTacToeTest {
    private TicTacToe ticTacToe = new TicTacToe();

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isDrawPositionTestTrue();
        test.isDrawPositionTestFalseOne();
        test.isDrawPositionTestOne();
        test.isDrawPositionTestTwo();
        test.isDrawPositionTestThree();
    }

    public void isDrawPositionTestTrue() {
        int[][] twoArray = {{0, 1, 1}, {1, 1, 0}, {0, 0, 1}};
        boolean expected = true;
        boolean actual = ticTacToe.isDrawPosition(twoArray);
        checkResult(expected == actual, "isDrawPositionTestTrue");
    }

    public void isDrawPositionTestFalseOne() {
        int[][] twoArray = {{-1, 0, 1}, {0, -1, 0}, {1, 1, -1}};
        boolean expected = false;
        boolean actual = ticTacToe.isDrawPosition(twoArray);
        checkResult(expected == actual, "isDrawPositionTestFalseOne");
    }

    public void isDrawPositionTestOne() {
        int[][] twoArray = {{0, 1, 0}, {0, 1, 0}, {1, 0, 1}};
        boolean expected = true;
        boolean actual = ticTacToe.isDrawPosition(twoArray);
        checkResultOne(expected == actual, "isDrawPositionTestOne");
    }

    public void isDrawPositionTestTwo() {
        int[][] twoArray = {{0, 1, 1}, {1, 0, 0}, {0, 0, 1}};
        boolean expected = true;
        boolean actual = ticTacToe.isDrawPosition(twoArray);
        checkResultOne(expected == actual, "isDrawPositionTestTwo");
    }

    public void isDrawPositionTestThree() {
        int[][] twoArray = {{0, 1, 1}, {1, 0, 0}, {0, 0, 1}};
        boolean expected = true;
        boolean actual = ticTacToe.isDrawPosition(twoArray);
        checkResultOne(expected == actual, "isDrawPositionTestThree");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = SUCCESS");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }

    public void checkResultOne(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " Позиция ничейная = SUCCESS");
        } else {
            System.out.println(testName + " Позиция ничейная = FAILED");
        }
    }
}
