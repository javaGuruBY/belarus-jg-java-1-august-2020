package com.javaguru.student_vladimir_petranovski.lesson_9.level_5;


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
