package com.javaguru.teacher.lesson_5.lessoncode.loops;

class ExampleWhileV2 {

    public static void main(String[] args) {
        int counter = 0;
        while (true) {
            System.out.println(counter);
            if (counter >= 100) {
                break;
            }
            counter++;
        }

    }
}
