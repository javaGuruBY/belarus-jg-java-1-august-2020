/*
Разработать класс - круг, у которого должны быть следующие характеристики:
Свойства: радиус (double radius),
Методы: расчет площади (double calculateArea()).

Класс с объявлением фигуры круг должен называться "Circle".
Класс с демонстрацией работы должен называться "CircleDemo".
 */
package com.javaguru.student_sergey_kazyanin.lesson_3.level_6.Task25;


class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 2 * java.lang.Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}
