package com.javaguru.student_sergey_kazyanin.lesson_3.lessoncode;

class Person {
    private String name;
    private int age;

    public Person(String name, int newAge){
        this.name = name;
        age = newAge;
    }

    public String getName(){
        return name;
    }

    public void getName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
}
