package com.javaguru.student_vladimir_petranovski.lesson_4.level_1.task_4;

import java.util.Scanner;

public class TaskFourEvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Please enter an integer:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number % 2 == 0) {
            System.out.println("Answer -- number even!");
        } else {
            System.out.println("Answer -- number odd!");
        }
    }
}
