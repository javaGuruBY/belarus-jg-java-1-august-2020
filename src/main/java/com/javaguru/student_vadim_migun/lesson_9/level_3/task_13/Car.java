package com.javaguru.student_vadim_migun.lesson_9.level_3.task_13;
/*
Придумайте и создайте абстрактный класс и его потомков.
 */

abstract class Car {

    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void gas() {
        System.out.println("Accelerate!");
    }
    public void brake() {
        System.out.println("Brake!");
    }

    @Override
    public String toString() {
        return model +", " + color;
    }
}


