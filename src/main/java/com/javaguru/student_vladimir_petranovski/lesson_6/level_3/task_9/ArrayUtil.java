package com.javaguru.student_vladimir_petranovski.lesson_6.level_3.task_9;
/*
Добавьте в класс ArrayUtil метод для проверки содержит ли массив целых чисел указынное число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.
 */

class ArrayUtil {
    public boolean isWhetherAnArraySpecifiedNumber(int arrayLength, int number) {
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int j : arr) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }
}
