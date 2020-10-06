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

package com.javaguru.student_sergey_kazyanin.lesson_3.level_2;

class Task_8 {
    public static void main(String[] args) {
        String myName = "Sergey";
        String greeting = "Hi " + myName + "!";

        System.out.println(greeting);
    }

}
