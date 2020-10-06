package com.javaguru.teacher.lesson_8.lessoncode;

class ArrayService {

    int sumInArray(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum = sum + element;
        }
        return sum;
    }
}
