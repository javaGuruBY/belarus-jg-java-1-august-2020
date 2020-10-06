package com.javaguru.student_vladimir_petranovski.lesson_5.level_4.task_26;
import java.util.Random;
import java.util.Scanner;
/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.
 */
class ArrayUserTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length array: ");
        double[] arr = new double[sc.nextInt()];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextDouble();
        }
        for (double v : arr) {
            System.out.println(v);
        }

    }
}
