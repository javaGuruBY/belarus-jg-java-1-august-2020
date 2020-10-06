package com.javaguru.student_vadim_migun.lesson_6.level_3_junior.Task_9;
/*
Добавьте в класс ArrayUtil метод для проверки содержит ли массив целых чисел указынное число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.
 */

class ArrayUtil {

    public boolean findTheNumber (int arrayLength, int number) {
    int[] array = new int [arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int j : array) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }

}
