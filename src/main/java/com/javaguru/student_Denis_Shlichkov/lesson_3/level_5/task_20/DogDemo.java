package com.javaguru.student_Denis_Shlichkov.lesson_3.level_5.task_20;


class DogDemo {
    public static void main(String[] args) {
        Dog firstDog = new Dog("Bobby", 5);
        System.out.println("Dog was created with name " + firstDog.getDogName() +
                            " and age " + firstDog.getDogAge());
        System.out.println("Dog! Voice!");
        firstDog.voice();
        System.out.println("Dog! Happy Birthday!");
        firstDog.happyBirthday();
        firstDog.voice();
        System.out.println("Dog age " + firstDog.getDogAge());

    }
}