package com.javaguru.student_vadim_migun.training.lesson_10;

class AreaCalculator {

    double calculateTotalAreas(Shape[] shapes){
        double sum = 0;
        for (Shape shape : shapes){
            sum += shape.calculateArea();
        }
        return sum;
    }

}
