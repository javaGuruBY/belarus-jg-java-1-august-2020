package com.javaguru.student_Pavel_Buben.lesson_5.level_1.level_4;

import java.util.Scanner;

class Task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте длину массива: ");
        int number = scanner.nextInt();
        System.out.println("Длина массива " + number);
        System.out.println("Заполните массив цифрами: ");
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            System.out.println(array[i]);
            System.out.println("array[" + i + "] =" + array[i]);
        }

    }
}
