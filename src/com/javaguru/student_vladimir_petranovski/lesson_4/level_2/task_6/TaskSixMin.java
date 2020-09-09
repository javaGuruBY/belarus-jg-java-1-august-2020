package com.javaguru.student_vladimir_petranovski.lesson_4.level_2.task_6;

import java.util.Scanner;
/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наименьшее из них.
 */

public class TaskSixMin {
    public static void main(String[] args) {
        System.out.println("Please enter an integer:");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        System.out.println("Please enter an integer:");
        int secondNumber = sc.nextInt();
        if(firstNumber > secondNumber) {
            System.out.println("Min integer - second number");
        } else if(firstNumber < secondNumber) {
            System.out.println("Min integer - first number");
        } else {
            System.out.println("Min integer - first number");
        }
    }
}
