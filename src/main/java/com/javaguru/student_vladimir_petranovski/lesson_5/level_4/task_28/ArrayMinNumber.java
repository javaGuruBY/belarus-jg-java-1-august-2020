package com.javaguru.student_vladimir_petranovski.lesson_5.level_4.task_28;

import java.util.Random;

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.
 */
class ArrayMinNumber {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        for (int i : arr) {
            System.out.println(i);
        }
        int min = 0;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }
}
