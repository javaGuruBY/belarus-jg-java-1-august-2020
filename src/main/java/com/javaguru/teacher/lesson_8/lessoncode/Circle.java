package com.javaguru.teacher.lesson_8.lessoncode;

class Circle {

    private double radius;

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
