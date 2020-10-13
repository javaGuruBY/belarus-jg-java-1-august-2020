package com.javaguru.student_vladimir_petranovski.lesson_9.level_2.task_9;
/*
Внесите изменения в код программы так,
чтобы можно было создать экземпляр класса
ComputerPlayer. Класс ComputerPlayer должен
наследоваться от класса Player. Изменения
в код можно вносить только в класс ComputerPlayer.

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class ComputerPlayer {

}
 */

class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }

}

class ComputerPlayer extends Player {
    public ComputerPlayer(String name) {
        super(name);
    }
}
