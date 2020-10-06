package com.javaguru.student_vladimir_petranovski.lesson_6.level_5.task_21;
/*
В классе TicTacToe реализуйте
метод для определения является ли данная позиция
победной по диагоналям для указанного игрока.

Метод должен иметь следующую сигнатуру:
public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck).

Поле передаётся в этот метод как первый параметр int[][] field.
Знак игрока (0 или 1) передаётся вторым параметром: int playerToCheck.

Метод должет вернуть:
 - true если в одной из диагоналей есть три подряд клетки
   занятые знаком указанного игрока (int playerToCheck),
 - false иначе.

В классе TicTacToeTest написать тесты для разработанного метода.
 */

class TicTacToe {
    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        int countOne =0, countTwo = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (i == j && field[i][j] == playerToCheck) {
                    countOne++;
                } if ((j + i + 1) == field.length && field[i][j] == playerToCheck) {
                    countTwo++;
                }
            }
        }
        if (countOne == 3) {
            return true;
        } if (countTwo == 3) {
            return true;
        }
        return false;
    }
}
