package com.javaguru.student_vladimir_petranovski.lesson_3.level_1;
/*
Создайте класс робот (Robot).

Научите вашего робота "говорить" привет.

Создайте в классе Robot метод со следующей сигнатурой:

    public void sayHello() {
        // тут напишите команду распечатки на консоли строки "Hello!"
    }

 */

public class Robot {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.sayHello();
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
}
