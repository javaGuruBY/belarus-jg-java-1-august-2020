package com.javaguru.student_Denis_Shlichkov.lesson_3.level_5.task_20;

class Dog {
    private String dogName;
    private int dogAge;

    Dog(String name, int age) {
        dogName = name;
        dogAge = age;
    }

    public String getDogName() {
        return dogName;
    }

    public int getDogAge() {
        return dogAge;
    }

    void voice(){
        System.out.println("Woof-woof");
    }
    public void happyBirthday() {
        dogAge++;
    }
}
