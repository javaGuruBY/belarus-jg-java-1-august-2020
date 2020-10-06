package com.javaguru.student_Pavel_Buben.lesson_5.level_1.level_4;

import java.util.Random;
import java.util.Scanner;

class Task_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте длину массива: ");
        int number = scanner.nextInt();
        System.out.println("Длина массива " + number);
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100);
            System.out.println(array[i]);

        }
    }
}
