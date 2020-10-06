package com.javaguru.student_vadim_migun.lesson_6.level_4_junior.Task_14;
/*
Добавьте в класс ArrayUtil метод для сортировки массива целых чисел.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие,
что ваша реализацяия метода работает правильно.

 */

class ArrayUtil {


    public void sortArrayIncrease(int[] array) {

        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int max = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = max;
                }

            }
        }
    }

    public void sortArrayDecrease(int[] array) {

        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int min = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = min;
                }

            }

        }

    }
}

