/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль.

 */
package com.javaguru.student_Denis_Shlichkov.lesson_5.level_2_intern;

class taskTwelve {
    public static void main(String[] args) {
        int [] newArray = new int[3];
        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = (int) (Math.random() * 11);
            System.out.println(newArray[i]);
        }
    }

}
