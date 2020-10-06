/*
Создайте в классе ArrayUtil метод для
распечатки массива целых чисел на консоль.

class ArrayUtil {

    public void printArrayToConsole(int[] array) {
        // Write implementation here !!!
    }
}
 */
package com.javaguru.student_sergey_kazyanin.lesson_5.level_6_middle;

class ArrayUtil {

    public void printArrayToConsole(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public int findMaxNumber(int[] array) {
        int maximumNumber = array[0];
        for (int i : array) {
            if (i > maximumNumber) maximumNumber = i;
        }
        return maximumNumber;
    }

    public int findMinNumber(int[] array) {
        int minimumNumber = array[0];
        for (int i : array) {
            if (i < minimumNumber) minimumNumber = i;
        }
        return minimumNumber;
    }
}
