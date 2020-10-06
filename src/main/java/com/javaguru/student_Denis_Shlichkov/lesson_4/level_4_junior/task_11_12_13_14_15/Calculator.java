package com.javaguru.student_Denis_Shlichkov.lesson_4.level_4_junior.task_11_12_13_14_15;

public class Calculator {
    int summation(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    int multiplication(int firstNumber, int secondNumber) {
        return  firstNumber * secondNumber;
    }

    boolean isEven(int number) {
        return number % 2 == 0;
    }

    int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if(firstNumber > secondNumber) {
            return 1;
        }
        else if (secondNumber > firstNumber) {
            return 2;
        }
        else {
            return 3;
        }
    }
        
    /*
    2 1 1 : 1
    1 2 1 : 2
    1 1 2 : 3
    2 2 1 : 4
    2 1 2 : 5
    1 2 2 : 6
    3 2 1 : 7
    2 3 1 : 8
    2 1 3 : 9
    3 3 3 : 10
    10 вариантов
     */
    int maxOfThreeNumbers(int firstNumber, int secondNumber, int threeNumber) {
        if (secondNumber == threeNumber && firstNumber > threeNumber) return 1;
        else if (firstNumber == threeNumber && secondNumber > threeNumber) return 2;
        else if (firstNumber == secondNumber && threeNumber > secondNumber) return 3;
        else if (firstNumber == secondNumber && firstNumber > threeNumber) return 4;
        else if (firstNumber == threeNumber && firstNumber > secondNumber) return 5;
        else if (secondNumber == threeNumber && secondNumber > firstNumber) return 6;
        else if (firstNumber > secondNumber && firstNumber > threeNumber) return 7;
        else if (secondNumber > firstNumber && secondNumber > threeNumber) return 8;
        else if (threeNumber > firstNumber && threeNumber > secondNumber) return 9;
        else return 10;
    }
}
