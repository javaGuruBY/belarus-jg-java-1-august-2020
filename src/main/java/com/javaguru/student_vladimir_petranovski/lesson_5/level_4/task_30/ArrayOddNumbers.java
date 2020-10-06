package com.javaguru.student_vladimir_petranovski.lesson_5.level_4.task_30;

import java.util.Random;

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведети их на консоль.
 */
class ArrayOddNumbers {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();
        for (int i : arr) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}
