package com.javaguru.teacher.lesson_10.lessoncode.operations;

class SumNumberArrayOperation implements MathOperation {

    private int[] numbers;

    public SumNumberArrayOperation(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public int operate() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
