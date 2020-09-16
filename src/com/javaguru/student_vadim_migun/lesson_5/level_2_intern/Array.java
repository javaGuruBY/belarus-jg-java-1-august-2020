package com.javaguru.student_vadim_migun.lesson_5.level_2_intern;
/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива любым числом,
 - вывести значение каждой ячейки на консоль.
 */
class Array {
    public static void main(String[] args) {
        int[] numbers = new int[3];
//        for (int i = 0; i < numbers.length; i++) {
            numbers[0] = 10;
            numbers[1] = 12;
            numbers[2] = 15;

            System.out.println(numbers[0]);
            System.out.println(numbers[1]);
            System.out.println(numbers[2]);
//            System.out.println();

        }


    }
//  }
