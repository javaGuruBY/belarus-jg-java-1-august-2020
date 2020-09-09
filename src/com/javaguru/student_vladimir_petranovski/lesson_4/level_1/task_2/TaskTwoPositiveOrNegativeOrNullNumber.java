package com.javaguru.student_vladimir_petranovski.lesson_4.level_1.task_2;

import java.util.Scanner;

public class TaskTwoPositiveOrNegativeOrNullNumber {
    public static void main(String[] args) {
        System.out.println("Please enter an integer:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number > 0) {
            System.out.println("Answer -- positive!");
        } else if(number < 0) {
            System.out.println("Answer -- negative!");
        } else {
            System.out.println("Answer -- 0");
        }
    }
}
