package com.javaguru.student_Denis_Shlichkov.lesson_3.level_5.task_19;

public class DogDemo {
    public static void main(String[] args) {
        Dog firstDog = new Dog("Happy", 5);
        System.out.println("Dog name is " + firstDog.getDogName());
        System.out.println("Dog age: " + firstDog.getDogAge());
        System.out.println("Demonstrate command Voice");
        firstDog.voice();
    }
}
