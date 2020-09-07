package com.javaguru.student_sergey_kazyanin.lesson_3.level_6.Task25;

class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(7.2);
        double area = circle.calculateArea();
        double rad = circle.getRadius();
        System.out.println("Площать круга с радиусом " + rad + " равна - " + area);
    }
}
