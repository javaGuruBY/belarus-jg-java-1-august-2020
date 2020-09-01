package com.javaguru.student_vladimir_petranovski.lesson_3.level_2;
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

public class TaskEightString {
    public static void main(String[] args) {
        String userName = "Vladimir";
        String greeting = "Hi " + userName + "!";
        String joinUs = greeting + " Join us in the group.";
        System.out.println(joinUs);
    }
}
