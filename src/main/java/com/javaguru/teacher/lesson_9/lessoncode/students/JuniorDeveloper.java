package com.javaguru.teacher.lesson_9.lessoncode.students;

class JuniorDeveloper extends Student {

    void debug() {
        System.out.println("...");
    }

    void askQuestion() {
        System.out.println("How it works?");
    }

    @Override
    void learn() {
        System.out.println("Study hard");
    }
}
