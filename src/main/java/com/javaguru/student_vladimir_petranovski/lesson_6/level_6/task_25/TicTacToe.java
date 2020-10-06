package com.javaguru.student_vladimir_petranovski.lesson_6.level_6.task_25;

import java.util.Scanner;

class TicTacToe {
    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Move move = new Move(x, y);
        return move;
    }
}
