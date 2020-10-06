package com.javaguru.student_vladimir_petranovski.lesson_4.level_1.task_1;

import java.util.Scanner;

class TaskOnePositiveOrNegativeNumber {
    public static void main(String[] args) {
        System.out.println("Please enter an integer:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number > 0) {
            System.out.println("Answer -- positive!");
        } else {
            System.out.println("Answer -- negative!");
        }
    }
}
