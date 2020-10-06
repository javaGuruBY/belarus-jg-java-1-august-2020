package com.javaguru.student_vadim_migun.lesson_2.level_3;

/*
Напишите программу, которая запрашивает у пользователя целое число
и печатает на консоль таблицу умножения для этого числа до 10.

Test Data:
Input a number: 8

Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */

import java.util.Scanner;

public class Task_9
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input number: ");

        int number = scan.nextInt();
        System.out.println("Number = " + number);

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(number + " x " + i + " = " + number * i);

        }
    }
}

       /*

       Цикл for

       1-ый блок, переменная счетчик
       2-ой блок, условие до каких пор будет выполняться цикл
       3-ий блок, изменение переменной i на 1    // i++ == i=i+1

        */
