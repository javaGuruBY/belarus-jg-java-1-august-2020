package com.javaguru.student_vladimir_petranovski.level_2.level_3;

import java.util.Scanner;

public class Task_11_Average {
    public static void main(String[] args) {
        System.out.println("Введите три целых числа:");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();
        System.out.println("Среднее арифметическое = " + ((firstNumber + secondNumber + thirdNumber) / 3));
    }
}
