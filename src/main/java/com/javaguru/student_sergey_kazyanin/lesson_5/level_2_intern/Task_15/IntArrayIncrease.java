/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль,
 - увеличить значение каждой ячейки на 2,
 - вывести значение каждой ячейки на консоль.

 */
package com.javaguru.student_sergey_kazyanin.lesson_5.level_2_intern.Task_15;

import java.util.Random;

class IntArrayIncrease {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Numbers[" + i + "] = " + numbers[i]);
        }

        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 2;
        }
        System.out.println();

        System.out.println("Значения массива увеличенные на 2:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Numbers[" + i + "] = " + numbers[i]);
        }

    }

}
