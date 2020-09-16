package com.javaguru.student_vladimir_petranovski.lesson_5.level_4.task_25;

import java.util.Scanner;

/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
 */
class ArrayUserOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length array: ");
        double[] arr = new double[sc.nextInt()];
        System.out.println("Enter numbers double: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        for (double i : arr) {
            System.out.println(i);
        }

    }
}
