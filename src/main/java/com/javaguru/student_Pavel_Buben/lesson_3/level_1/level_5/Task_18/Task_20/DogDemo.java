package com.javaguru.student_Pavel_Buben.lesson_3.level_1.level_5.Task_18.Task_20;



class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Bobik", 3);
        System.out.println("Dog name: " + myDog.getName());
        System.out.println("Dog age: " + myDog.getAge());
        System.out.println("Dog! Voice!");
        myDog.voice();
        System.out.println("Dog! Happy Birthday!");
        myDog.happyBirthday();
        myDog.voice();
        System.out.println("Dog age " + myDog.getAge());

    }
}