package com.javaguru.teacher.lesson_5.lessoncode.loops;

class ExampleWhile {

    public static void main(String[] args) {
        int counter = 1;

        while (counter <= 100) {
            System.out.println("Counter = " + counter);
            counter++;
        }

        System.out.println("Final counter = " + counter);
    }
}
