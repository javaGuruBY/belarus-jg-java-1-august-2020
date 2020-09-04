package com.javaguru.student_vladimir_petranovski.lesson_3.level_3.task_12.bean;
/*
Дайте роботу имя! Продолжение.
Тема: объявление конструктора класса.
Добавьте в класс Robot конструктор с параметром String name:
    class Robot {
        // в этом свойстве наш виртуальный обьект робот будет
        // запоминать своё имя. Мы используем тип String потому
        // что имя это строка.
        private String name;
        // Это конструктор класса. У этого конструктора один параметр
        // с названием name и типом String. Тоесть при создании робота
        // в его конструктор будут передавать название робота.
        public Robot(String robotName) {
            this.name = robotName; // а тут робот запоминает в своем свойстве this.name как его зовут
        }
    }
В классе RobotDemo передайте в конструктор каждого робота его название:
Robot robot1 = new Robot("Rider"); // пусть этого робота зовут "Rider"
robot1.sayHello();
robot1.sayYourName();
Robot robot2 = new Robot("John"); // а этого робота зовут "John"
robot2.sayHello();
robot2.sayYourName();
 */

public class RobotNameContinue {
    private String name;
    public RobotNameContinue(String robotName) {
        this.name = robotName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
