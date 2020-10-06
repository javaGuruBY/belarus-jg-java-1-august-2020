/*
Учимся работать со строками.

Тема: Считывание строк с консоли.

Программа должна спрашивать как зовут пользователя,
считывать его имя с консоли и выводить приветствие
в виде: "Hello UserName!".

Подсказка: строку с консоли можно считать используя
обьект Scanner. Загуглите как это можно сделать:
"как в Java считать строку с консоли".
 */
package com.javaguru.student_Denis_Shlichkov.lesson_3.level_2;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = enter.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}
