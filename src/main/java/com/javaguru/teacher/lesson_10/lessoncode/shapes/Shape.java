package com.javaguru.teacher.lesson_10.lessoncode.shapes;

public abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract double calculateArea();

    public String getColor() {
        return color;
    }
}
