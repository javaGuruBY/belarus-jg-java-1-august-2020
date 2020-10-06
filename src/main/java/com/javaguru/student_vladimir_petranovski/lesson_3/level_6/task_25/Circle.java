package com.javaguru.student_vladimir_petranovski.lesson_3.level_6.task_25;

import static java.lang.Math.*;

/*
Разработать класс - круг, у которого должны быть следующие характеристики:
Свойства: радиус (double radius),
Методы: расчет площади (double calculateArea()).

Класс с объявлением фигуры круг должен называться "Circle".
Класс с демонстрацией работы должен называться "CircleDemo"
 */
public class Circle {
    public double radius;
    public double calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
