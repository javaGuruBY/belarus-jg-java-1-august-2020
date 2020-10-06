package com.javaguru.student_Pavel_Buben.lesson_3.level_1.level_5.Task_18.Task_22;

class Dog {

    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void voice() {
        System.out.println("Гав гав");
        System.out.println("Dog color " + color);
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }
}
