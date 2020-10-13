package com.javaguru.student_vladimir_petranovski.lesson_9.level_3.task_13;
/*
Придумайте и создайте абстрактный класс и его потомков.
 */
abstract  class Pet {
    private String name;
    private int age;
    private String color;

    public Pet(String  name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public abstract void voice();

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
