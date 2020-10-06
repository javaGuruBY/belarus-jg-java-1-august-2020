package com.javaguru.student_Denis_Shlichkov.lesson_5.level_5_middle;

class ArrayUtil {
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
    }
}
