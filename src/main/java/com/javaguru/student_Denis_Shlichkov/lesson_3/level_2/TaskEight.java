/*
Учимся работать со строками.

Тема: Конкатенация строк.

Напишите программу в которой создайте переменную
типа String и присвойте ей в качестве начального значения
ваше имя. Выведете на консоль приветствие типа "Hi YourName".

Подсказка: любые две строки можно соединять знаком "+".

    String userName = "Viktor";
    String greeting = "Hi " + userName + "!";
 */
package com.javaguru.student_Denis_Shlichkov.lesson_3.level_2;

public class TaskEight {
    public static void main(String[] args) {
        String userName = "Denis";
        String greetingUser = "Hi " + userName + "!";
        System.out.println(greetingUser);
    }
}
