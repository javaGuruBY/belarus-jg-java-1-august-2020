package com.javaguru.teacher.lesson_7.lessoncode.pass;

class DogDemo {

    public static void main(String[] args) {
        Dog dog = new Dog("Vasya", "Red");
        System.out.println(dog);
        dog = foo(dog);

        System.out.println(dog);
    }

    private static Dog foo(Dog dog) {
        Dog secondDog = new Dog(dog);
        secondDog.setColor("Black");
        return secondDog;
    }
}
