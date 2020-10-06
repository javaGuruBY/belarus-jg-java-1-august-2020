package com.javaguru.student_vladimir_petranovski.lesson_3.level_2;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

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
public class TaskNineStringScanner {
    public static void main(String[] args) {
        System.out.println("What is your name");
        Scanner scanner = new Scanner(System.in);
        String myName = scanner.nextLine();
        System.out.println("Hello " + myName + "!");
    }
}
