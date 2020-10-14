package com.javaguru.student_vladimir_petranovski.lesson_9.level_4.task_19;
/*
Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Triangle.
Этот класс должен представлять равносторонний треугоник.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Triangle.
 */

class Triangle extends Shape {
    private double length;

    public Triangle(String title, double length) {
        super(title);
        this.length = length;
    }

    @Override
    double calculateArea() {
        return Math.pow(length, 2) * Math.sqrt(3) / 4;
    }

    @Override
    double calculatePerimeter() {
        return 3 * length;
    }
}
