package com.javaguru.student_vadim_migun.lesson_4.level_4_junior;
/*
Создайте класс Calculator. В этом классе создайте методы
для сложения, вычитания, деления и умножения двух целых чисел.

Подсказка:

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    // реализуйте по аналогии оставшиеся методы

}
 */
class Calculator {


    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int subtraction (int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int multiplication (int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public int division ( int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    /*Добавьте в класс Calculator метод для определения
чётное число или не чётное.
Добавьте в класс CalculatorTest тесты для этого метода.
     */

     public boolean isEven(int number) {
        if (number % 2 == 0 ){
            return true;
        } else return false;
    }
    /*Добавьте в класс Calculator метод для определения
    максимального из двух целых чисел. */

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber>secondNumber){
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    /* Добавьте в класс Calculator метод для определения
    максимального из трёх целых чисел.*/

    public  int maxOfThreeNumber(int firstNumber, int secondNumber, int thirdNumber){
        if (firstNumber>=secondNumber && firstNumber>=thirdNumber) {
            return firstNumber;
        } else if (secondNumber>=firstNumber && secondNumber>=thirdNumber){
            return (secondNumber);
        } else {
            return (thirdNumber);
        }

    }


}

