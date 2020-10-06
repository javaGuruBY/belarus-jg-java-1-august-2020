package com.javaguru.student_vladimir_petranovski.lesson_6.level_5.task_20;
/*
В классе TicTacToe реализуйте
метод для определения является ли данная позиция
победной по вертикалям для указанного игрока.

Метод должен иметь следующую сигнатуру:
public boolean isWinPositionForVerticals(int[][] field, int playerToCheck).

Поле передаётся в этот метод как первый параметр int[][] field.
Знак игрока (0 или 1) передаётся вторым параметром: int playerToCheck.

Метод должет вернуть:
 - true если в одной из вертикалей есть три подряд клетки
   занятые знаком указанного игрока (int playerToCheck),
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
}
