package com.javaguru.student_Pavel_Buben.lesson_5.level_1.level_4;

import java.util.Random;

class Task_28 {
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println();
        System.out.println("Минимальное число " + min);
    }
}
