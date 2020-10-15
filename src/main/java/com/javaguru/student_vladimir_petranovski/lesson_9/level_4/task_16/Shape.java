package com.javaguru.student_vladimir_petranovski.lesson_9.level_4.task_16;

abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}