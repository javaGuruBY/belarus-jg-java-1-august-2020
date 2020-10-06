package com.javaguru.student_vadim_migun.lesson_3.level_2;

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

import java.util.Scanner;

class Task9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input your name: ");
        String userName = scan.nextLine();
        System.out.println("Hello " + userName + "!");


    }

}
