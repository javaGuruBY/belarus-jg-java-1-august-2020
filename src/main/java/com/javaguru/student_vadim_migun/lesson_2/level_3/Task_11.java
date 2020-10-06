package com.javaguru.student_vadim_migun.lesson_2.level_3;

/*
Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).
 */

import java.util.Scanner;

public class Task_11 {
    public static void main (String [] args){

        System.out.println("Input first number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("First number = " + num1);

        System.out.println("Input second number: ");
        int num2 = sc.nextInt();
        System.out.println("Second number = " + num2);

        System.out.println("Input third number: ");
        int num3 = sc.nextInt();
        System.out.println("Third number = " + num3);

        double average = (double) (num1 + num2 + num3) / 3;

        System.out.println("Average = " + average);
    }

}
