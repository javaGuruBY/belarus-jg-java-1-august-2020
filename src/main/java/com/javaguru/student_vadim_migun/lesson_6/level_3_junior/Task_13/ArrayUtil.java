package com.javaguru.student_vadim_migun.lesson_6.level_3_junior.Task_13;
/*
Добавьте в класс ArrayUtil метод для переворота массива целых чисел.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.
 */

class ArrayUtil {

    public void flipArray(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i -1] = tmp;
        }
    }
}
