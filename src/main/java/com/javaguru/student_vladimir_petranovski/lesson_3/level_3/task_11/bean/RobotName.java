package com.javaguru.student_vladimir_petranovski.lesson_3.level_3.task_11.bean;
/*
Дайте роботу имя!
Тема: объявление свойства класса.
Мы можем создать сколько угодно виртуальных обьектов робот.
Но все они при вызове метода sayYourName() печатают на
консоль одно и то же: "My name is ROBO". Давайте это исправим!
Давайте научим наших роботов запоминать своё уникальное имя
при создании и потом использовать его при вызове команды
sayYourName().
Добавьте в класс Robot свойство name:
    class Robot {
        // в этом свойстве наш виртуальный обьект робот будет
        // запоминать своё имя. Мы используем тип String потому
        // что имя это строка.
        private String name;
        ....
    }
 */
public class RobotName {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
