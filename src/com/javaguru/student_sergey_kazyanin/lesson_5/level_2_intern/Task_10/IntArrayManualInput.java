/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива любым числом,
 - вывести значение каждой ячейки на консоль.

 */
package com.javaguru.student_sergey_kazyanin.lesson_5.level_2_intern.Task_10;

import java.util.Random;

class IntArrayManualInput {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 45;
        numbers[1] = 33;
        numbers[2] = 21;


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Numbers[" + i + "] = " + numbers[i]);
        }
    }
}
