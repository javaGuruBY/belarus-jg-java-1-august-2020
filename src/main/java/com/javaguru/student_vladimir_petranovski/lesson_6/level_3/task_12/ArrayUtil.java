package com.javaguru.student_vladimir_petranovski.lesson_6.level_3.task_12;
/*
Добавьте в класс ArrayUtil метод для замены вхождений указанного числа в массиве целых чисел на другое число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.

Подсказка: void replaceAll(int[] arr, int numberToReplace, int newNumber).
 */

class ArrayUtil {
    public void replaceAll(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
            }
        }
    }
}
