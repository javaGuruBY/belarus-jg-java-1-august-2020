package com.javaguru.student_vadim_migun.training.lesson_10;

class SumTwoNumberOperation implements MathOperation {

    private int firstNumber;
    private int secondNumber;

    public SumTwoNumberOperation(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public int execute() {
        return firstNumber + secondNumber;
    }
}
