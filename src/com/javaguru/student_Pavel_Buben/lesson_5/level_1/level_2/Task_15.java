package com.javaguru.student_Pavel_Buben.lesson_5.level_1.level_2;

import java.util.Random;

class Task_15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.println(numbers[i]);
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            int numbers2 = numbers[i] + 2;
            System.out.println(numbers2);
        }
    }
}
