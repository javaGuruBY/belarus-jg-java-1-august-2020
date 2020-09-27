package com.javaguru.student_vladimir_petranovski.lesson_6.level_6.task_24;
/*
В классе TicTacToe реализуйте метод:

public int[][] createField().

Метод должен создавать двумерный массив целых чисел
и вставлять в каждую ячейку массива -1 (признак пустой клетки).

В классе TicTacToeTest написать тесты для разработанного метода.
 */

class TicTacToe {
    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }
}
