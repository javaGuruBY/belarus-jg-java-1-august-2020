package com.javaguru.student_vladimir_petranovski.lesson_9.level_5;

class Rectangle extends Shape {
    private double length;
    private double height;

    public Rectangle(String title, double length, double height) {
        super(title);
        this.length = length;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return length * height;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length  + height);
    }
}
