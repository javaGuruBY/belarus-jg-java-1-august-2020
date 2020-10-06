package com.javaguru.student_vladimir_petranovski.lesson_5.level_5.task_33;

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
}
