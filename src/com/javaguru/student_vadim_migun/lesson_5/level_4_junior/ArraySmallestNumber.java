package com.javaguru.student_vadim_migun.lesson_5.level_4_junior;
/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.
 */

class ArraySmallestNumber {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println("Numbers " + i + " = " + array[i]);
        }
        System.out.println();

        int minNumber = array[0];
        for (int j = 1; j < array.length; j++) {
            minNumber = Math.min(minNumber, array[j]);
        }
        System.out.println("Минимальное число массива = " + minNumber);

    }
}
