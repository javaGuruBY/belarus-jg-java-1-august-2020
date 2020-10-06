/*
Создайте отдельный класс RobotDemo для демонстрации
работы с классом Robot.

Внутри класса RobotDemo создайте метод

    public static void main(String[] args) {
        // создайте экземпляр класса Robot вызвав конструктор класса
        // сохраните ссылку (указатель) на только, что созданный
        // виртуальный обьект класса Robot в переменную,
        // она нам понадобиться для дальнейшего использования.
    }
 */
package com.javaguru.student_Denis_Shlichkov.lesson_3.level_1;

public class RobotDemo {
    public static void main(String[] args) {
        Robot robotOne = new Robot();
        robotOne.sayHello();
        robotOne.sayYourName();

        Robot robotTwo = new Robot();
        robotTwo.sayHello();
        robotTwo.sayYourName();

        Robot robotThree = new Robot();
        robotThree.sayHello();
        robotThree.sayYourName();
    }
}
