package com.javaguru.teacher.lesson_10.lessoncode.operations;

class MathOperationCalculator {

    int calculateTotal(MathOperation[] operations) {
        int sum = 0;
        for (MathOperation operation : operations) {
            sum += operation.operate();
        }
        return sum;
    }
}
