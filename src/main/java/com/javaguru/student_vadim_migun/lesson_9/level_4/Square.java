package com.javaguru.student_vadim_migun.lesson_9.level_4;
/*
Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Square.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Square.

 */

class Square extends Shape {

    private double height;
    private double width;

    Square(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return height * width;
    }

    @Override
    double calculatePerimeter() {
        return height * 2 + width * 2;
    }
}
