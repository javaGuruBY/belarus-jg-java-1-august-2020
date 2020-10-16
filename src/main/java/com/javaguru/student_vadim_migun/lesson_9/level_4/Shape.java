package com.javaguru.student_vadim_migun.lesson_9.level_4;
/*
Создание иерархии класса Shape (геометрическая фигура).

Дан класс Shape:

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

}

Объявите в классе Shape абстрактный метод
для подсчёта периметра.
 */

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    protected Shape() {
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}