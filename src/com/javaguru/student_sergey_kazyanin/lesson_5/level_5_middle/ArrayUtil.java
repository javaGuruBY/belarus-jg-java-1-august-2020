/*
Task_31
Создайте класс ArrayUtil.
Создайте в этом классе метод для создания
массива целых чисел указанной длины.

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        // Write implementation here !!!
    }
}

Task_33
Создайте в классе ArrayUtil метод для
заполнения массива целых чисел случайными числами.

class ArrayUtil {

    public void fillArrayWithRandomNumbers(int[] array) {
        // Write implementation here !!!
    }

}

 */
package com.javaguru.student_sergey_kazyanin.lesson_5.level_5_middle;

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] arrayNumber = new int[arrayLength];
        return arrayNumber;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }
}
