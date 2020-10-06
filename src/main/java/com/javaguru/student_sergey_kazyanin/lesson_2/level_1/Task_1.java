package com.javaguru.student_sergey_kazyanin.lesson_2.level_1;

import java.util.Scanner;

public class Task_1 {
    //Написать консольную программу, которая запрашивает у пользователя два целых числа и
    //выводит на консоль результаты: сложения, вычитания, умножения и деления.

    public static void  main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Input first number - a: ");
        int a  = scan.nextInt();

        System.out.print("Input second number - b: ");
        int b  = scan.nextInt();

        System.out.println("1. a + b = " + (a+b) );
        System.out.println("2. a - b = " + (a-b) );
        System.out.println("3. a * b = " + (a*b) );
        System.out.println("4. a / b = " + (a/b) );



    }
}
