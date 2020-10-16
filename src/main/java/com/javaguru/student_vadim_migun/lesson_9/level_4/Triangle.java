package com.javaguru.student_vadim_migun.lesson_9.level_4;

class Triangle extends Shape {

    private double height;
    private double width;

    Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return 0.5 * height * width;
    }

    @Override
    double calculatePerimeter() {
        return width * 3;
    }
}
