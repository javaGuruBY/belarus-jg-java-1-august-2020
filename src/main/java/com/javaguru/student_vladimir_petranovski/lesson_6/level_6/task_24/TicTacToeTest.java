package com.javaguru.student_vladimir_petranovski.lesson_6.level_6.task_24;

import java.util.Arrays;

class TicTacToeTest {
    private TicTacToe ticTacToe = new TicTacToe();
    private int[][] arr = new int[3][3];

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.createFieldTestTrue();
        test.createFieldTestFalse();
    }

    public void createFieldTestTrue() {
        int[][] expected = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        int[][] actual = ticTacToe.createField(arr);
        if (Arrays.deepEquals(expected, actual)) {
            System.out.println("TestTrue = SUCCESS");
        } else {
            System.out.println("TestTrue = FAILED");
        }
    }

    public void createFieldTestFalse() {
        int[][] expected = {{0, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        int[][] actual = ticTacToe.createField(arr);
        if (Arrays.deepEquals(expected, actual)) {
            System.out.println("TestFalse = FAILED");
        } else {
            System.out.println("TestFalse = SUCCESS");
        }
    }
}
