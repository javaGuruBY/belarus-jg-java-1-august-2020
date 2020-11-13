package com.javaguru.student_vladimir_petranovski.lesson_13.level_1.task_5;
/*
Воспользуйтесь документацией Java (javadoc)
и найдите информацию о классе java.lang.Exception.

Напишите класс ExceptionDemo, в котором продемонстрирейте
разные способы создания экземпляра класса Exception.
 */

import java.security.PublicKey;

class ExceptionDemo {
    public static void main(String[] args) throws Exception{
        new Error();
        new Exception().getMessage();
        new RuntimeException().getStackTrace();

    }
}
