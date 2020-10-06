package com.javaguru.student_Denis_Shlichkov.lesson_3.level_5.task_22;

public class DogDemo {
    public static void main(String[] args) {
        Dog firstDog = new Dog("Bobby", "grey", 5);
        firstDog.voice();
        firstDog.changeColor("white");
        firstDog.voice();
    }
}
