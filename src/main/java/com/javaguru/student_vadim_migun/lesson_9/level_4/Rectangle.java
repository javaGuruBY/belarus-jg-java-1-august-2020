package com.javaguru.student_vadim_migun.lesson_9.level_4;

class Rectangle extends Shape {

    private double height;
    private double width;

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return height * width;
    }

    @Override
    double calculatePerimeter() {
        return height * 2 + width * 2;
    }
}
