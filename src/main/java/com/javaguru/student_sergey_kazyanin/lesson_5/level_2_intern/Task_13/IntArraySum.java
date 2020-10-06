/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать сумму всех ячеек и вывести ее на консоль.

 */
package com.javaguru.student_sergey_kazyanin.lesson_5.level_2_intern.Task_13;

import java.util.Random;

class IntArraySum {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Numbers[" + i + "] = " + numbers[i]);
        }

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println();
        System.out.println("Сумма числе масива = " + sum);

    }
}
