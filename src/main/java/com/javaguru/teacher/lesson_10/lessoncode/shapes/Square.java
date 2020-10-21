package com.javaguru.teacher.lesson_10.lessoncode.shapes;

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
