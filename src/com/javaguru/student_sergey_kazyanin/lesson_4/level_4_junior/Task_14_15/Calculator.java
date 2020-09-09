/*
Добавьте в класс Calculator метод для определения
чётное число или не чётное.

Добавьте в класс CalculatorTest тесты для этого метода.

Подсказка:

class Calculator {

    public boolean isEven(int number) {
        // реализуйте этот метод:
        // return true - если число чётное (делится на 2 без остатка)
        // иначе return false
    }

}
}
 */
package com.javaguru.student_sergey_kazyanin.lesson_4.level_4_junior.Task_14_15;


class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int minus(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if(firstNumber >= secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int temp = firstNumber;
        int max = maxOfTwoNumbers(temp, secondNumber);
        max = maxOfTwoNumbers(max, thirdNumber);
        return max;
    }

}
