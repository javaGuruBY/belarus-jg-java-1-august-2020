package com.javaguru.student_Pavel_Buben.lesson_5.level_1.level_4;

import java.util.Random;

class Task_29 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }
        System.out.println();
        System.out.println("Четные числа :");
        for (int number : array)
            if (number % 2 == 0)
                System.out.println(number);
    }
}



