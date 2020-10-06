package com.javaguru.student_vadim_migun.lesson_3.level_6.Task_25;

/*
Разработать класс - круг, у которого должны быть следующие характеристики:
Свойства: радиус (double radius),
Методы: расчет площади (double calculateArea()).

Класс с объявлением фигуры круг должен называться "Circle".
Класс с демонстрацией работы должен называться "CircleDemo".
 */

class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius;

    }
    public void calculateArea() {
        double circleArea = Math.PI * radius * radius;
        System.out.println("Площадь круга = " + circleArea);
    }
}



class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(7.5);
        circle.calculateArea();

    }
}
