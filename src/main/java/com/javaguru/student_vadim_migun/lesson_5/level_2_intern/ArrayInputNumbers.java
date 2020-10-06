package com.javaguru.student_vadim_migun.lesson_5.level_2_intern;

import java.util.Scanner;

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива числом, запрошенным у пользователя,
 - вывести значение каждой ячейки на консоль.
 */
class ArrayInputNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 1-ое число ");
        int number1 = scan.nextInt();

        System.out.println("Введите 2-ое число ");
        int number2 = scan.nextInt();

        System.out.println("Введите 3-ое число ");
        int number3 = scan.nextInt();

        numbers[0] = number1;
        numbers[1] = number2;
        numbers[2] = number3;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);



    }

}
