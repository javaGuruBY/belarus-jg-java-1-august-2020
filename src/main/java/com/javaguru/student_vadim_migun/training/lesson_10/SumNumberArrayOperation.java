package com.javaguru.student_vadim_migun.training.lesson_10;

class SumNumberArrayOperation implements MathOperation {

    private int[] numbers;

    public SumNumberArrayOperation(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public int execute() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
