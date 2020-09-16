package com.javaguru.student_vladimir_petranovski.lesson_5.level_6.task_39;

import java.util.Random;

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
    public int findMinNumber(int[] array) {
        int min = 0;
        for (int i : array) {
            if ( i <= min) {
                min = i;
            }
        }
        return min;
    }
}
