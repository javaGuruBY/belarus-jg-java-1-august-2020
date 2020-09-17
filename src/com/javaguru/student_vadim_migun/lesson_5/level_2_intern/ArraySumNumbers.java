package com.javaguru.student_vadim_migun.lesson_5.level_2_intern;
/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать сумму всех ячеек и вывести ее на консоль.

 */

import java.util.Random;

class ArraySumNumbers {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
            System.out.println("Numbers " + i + " = " + numbers[i]);
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
            System.out.println("Сумма всех ячеек массива = " + sum);

    }
}

