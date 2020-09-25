package com.javaguru.student_Pavel_Buben.lesson_5.level_1.level_2;

import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {
        int[] number = new int[3];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < number.length; i++){
            System.out.println("Введите число " + (i + 1) + " : ");
            number[i] = scanner.nextInt();
        }
        System.out.println();

        for(int i = 0; i < number.length; i++){
            System.out.println("number: " + i + " = " + number[i]);
        }
    }
}
