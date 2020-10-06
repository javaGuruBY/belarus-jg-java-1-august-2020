package com.javaguru.student_Denis_Shlichkov.lesson_3.level_5.task_18;

public class DogDemo {
    public static void main(String[] args) {
        Dog firstDog = new Dog("Happy");
        System.out.println("First dog name is " + firstDog.getDogName());
        System.out.println("Demonstrate command Voice");
        firstDog.voice();
    }
}
