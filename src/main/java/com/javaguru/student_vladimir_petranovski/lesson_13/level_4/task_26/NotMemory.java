package com.javaguru.student_vladimir_petranovski.lesson_13.level_4.task_26;
/*
Напишите программу, которая вылетает с StackOverflowError.
Подсказка: Вызовите метод в рекурсии (сам себя).
Память JVM не безгранична!
 */

class NotMemory {
    public static void main(String[] args) {
        number();
    }
     public static int number() {
        return number();
     }
}
