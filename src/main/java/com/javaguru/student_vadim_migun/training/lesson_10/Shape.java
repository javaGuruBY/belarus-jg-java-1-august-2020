package com.javaguru.student_vadim_migun.training.lesson_10;

abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract double calculateArea();

}
