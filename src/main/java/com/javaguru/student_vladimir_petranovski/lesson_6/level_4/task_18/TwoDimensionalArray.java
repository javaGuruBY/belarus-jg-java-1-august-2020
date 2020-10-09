package com.javaguru.student_vladimir_petranovski.lesson_6.level_4.task_18;
/*
Как объявить двумерный массив?
Найти в интернете и написать пример кода в котором:
- создать класс TwoDimensionalArray,
- создать метод для заполнения массива случайными числами,
- создать метод для подсчёта суммы всех чисел в массиве.

Создать класс TwoDimensionalArrayTest и написать
автоматические тесты для метода подсчёта суммы всех
чисел в массиве.
 */

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {
    public static int[][] fillArray() {
        int[][] twoArray = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[0].length; j++) {
                twoArray[i][j] = random.nextInt(100);
            }
        }
       return twoArray;
    }

    public int sumAllNumbersArray(int[][] twoArray) {
        int sum = 0;
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[0].length; j++) {
                sum +=twoArray[i][j];
            }
        }
        return sum;
    }

    public static int[][] array() { // для проверки метода sumAllNumbersArray, потому что при вызове в мэйне его не видно наглядно
        int[][] array = {{3, 5, 6}, {1,4, 7}};
        return array;
    }

    public static void main(String[] args) {
        //System.out.println(Arrays.deepToString(fillArray()));
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        for (int i = 0; i < fillArray().length; i++) {
            for (int j = 0; j < fillArray()[0].length; j++) {
                System.out.print(" " + fillArray()[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(twoDimensionalArray.sumAllNumbersArray(array()));
    }
}
