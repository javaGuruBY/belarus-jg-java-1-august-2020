package com.javaguru.teacher.lesson_9.lessoncode.students;

class MidDeveloper extends JuniorDeveloper {

    void writeCode() {
        System.out.println("Writing code with tests");
    }

    @Override
    void askQuestion() {
        System.out.println("Asking right questions");
    }

    @Override
    void learn() {
        System.out.println("Fast learning");
    }

    @Override
    void debug() {
        System.out.println("???");
    }
}
