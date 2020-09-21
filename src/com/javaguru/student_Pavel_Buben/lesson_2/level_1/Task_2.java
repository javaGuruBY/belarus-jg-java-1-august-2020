package com.javaguru.student_Pavel_Buben.lesson_2.level_1;

import java.util.Scanner;

    class Task2 {
        public static void main(String[] args) {

            System.out.println("Введите первое дробное число:");
            Scanner scanner = new Scanner(System.in);
            double firstDoubleNumber = scanner.nextDouble();
            System.out.println("Первое число: " + firstDoubleNumber);

            System.out.println("Введите второе дробное число:");
            double secondDoubleNumber = scanner.nextDouble();
            System.out.println("Второе число: " + secondDoubleNumber);

            double Result = (firstDoubleNumber + secondDoubleNumber) - firstDoubleNumber * secondDoubleNumber / firstDoubleNumber;
            System.out.println("Результат" + Result);
        }
    }
