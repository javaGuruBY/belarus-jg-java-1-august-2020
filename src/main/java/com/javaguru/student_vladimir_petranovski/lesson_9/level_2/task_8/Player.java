package com.javaguru.student_vladimir_petranovski.lesson_9.level_2.task_8;
/*
Исправьте код программы так, что бы он компилировался.
Изменения можно вносить только в класс HumanPlayer.

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class HumanPlayer extends Player {

    HumanPlayer(String name) {

    }

}
 */

class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }

}

class HumanPlayer extends Player {

    HumanPlayer(String name) {
        super(name);
    }
}
