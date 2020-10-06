package com.javaguru.student_vadim_migun.lesson_6.level_4_junior.Task_18;
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

import java.util.Random;

class TwoDimensionalArray {

    public int[][] randomNumbers() {
        int[][] twoDimArray = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray.length; j++) {
                twoDimArray[i][j] = random.nextInt(20);
            }
        }
        return twoDimArray;
    }

    public int sumAllNumbersArray(int[][] twoArray) {
        int sum = 0;
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[0].length; j++) {
                sum = sum + twoArray[i][j];
            }
        }
        return sum;
    }


// (для себя) вывод значений двумерного массива на консоль

    public static void main(String[] args) {
        int[][] twoDimArray = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray.length; j++) {
                twoDimArray[i][j] = random.nextInt(9);
            }
        }
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray.length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}



