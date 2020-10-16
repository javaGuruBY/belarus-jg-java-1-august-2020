package com.javaguru.student_vadim_migun.lesson_9.level_2.task_7;
/*
Как вызвать конструктор родительского класса?
Когда это нужно делать?
Приведите пример кода.
 */

class Human {

    private String name;


    public Human(String name) {
        this.name = name;
    }

}

class Man extends Human {

    public Man(String name) {
        super(name);
    }
}

class Woman extends Human {

    public Woman(String name) {
        super(name);
    }
}