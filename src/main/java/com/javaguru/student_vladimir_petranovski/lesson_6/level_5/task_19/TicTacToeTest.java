package com.javaguru.student_vladimir_petranovski.lesson_6.level_5.task_19;

class TicTacToeTest {
    private TicTacToe ticTacToe = new TicTacToe();

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isWinPositionForHorizontalsTestTrue();
        test.isWinPositionForHorizontalsTestFalseOne();
        test.isWinPositionForHorizontalsTestFalseTwo();
        test.isWinPositionForHorizontalsTestOne();
        test.isWinPositionForHorizontalsTestTwo();
        test.isWinPositionForHorizontalsTestThree();
        test.isWinPositionForHorizontalsTestFour();
    }

    public void isWinPositionForHorizontalsTestTrue() {
        int[][] twoArray = {{-1, 0, 1}, {0, 1, 0}, {1, 1, 1}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPositionForHorizontals(twoArray, 1);
        checkResult(expected == actual, "isWinPositionForHorizontalsTestTrue");
    }

    public void isWinPositionForHorizontalsTestFalseOne() {
        int[][] twoArray = {{-1, 0, 1}, {0, -1, 0}, {1, 1, 0}};
        boolean expected = false;
        boolean actual = ticTacToe.isWinPositionForHorizontals(twoArray, 0);
        checkResult(expected == actual, "isWinPositionForHorizontalsTestFalseOne");
    }

    public void isWinPositionForHorizontalsTestFalseTwo() {
        int[][] twoArray = {{-1, 0, 1}, {0, -1, 0}, {1, 1, 0}};
        boolean expected = false;
        boolean actual = ticTacToe.isWinPositionForHorizontals(twoArray, 1);
        checkResult(expected == actual, "isWinPositionForHorizontalsTestFalseTwo");
    }

    public void isWinPositionForHorizontalsTestOne() {
        int[][] twoArray = {{-1, 0, 1}, {0, 0, 0}, {-1, 0, 1}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPositionForHorizontals(twoArray, 0);
        checkResultOne(expected == actual, "isWinPositionForHorizontalsTestOne");
    }

    public void isWinPositionForHorizontalsTestTwo() {
        int[][] twoArray = {{0, 0, 0}, {-1, 0, 1}, {1, -1, 1}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPositionForHorizontals(twoArray, 0);
        checkResultOne(expected == actual, "isWinPositionForHorizontalsTestTwo");
    }

    public void isWinPositionForHorizontalsTestThree() {
        int[][] twoArray = {{1, 1, 1}, {0, -1, 0}, {0, 0, -1}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPositionForHorizontals(twoArray, 1);
        checkResultTwo(expected == actual, "isWinPositionForHorizontalsTestThree");
    }

    public void isWinPositionForHorizontalsTestFour() {
        int[][] twoArray = {{1, -1, 1}, {0, -1, 0}, {1, 1, 1}};
        boolean expected = true;
        boolean actual = ticTacToe.isWinPositionForHorizontals(twoArray, 1);
        checkResultTwo(expected == actual, "isWinPositionForHorizontalsTestFour");
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
