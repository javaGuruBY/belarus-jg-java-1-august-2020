package com.javaguru.student_vadim_migun.lesson_2.level_2;

/*
Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:
Hello имя пользователя!
 */

import java.util.Scanner;

public class Task_8 {

    public static void main (String [] args) {

        System.out.println("Write your name");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Hello " + name + "!");

    }


}



