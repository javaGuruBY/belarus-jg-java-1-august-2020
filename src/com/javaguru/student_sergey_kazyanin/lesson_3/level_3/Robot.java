package com.javaguru.student_sergey_kazyanin.lesson_3.level_3;

class Robot {
    // в этом свойстве наш виртуальный объект робот будет
    // запоминать своё имя. Мы используем тип String потому
    // что имя это строка.
    private String name;

    // Это метод класса робот, который выводит слово "Hello!"
    public void sayHello() {
        System.out.println("Hello!");
    }

    // Это метод класса, который выводит имя робота.
    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

    // Это конструктор класса. У этого конструктора один параметр
    // с названием name и типом String. Тоесть при создании робота
    // в его конструктор будут передавать название робота.
    public Robot(String robotName) {
        this.name = robotName;

    }
}
