/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива числом, запрошенным у пользователя,
 - вывести значение каждой ячейки на консоль.

 */
package com.javaguru.student_sergey_kazyanin.lesson_5.level_2_intern.Task_11;

import java.util.Scanner;

class IntArrayUserInput {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Введите число " + (i + 1) + " - ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Numbers[" + i + "] = " + numbers[i]);
        }
    }
}
