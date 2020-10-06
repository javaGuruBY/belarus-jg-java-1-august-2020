package com.javaguru.student_vladimir_petranovski.lesson_4.level_4.task_14;

import java.util.Scanner;

/*
Добавьте в класс Calculator метод для определения
максимального из двух целых чисел.
Добавьте в класс CalculatorTest тесты для этого метода.
Тесты должны покрывать следующие тестовые сценарии:
- первое число больше второго
- второе число больше первого
- оба числа равны
Создайте по одному тесту на каждый из сценариев!
Подсказка:
class Calculator {
    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        // реализуйте этот метод
    }
}
 */
public class TaskFourteenCalculatorMaxOfTwoNumbers {
    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if(firstNumber > secondNumber) {
            return firstNumber;
        } else if(firstNumber < secondNumber) {
            return secondNumber;
        } else
            return firstNumber;
    }

    public static void main(String[] args) {
        TaskFourteenCalculatorMaxOfTwoNumbers max = new TaskFourteenCalculatorMaxOfTwoNumbers();
        System.out.println("Please enter two integer");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println("Max - " + max.maxOfTwoNumbers(firstNumber, secondNumber));
    }
}
