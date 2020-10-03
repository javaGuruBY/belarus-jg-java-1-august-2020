package com.javaguru.student_Pavel_Buben.lesson_2.level_1.level_3;

import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Первое целое число:");
            int firstNumber = scan.nextInt();
            System.out.println("Второе целое число:");
            int secondNumber = scan.nextInt();
            System.out.println("Третье целое число:");
            int thirdNumber = scan.nextInt();

        System.out.println("Результат:");
        System.out.println((firstNumber + secondNumber + thirdNumber)/3);
    }
}
