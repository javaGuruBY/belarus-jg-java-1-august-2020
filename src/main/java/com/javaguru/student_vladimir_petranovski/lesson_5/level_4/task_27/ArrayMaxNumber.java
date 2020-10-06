package com.javaguru.student_vladimir_petranovski.lesson_5.level_4.task_27;

import java.util.Random;

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.
 */
class ArrayMaxNumber {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        for (int i : arr) {
            System.out.println(i);
        }
        int max = 0;
        /*for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }*/
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
