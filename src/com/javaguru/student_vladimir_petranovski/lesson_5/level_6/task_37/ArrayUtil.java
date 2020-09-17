package com.javaguru.student_vladimir_petranovski.lesson_5.level_6.task_37;

import java.util.Random;

/*
Создайте в классе ArrayUtil метод для
заполнения массива целых чисел случайными числами.
class ArrayUtil {
    public void fillArrayWithRandomNumbers(int[] array) {
        // Write implementation here !!!
    }
}
 */
class ArrayUtil {
    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
    }
    public int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }
    public int findMaxNumber(int[] array) {
        int max = 0;
        for (int i : array) {
            if ( i >= max) {
                max = i;
            }
        }
        return max;
    }
}
