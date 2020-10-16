package com.javaguru.student_vadim_migun.lesson_9.level_4;
/*
Создайте наследника класс Shape - класс Circle.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Circle.

PS: подсказка - необходимые значения для
расчёта площади и периметра подавайте к
класс через конструктор.

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // implement here calculateArea()

    // implement here calculatePerimeter()

 */

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);

        //  идеа предлагает сразу решение в return писать, без создания переменной
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
