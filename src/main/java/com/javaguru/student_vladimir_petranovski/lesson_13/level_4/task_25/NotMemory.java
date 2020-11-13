package com.javaguru.student_vladimir_petranovski.lesson_13.level_4.task_25;
/*
Напишите программу, которая вылетает с OutOfMemoryError.

Подсказка: создайте много объектов, только не теряйте ссылки на них.
Например положите много объектов в список.

Память JVM не безгранична!
 */

import java.util.ArrayList;
import java.util.List;

class NotMemory {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000000000; i++) {
            numbers.add(i);
        }
    }
}
