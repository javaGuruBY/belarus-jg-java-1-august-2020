package com.javaguru.student_vladimir_petranovski.lesson_6.level_6.task_26;
/*
Создайте в классе TicTacToe метод:

public void printFieldToConsole(int[][] field) {
    // распечатайте поле на консоль в читаемом формате
}
 */

import java.util.Arrays;

class TicTacToe {
    public void printFieldToConsole(int[][] field) {
        for (int[] ints : field) {
            System.out.println(Arrays.toString(ints));
        }

    }
}
