package com.javaguru.student_vladimir_petranovski.lesson_5.level_6.task_36;
/*
Создайте в классе ArrayUtil метод для
нахождения максимального числа в массиве целых чисел.
class ArrayUtil {
    public int findMaxNumber(int[] array) {
        // Write implementation here !!!
    }
}
 */
class ArrayUtil {
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
