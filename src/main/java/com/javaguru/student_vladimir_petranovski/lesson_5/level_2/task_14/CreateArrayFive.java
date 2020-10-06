package com.javaguru.student_vladimir_petranovski.lesson_5.level_2.task_14;

import java.util.Random;

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать среднее значение и вывести его на консоль.
 */
class CreateArrayFive {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum / 3);


    }
}
