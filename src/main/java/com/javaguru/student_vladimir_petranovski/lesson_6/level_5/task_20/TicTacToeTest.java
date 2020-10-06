package com.javaguru.student_vladimir_petranovski.lesson_6.level_5.task_20;


class TicTacToeTest {
    private TicTacToe ticTacToe = new TicTacToe();

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isWinPositionForVerticalsTestTrue();
        test.isWinPositionForVerticalsTestFalseOne();
        test.isWinPositionForVerticalsTestFalseTwo();
        test.isWinPositionForVerticalsTestOne();
        test.isWinPositionForVerticalsTestTwo();
        test.isWinPositionForVerticalsTestThree();
        test.isWinPositionForVerticalsTestFour();
    }

    public void isWinPositionForVerticalsTestTrue() {
        int[][] twoArray = {{-1, 1, 1}, {0, 1, 0}, {1, 1, -1}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPositionForVerticals(twoArray, 1);
        checkResult(expected == actual, "isWinPositionForVerticalsTestTrue");
    }

    public void isWinPositionForVerticalsTestFalseOne() {
        int[][] twoArray = {{-1, 0, 1}, {0, -1, 0}, {1, 1, 0}};
        boolean expected = false;
        boolean actual = ticTacToe.isWinPositionForVerticals(twoArray, 0);
        checkResult(expected == actual, "isWinPositionForVerticalsTestFalseOne");
    }

    public void isWinPositionForVerticalsTestFalseTwo() {
        int[][] twoArray = {{-1, 0, 1}, {0, -1, 0}, {1, 1, 0}};
        boolean expected = false;
        boolean actual = ticTacToe.isWinPositionForVerticals(twoArray, 1);
        checkResult(expected == actual, "isWinPositionForVerticalsTestFalseTwo");
    }

    public void isWinPositionForVerticalsTestOne() {
        int[][] twoArray = {{-1, 0, 1}, {0, 0, -1}, {-1, 0, 1}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPositionForVerticals(twoArray, 0);
        checkResultOne(expected == actual, "isWinPositionForVerticalsTestOne");
    }

    public void isWinPositionForVerticalsTestTwo() {
        int[][] twoArray = {{0, 0, -1}, {0, 0, 1}, {0, -1, -1}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPositionForVerticals(twoArray, 0);
        checkResultOne(expected == actual, "isWinPositionForVerticalsTestTwo");
    }

    public void isWinPositionForVerticalsTestThree() {
        int[][] twoArray = {{1, 0, 1}, {0, -1, 1}, {0, 0, 1}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPositionForVerticals(twoArray, 1);
        checkResultTwo(expected == actual, "isWinPositionForVerticalsTestThree");
    }

    public void isWinPositionForVerticalsTestFour() {
        int[][] twoArray = {{1, -1, 1}, {1, -1, 0}, {1, 1, -1}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPositionForVerticals(twoArray, 1);
        checkResultTwo(expected == actual, "isWinPositionForVerticalsTestFour");
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
