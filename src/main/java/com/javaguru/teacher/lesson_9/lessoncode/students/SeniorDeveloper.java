package com.javaguru.teacher.lesson_9.lessoncode.students;

class SeniorDeveloper extends MidDeveloper {

    void solveProblem() {
        System.out.println("No problems");
    }

    @Override
    void askQuestion() {
        System.out.println("Why?");
    }

    @Override
    void writeCode() {
        System.out.println("Super simple code with tests");
    }
}
