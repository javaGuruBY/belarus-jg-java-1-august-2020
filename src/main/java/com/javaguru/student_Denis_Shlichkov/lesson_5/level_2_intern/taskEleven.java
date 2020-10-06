/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива числом, запрошенным у пользователя,
 - вывести значение каждой ячейки на консоль.

 */
package com.javaguru.student_Denis_Shlichkov.lesson_5.level_2_intern;

import java.util.Scanner;

class taskEleven {
    public static void main(String[] args) {
        int[] newArray = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Array[" + i + "] = " + newArray[i]);
        }
    }
}