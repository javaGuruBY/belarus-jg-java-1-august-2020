package com.javaguru.student_vadim_migun.training.lesson_10;

class Square extends Shape {

    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}
