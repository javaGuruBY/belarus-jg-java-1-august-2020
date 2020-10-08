package com.javaguru.student_vladimir_petranovski.lesson_4.level_4.task_11;
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

public class TaskElevenCalculator {
    public int sum(int firstName, int secondName) {
        return firstName + secondName;
    }
    public int subtraction(int firstName, int secondName) {
        return firstName - secondName;
    }
    public int division(int firstName, int secondName) {
        if (secondName == 0) {
            return 0;
        }
        return firstName / secondName;
    }
    public int multiplication(int firstName, int secondName) {
        return firstName * secondName;
    }

    public static void main(String[] args) {
        TaskElevenCalculator taskElevenCalculator = new TaskElevenCalculator();
        System.out.println(taskElevenCalculator.sum(1, 2));
        System.out.println(taskElevenCalculator.subtraction(3, 1));
        System.out.println(taskElevenCalculator.division(4, 2));
        System.out.println(taskElevenCalculator.multiplication(9, 3));
    }
}
