/*
Учимся работать со строками.

Тема: Считывание строк с консоли.

Программа должна спрашивать как зовут пользователя,
считывать его имя с консоли и выводить приветствие
в виде: "Hello UserName!".

Подсказка: строку с консоли можно считать используя
обьект Scanner. Загуглите как это можно сделать:
"как в Java считать строку с консоли".
* */

package com.javaguru.student_sergey_kazyanin.lesson_3.level_2;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName;
        System.out.print("Input your USERNAME: ");
        userName = scan.nextLine();

        String greeting = "Hello " + userName + "!";
        System.out.println(greeting);
    }
}
