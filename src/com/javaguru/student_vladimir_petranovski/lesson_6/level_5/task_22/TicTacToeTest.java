package com.javaguru.student_vladimir_petranovski.lesson_6.level_5.task_22;


class TicTacToeTest {
    private TicTacToe ticTacToe = new TicTacToe();

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isWinPositionTestTrue();
        test.isWinPositionTestFalseOne();
        test.isWinPositionTestFalseTwo();
        test.isWinPositionTestOne();
        test.isWinPositionTestTwo();
        test.isWinPositionTestThree();
        test.isWinPositionTestFour();
    }

    public void isWinPositionTestTrue() {
        int[][] twoArray = {{-1, 1, 1}, {0, 1, 0}, {1, 1, -1}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPosition(twoArray, 1);
        checkResult(expected == actual, "isWinPositionTestTrue");
    }

    public void isWinPositionTestFalseOne() {
        int[][] twoArray = {{-1, 0, 1}, {0, -1, 0}, {1, 1, 0}};
        boolean expected = false;
        boolean actual = ticTacToe.isWinPosition(twoArray, 0);
        checkResult(expected == actual, "isWinPositionTestFalseOne");
    }

    public void isWinPositionTestFalseTwo() {
        int[][] twoArray = {{-1, 0, 1}, {0, -1, 0}, {1, 1, 0}};
        boolean expected = false;
        boolean actual = ticTacToe.isWinPosition(twoArray, 1);
        checkResult(expected == actual, "isWinPositionTestFalseTwo");
    }

    public void isWinPositionTestOne() {
        int[][] twoArray = {{0, 0, 1}, {0, 0, -1}, {-1, 0, 0}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPosition(twoArray, 0);
        checkResultOne(expected == actual, "isWinPositionTestOne");
    }

    public void isWinPositionTestTwo() {
        int[][] twoArray = {{-1, 1, -1}, {0, 0, 0}, {0, -1, -1}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPosition(twoArray, 0);
        checkResultOne(expected == actual, "isWinPositionTestTwo");
    }

    public void isWinPositionTestThree() {
        int[][] twoArray = {{1, 0, 1}, {0, 1, 1}, {0, 0, 1}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPosition(twoArray, 1);
        checkResultTwo(expected == actual, "isWinPositionTestThree");
    }

    public void isWinPositionTestFour() {
        int[][] twoArray = {{1, 1, 1}, {-1, 1, 0}, {0, 1, -1}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPosition(twoArray, 1);
        checkResultTwo(expected == actual, "isWinPositionTestFour");
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
            System.out.println(testName + " Первый игрок выиграл = SUCCESS");
        } else {
            System.out.println(testName + " Первый игрок выиграл = FAILED");
        }
    }

    public void checkResultTwo(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " Второй игрок выиграл = SUCCESS");
        } else {
            System.out.println(testName + " Второй игрок выиграл = FAILED");
        }
    }
}
