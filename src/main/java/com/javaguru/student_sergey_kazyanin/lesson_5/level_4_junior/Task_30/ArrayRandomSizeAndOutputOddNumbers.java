/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведети их на консоль.
 */
package com.javaguru.student_sergey_kazyanin.lesson_5.level_4_junior.Task_30;

import java.util.Random;

class ArrayRandomSizeAndOutputOddNumbers {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[random.nextInt(20)];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Вывод массива:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] - " + numbers[i]);
        }
        System.out.println();
        System.out.println("Вывод нечетных значений массива");


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 !=0) {
                System.out.println("Numbers[" + i + "] - " + numbers[i]);
            }
        }


    }
}
