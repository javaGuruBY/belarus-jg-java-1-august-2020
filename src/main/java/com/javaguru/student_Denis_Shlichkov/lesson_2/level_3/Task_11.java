package com.javaguru.student_Denis_Shlichkov.lesson_2.level_3;

import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).
 */
public class Task_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a first number: ");
        int numberFirst = in.nextInt();
        System.out.print("Input a second number: ");
        int numberSecond = in.nextInt();
        System.out.print("Input a third number: ");
        int numberThird = in.nextInt();
        System.out.println("Medium arithmetic = " + ((numberFirst + numberSecond + numberThird) / 3));
    }
}
