package com.javaguru.student_vladimir_petranovski.lesson_6.level_3.task_11;
/*
Добавьте в класс ArrayUtil метод для замены первого вхождения указанного числа в массиве целых чисел на другое число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.
Подсказка: void replace(int[] arr, int numberToReplace, int newNumber).
 */

class ArrayUtil {
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void replace(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                break;
            }
        }
    }

    public boolean isCreateArray(int[] arr) {
        if (arr.length != 0) {
            return true;
        } else {
            return false;
        }
    }
}
