package com.javaguru.student_Pavel_Buben.lesson_2.level_1.level_3;

import java.util.Scanner;

 class Task_9 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number*i));
        }



    }
}
