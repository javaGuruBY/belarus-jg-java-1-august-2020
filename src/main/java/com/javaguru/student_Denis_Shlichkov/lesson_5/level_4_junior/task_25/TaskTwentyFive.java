/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
 */
package com.javaguru.student_Denis_Shlichkov.lesson_5.level_4_junior.task_25;

import java.util.Scanner;

class TaskTwentyFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersOfArray;
        System.out.println("Insert numbers of array");
        numbersOfArray = scanner.nextInt();

        int [] newArray = new int[numbersOfArray];

        System.out.println("Insert elements of array");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Number " + (i+1));
            newArray[i] = scanner.nextInt();
        }

        for (int j : newArray) {
            System.out.println(j);
        }
    }
}
