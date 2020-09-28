package com.javaguru.student_vladimir_petranovski.lesson_6.level_5.task_22;
/*
В классе TicTacToe реализуйте
метод для определения является ли данная позиция
победной для указанного игрока.

Подсказка: победной позиция является тогда, когда
позиция победна по горизонталям ИЛИ вертикалям ИЛИ диагоналям.

Метод должен иметь следующую сигнатуру:
public boolean isWinPosition(int[][] field, int playerToCheck).

Поле передаётся в этот метод как первый параметр int[][] field.
Знак игрока (0 или 1) передаётся вторым параметром: int playerToCheck.

Метод должет вернуть:
 - true если позиция победна для указанного игрока (int playerToCheck),
 - false иначе.

В классе TicTacToeTest написать тесты для разработанного метода.
 */

class TicTacToe {
    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field[0].length; i++) {
            int count = 0;
            for (int[] twoArray: field) {
                if (twoArray[i] == playerToCheck) {
                    count++;
                }
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            int count = 0;
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j] == playerToCheck) {
                    count++;
                }
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

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

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForVerticals(field, playerToCheck) || isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck)) {
            return true;
        }
        return false;
    }
}
