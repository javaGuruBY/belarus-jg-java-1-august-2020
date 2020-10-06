package com.javaguru.student_Pavel_Buben.lesson_3.level_1.level_5.Task_18.Task_21;

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
        System.out.println("Dog name: " + name);
        System.out.println("Dog age: " + age);
        System.out.println("Dog color " + color);

            }
}
