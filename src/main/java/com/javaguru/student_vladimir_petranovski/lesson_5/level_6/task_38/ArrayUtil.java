package com.javaguru.student_vladimir_petranovski.lesson_5.level_6.task_38;
/*
Создайте в классе ArrayUtil метод для
нахождения минимального числа в массиве целых чисел.
class ArrayUtil {
    public int findMinNumber(int[] array) {
        // Write implementation here !!!
    }
}
 */
class ArrayUtil {
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
