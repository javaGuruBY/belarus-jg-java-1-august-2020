package com.javaguru.student_vladimir_petranovski.lesson_9.level_5;

class Square extends Shape {
    private double length;

    public Square(String title, double length) {
        super(title);
        this.length = length;
    }

    @Override
    double calculateArea() {
        return Math.pow(length, 2);
    }

    @Override
    double calculatePerimeter() {
        return 4 * length;
    }
}
