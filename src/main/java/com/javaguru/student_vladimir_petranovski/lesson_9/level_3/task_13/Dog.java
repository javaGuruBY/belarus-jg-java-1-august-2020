package com.javaguru.student_vladimir_petranovski.lesson_9.level_3.task_13;

class Dog extends Pet{
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void voice() {
        System.out.println("Gav-gav");
    }
}
