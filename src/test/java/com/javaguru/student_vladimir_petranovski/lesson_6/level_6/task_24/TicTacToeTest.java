package com.javaguru.student_vladimir_petranovski.lesson_6.level_6.task_24;

import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeTest {

    @Test
    public void createFieldTest() {
        TicTacToe test =new TicTacToe();
        int[][] arr = new int[3][3];
        int[][] expected = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        test.createField(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                assertEquals(expected[i][j], arr[i][j]);
            }
        }
    }
}