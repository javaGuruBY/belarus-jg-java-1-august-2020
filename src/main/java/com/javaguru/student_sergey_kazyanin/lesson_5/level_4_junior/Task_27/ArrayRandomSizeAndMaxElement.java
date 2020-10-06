/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.
 */
package com.javaguru.student_sergey_kazyanin.lesson_5.level_4_junior.Task_27;

import java.util.Random;

class ArrayRandomSizeAndMaxElement {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[random.nextInt(50)];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }

        System.out.println("Вывод массива:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] - " + numbers[i]);
        }

        int maxNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (maxNumber < numbers[i]) {
                maxNumber = numbers[i];
            }
        }
        System.out.println("Максимальный элемента массива, число - " + maxNumber);


    }
}
