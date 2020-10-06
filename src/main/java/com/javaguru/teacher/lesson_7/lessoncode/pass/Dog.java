package com.javaguru.teacher.lesson_7.lessoncode.pass;

class Dog {

    private String name;
    private String color;

    public Dog(Dog dog) {
        this.name = dog.name;
        this.color = dog.color;
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
