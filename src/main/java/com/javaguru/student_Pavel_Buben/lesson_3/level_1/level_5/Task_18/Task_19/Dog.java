package com.javaguru.student_Pavel_Buben.lesson_3.level_1.level_5.Task_18.Task_19;

class Dog {

    private String name;
    private int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() { return age; }

    public void voice() {
        System.out.println(name);

    }



}