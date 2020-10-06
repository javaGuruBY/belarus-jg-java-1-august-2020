package com.javaguru.student_vadim_migun.lesson_5.level_2_intern;
/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль,
 - увеличить значение каждой ячейки на 2,
 - вывести значение каждой ячейки на консоль.
 */

class ArrayIncreaseByTwo {
    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.println("Numbers " + i + " = " + array[i]);
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            array[i] = array[i] + 2;
        System.out.println(" Numbers +2 = " + array[i]);
        }
    }
}
