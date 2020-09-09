package com.javaguru.student_vladimir_petranovski.lesson_4.level_2.task_5;

import java.util.Scanner;

public class TaskFiveMax {
    public static void main(String[] args) {
        System.out.println("Please enter an integer:");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        System.out.println("Please enter an integer:");
        int secondNumber = sc.nextInt();
        if(firstNumber > secondNumber) {
            System.out.println("Max integer - first number");
        } else if(firstNumber < secondNumber) {
            System.out.println("Max integer - second number");
        } else {
            System.out.println("Max integer - first number");
        }
    }
}
