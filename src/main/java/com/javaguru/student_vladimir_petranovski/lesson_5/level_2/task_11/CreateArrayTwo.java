package com.javaguru.student_vladimir_petranovski.lesson_5.level_2.task_11;

import java.util.Scanner;

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива числом, запрошенным у пользователя,
 - вывести значение каждой ячейки на консоль.
 */
class CreateArrayTwo {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
