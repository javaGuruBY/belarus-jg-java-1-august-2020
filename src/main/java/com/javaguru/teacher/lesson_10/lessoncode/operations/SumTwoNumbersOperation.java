package com.javaguru.teacher.lesson_10.lessoncode.operations;

class SumTwoNumbersOperation implements MathOperation {

    private int firstNumber;
    private int secondNumber;

    public SumTwoNumbersOperation(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public int operate() {
        return firstNumber + secondNumber;
    }
}
