package com.javaguru.student_vladimir_petranovski.lesson_5.level_2.task_15;

import java.util.Random;

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль,
 - увеличить значение каждой ячейки на 2,
 - вывести значение каждой ячейки на консоль.
 */
class CreateArraySix {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        for (int i : arr) {
            System.out.println(i);
        }
        for (int i : arr) {
            i *= 2;
            System.out.println(i);
        }


    }
}
