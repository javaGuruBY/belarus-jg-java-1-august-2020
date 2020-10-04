package com.javaguru.student_vladimir_petranovski.lesson_7.level_6.task_13;
/*
Разработать класс с методом, который копирует числа в заданном диапазоне
из одного массива в другой:

int[] copyInRange(int[] in, int numberFrom, int numberTo)

вернуть новый массив, который содержит только те числа,
которые больше или равны numberFrom и меньше или равны numberTo.
Размер выходного массива должен быть равен количеству элементов в нем.

Логику необходимо реализовать в отдельном классе Copy.

Написать тестовые сценарии для класса Copy в классе CopyTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */

import java.awt.image.renderable.ContextualRenderedImageFactory;
import java.util.Arrays;

class Copy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {

        return findFinishArray(in, numberFrom, numberTo);
    }

    int[] copyArrayInAnotherArray(int[] in, int numberFrom, int numberTo) {
        int[] anotherArray = Arrays.copyOfRange(in, numberFrom, numberTo);
        return anotherArray;
    }

    int findLengthFinishArray(int[] in, int numberFrom, int numberTo) {
        int count = 0;
        for (int i = 0; i < copyArrayInAnotherArray(in, numberFrom, numberTo).length; i++) {
            if (copyArrayInAnotherArray(in, numberFrom, numberTo)[i] >= numberFrom && copyArrayInAnotherArray(in, numberFrom, numberTo)[i] <= numberTo) {
                count++;
            }
        }
        return count;
    }

    int[] findFinishArray(int[] in, int numberFrom, int numberTo) {
        int[] finishArray = new int[findLengthFinishArray(in, numberFrom, numberTo)];
        int indexValue = 0;
        for (int i : copyArrayInAnotherArray(in, numberFrom, numberTo)) {
            if (i >= numberFrom && i <= numberTo) {
                finishArray[indexValue] = i;
                indexValue++;
            }
        }
        return finishArray;
    }
}
