package com.javaguru.student_sergey_kazyanin.lesson_2.level_1;

import java.util.Scanner;

public class Task_2 {

    /*      Написать консольную программу, которая запрашивает у пользователя два вещественных числа
            (числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
            Вещественные числа можно запрашивать с консоли используя обьект Scanner
            следующим образом:

    Scanner scanner = new Scanner(System.in);
    double firstDoubleNumber = scanner.nextDouble();*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input first number - a: ");
        double a  = scan.nextDouble();

        System.out.print("Input second number - b: ");
        double b  = scan.nextDouble();

        System.out.println("1. a + b = " + (a+b) );
        System.out.println("2. a - b = " + (a-b) );
        System.out.println("3. a * b = " + (a*b) );
        System.out.println("4. a / b = " + (a/b) );

    }
}
