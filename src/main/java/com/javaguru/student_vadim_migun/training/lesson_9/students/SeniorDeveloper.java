package com.javaguru.student_vadim_migun.training.lesson_9.students;

class SeniorDeveloper extends MiddleDeveloper{

    void solveProblem () {
        System.out.println("No problems");
    }

    @Override
    void askQuestion() {
        System.out.println("Why?");
    }

    @Override
    void writeCode() {
        System.out.println("Super simple with code tests");
    }
}
