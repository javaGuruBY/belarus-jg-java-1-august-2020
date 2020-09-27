package com.javaguru.student_vladimir_petranovski.lesson_6.level_6.task_27;
/*
В классе TicTacToe реализуйте метод:

public void play() {
    int[][] field = createField();
    while(true) {
        printFieldToConsole(field);
        Move move0 = getNextMove();
        field[move0.getX()][move0.getY()] = 0;
        printFieldToConsole(field);
        if (isWin(field, 0)) {
            System.out.println("Player 0 WIN!");
            break;
        }
        if (isDraw(field)) {
            System.out.println("DRAW!");
            break;
        }

        printFieldToConsole(field);
        Move move1 = getNextMove();
        field[move1.getX()][move1.getY()] = 1;
        printFieldToConsole(field);
        if (isWin(field, 1)) {
            System.out.println("Player 1 WIN!");
            break;
        }
        if (isDraw(field)) {
            System.out.println("DRAW!");
            break;
        }
    }
}

Создайте main метод и запустите игру крестики нолики:

public static void main(String[] args) {
    TicTacToe game = new TicTacToe();
    game.play();
}

Сыграйте в игру крестики нолики!
 */

import java.util.Arrays;
import java.util.Scanner;

class TicTacToe {

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field[0].length; i++) {
            int count = 0;
            for (int[] twoArray : field) {
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
        int countOne = 0, countTwo = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (i == j && field[i][j] == playerToCheck) {
                    countOne++;
                }
                if ((j + i + 1) == field.length && field[i][j] == playerToCheck) {
                    countTwo++;
                }
            }
        }
        if (countOne == 3) {
            return true;
        }
        if (countTwo == 3) {
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

    public boolean isDrawPosition(int[][] field) {
        boolean draw = true;
        if (!isWinPosition(field, 0) && !isWinPosition(field, 1)) {
            for (int[] ints : field) {
                for (int i : ints) {
                    if (i == -1) {
                        draw = false;
                        break;
                    } else {
                        draw = true;
                    }
                }
            }
        }
        return draw;
    }

    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinate X:");
        int x = scanner.nextInt();
        System.out.println("Enter coordinate Y:");
        int y = scanner.nextInt();
        Move move = new Move(x, y);
        return move;
    }

    public void printFieldToConsole(int[][] field) {
        for (int[] ints : field) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public void play() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}
