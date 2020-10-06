package com.javaguru.student_Pavel_Buben.lesson_4.level_1.level_2;

import java.util.Scanner;

class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
