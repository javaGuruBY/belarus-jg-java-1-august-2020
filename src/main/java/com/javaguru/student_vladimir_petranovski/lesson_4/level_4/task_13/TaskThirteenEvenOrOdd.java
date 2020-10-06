package com.javaguru.student_vladimir_petranovski.lesson_4.level_4.task_13;
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
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TaskThirteenEvenOrOdd {

    public boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        TaskThirteenEvenOrOdd even = new TaskThirteenEvenOrOdd();
        System.out.println("Is that number even? --- " + even.isEven(number));
    }

}
