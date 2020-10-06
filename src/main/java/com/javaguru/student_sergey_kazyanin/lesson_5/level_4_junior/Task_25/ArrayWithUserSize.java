/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
 */
package com.javaguru.student_sergey_kazyanin.lesson_5.level_4_junior.Task_25;

import java.util.Scanner;

class ArrayWithUserSize {
    public static void main(String[] args) {
        System.out.print("Введите размер целочисленного массива: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        System.out.println("Задайте числовое значение для элементов массива:");
        int[] numbers = new int[arraySize];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Введите значение numbers[" + i + "] - ");
            numbers[i] += scanner.nextInt();
        }
        System.out.println();
        System.out.println("Вывод массива:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] - " + numbers[i]);
        }
    }
}
