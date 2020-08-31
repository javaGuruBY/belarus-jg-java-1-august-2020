package com.javaguru.teacher.lesson_3.lessoncode;

class Person {

    private String name;
    private int age;

    public Person(String name, int newAge) {
        this.name = name;
        age = newAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
