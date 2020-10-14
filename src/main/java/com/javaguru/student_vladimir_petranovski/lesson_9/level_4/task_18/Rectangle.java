package com.javaguru.student_vladimir_petranovski.lesson_9.level_4.task_18;
/*
Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Rectangle.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Rectangle.
 */

class Rectangle extends Shape {
    private double length;
    private double height;

    public Rectangle(String title, double length, double height) {
        super(title);
        this.length = length;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return length * height;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length  + height);
    }
}
