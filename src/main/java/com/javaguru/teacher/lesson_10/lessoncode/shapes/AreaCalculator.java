package com.javaguru.teacher.lesson_10.lessoncode.shapes;

class AreaCalculator {

    double calculateTotalArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.calculateArea();
        }
        return sum;
    }
}
