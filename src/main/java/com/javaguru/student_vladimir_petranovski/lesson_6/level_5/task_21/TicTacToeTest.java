package com.javaguru.student_vladimir_petranovski.lesson_6.level_5.task_21;


class TicTacToeTest {
    private TicTacToe ticTacToe = new TicTacToe();

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isWinPositionForDiagonalsTestTrue();
        test.isWinPositionForDiagonalsTestFalseOne();
        test.isWinPositionForDiagonalsTestFalseTwo();
        test.isWinPositionForDiagonalsTestOne();
        test.isWinPositionForDiagonalsTestTwo();
        test.isWinPositionForDiagonalsTestThree();
        test.isWinPositionForDiagonalsTestFour();
    }

    public void isWinPositionForDiagonalsTestTrue() {
        int[][] twoArray = {{-1, 1, 1}, {0, 1, 0}, {1, 1, -1}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPositionForDiagonals(twoArray, 1);
        checkResult(expected == actual, "isWinPositionForDiagonalsTestTrue");
    }

    public void isWinPositionForDiagonalsTestFalseOne() {
        int[][] twoArray = {{-1, 0, 1}, {0, -1, 0}, {1, 1, 0}};
        boolean expected = false;
        boolean actual = ticTacToe.isWinPositionForDiagonals(twoArray, 0);
        checkResult(expected == actual, "isWinPositionForDiagonalsTestFalseOne");
    }

    public void isWinPositionForDiagonalsTestFalseTwo() {
        int[][] twoArray = {{-1, 0, 1}, {0, -1, 0}, {1, 1, 0}};
        boolean expected = false;
        boolean actual = ticTacToe.isWinPositionForDiagonals(twoArray, 1);
        checkResult(expected == actual, "isWinPositionForDiagonalsTestFalseTwo");
    }

    public void isWinPositionForDiagonalsTestOne() {
        int[][] twoArray = {{0, 0, 1}, {0, 0, -1}, {-1, 0, 0}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPositionForDiagonals(twoArray, 0);
        checkResultOne(expected == actual, "isWinPositionForDiagonalsTestOne");
    }

    public void isWinPositionForDiagonalsTestTwo() {
        int[][] twoArray = {{-1, 1, 0}, {0, 0, 1}, {0, -1, -1}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPositionForDiagonals(twoArray, 0);
        checkResultOne(expected == actual, "isWinPositionForDiagonalsTestTwo");
    }

    public void isWinPositionForDiagonalsTestThree() {
        int[][] twoArray = {{1, 0, 1}, {0, 1, 1}, {0, 0, 1}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPositionForDiagonals(twoArray, 1);
        checkResultTwo(expected == actual, "isWinPositionForDiagonalsTestThree");
    }

    public void isWinPositionForDiagonalsTestFour() {
        int[][] twoArray = {{1, -1, 1}, {-1, 1, 0}, {1, 1, -1}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPositionForDiagonals(twoArray, 1);
        checkResultTwo(expected == actual, "isWinPositionForDiagonalsTestFour");
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
