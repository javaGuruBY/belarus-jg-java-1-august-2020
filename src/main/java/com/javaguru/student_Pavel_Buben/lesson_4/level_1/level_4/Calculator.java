package com.javaguru.student_Pavel_Buben.lesson_4.level_1.level_4;

class Calculator {

    int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    int min(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    int multi(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    boolean isEven(int number) {
        return number % 2 == 0;
    }

    int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber)
        {
            return 1;
        }
        else if (secondNumber > firstNumber)
        {
            return 2;
        }
        else {
            return 3;
        }

    }
}


