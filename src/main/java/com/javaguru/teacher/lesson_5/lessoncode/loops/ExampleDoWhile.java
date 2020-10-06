package com.javaguru.teacher.lesson_5.lessoncode.loops;

class ExampleDoWhile {

    public static void main(String[] args) {
        int counter = 100_000_001;

        do {
            System.out.println("Counter = " + counter);
            counter++;
        } while (counter < 101);

        System.out.println("Final counter = " + counter);
    }
}
