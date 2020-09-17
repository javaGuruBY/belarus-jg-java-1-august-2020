package com.javaguru.student_vadim_migun.lesson_5.level_2_intern;

import java.util.Random;

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль.
 */

class ArrayRandomNumbers {
    public static void main(String[] args) {

        int [] numbers = new int[3];
        Random random = new Random();

        for (int i=0; i<numbers.length; i++) {
            numbers[i] = random.nextInt(50);
//        }
//       for (int i=0; i<numbers.length; i++){


        System.out.println( "Numbers " + i + " = " + numbers[i]);

        }
    }
}
