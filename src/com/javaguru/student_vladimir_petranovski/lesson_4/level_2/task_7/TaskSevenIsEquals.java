package com.javaguru.student_vladimir_petranovski.lesson_4.level_2.task_7;

import java.util.Scanner;
/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль:
- "Numbers are equals"  - если числа равны
- "Numbers are different" - если числа не равны
 */

public class TaskSevenIsEquals {
    public static void main(String[] args) {
        System.out.println("Please enter an integer:");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        System.out.println("Please enter an integer:");
        int secondNumber = sc.nextInt();
        if(firstNumber == secondNumber) {
            System.out.println("Numbers are equals");
        } else
            System.out.println("Numbers are different");
    }
}
