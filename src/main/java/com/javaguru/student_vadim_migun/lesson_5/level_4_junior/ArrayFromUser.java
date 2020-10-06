package com.javaguru.student_vadim_migun.lesson_5.level_4_junior;
/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
 */

import java.util.Scanner;

class ArrayFromUser {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте длину массива: ");
        int arrayLength = scan.nextInt();
        System.out.println("Длина массива = " + arrayLength);
        System.out.println();

        int[] numbers = new int[arrayLength];
        System.out.println("Введите числа массива: ");
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = scan.nextInt();
            System.out.println("Numbers " + i + " = " + numbers[i]);
        }
        System.out.println();

        for (int j : numbers) {         //   for (int j=0; j<numbers.length; j++) {
            System.out.println(j);
        }

    }
}



