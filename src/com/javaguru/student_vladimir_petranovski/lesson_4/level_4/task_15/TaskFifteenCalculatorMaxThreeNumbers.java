package com.javaguru.student_vladimir_petranovski.lesson_4.level_4.task_15;
/*
Добавьте в класс Calculator метод для определения
максимального из трёх целых чисел.

Добавьте в класс CalculatorTest тесты для этого метода.
Тесты должны покрывать следующие тестовые сценарии:
- первое число больше второго и третьего
- второе число больше первого и третьего
- третье число больше первого и второго
- первые два равны и больше третьего
- ...
- три числа равны
По одному тесту на каждый из сценариев!
 */

import java.util.Scanner;

public class TaskFifteenCalculatorMaxThreeNumbers {
    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if(firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        } else if(secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter three an integer");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();
        TaskFifteenCalculatorMaxThreeNumbers max = new TaskFifteenCalculatorMaxThreeNumbers();
        System.out.println("Max of three number = " + max.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber));
    }
}
