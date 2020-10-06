package com.javaguru.student_Pavel_Buben.lesson_3.level_1.level_3;

class Robot {
    private String name;

    public void sayHello() {
        System.out.println("Hello");
    }
    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }
    public Robot(String robotName) {
        this.name = robotName;

    }
}

