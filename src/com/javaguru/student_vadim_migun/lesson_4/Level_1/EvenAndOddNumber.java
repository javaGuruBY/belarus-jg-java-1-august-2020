package com.javaguru.student_vadim_migun.lesson_4.Level_1;
/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль чётное оно или нет.

Подсказка: используйте для определения чётное число или нет
операцию остаток от деления (%). Если остаток от деления на 2
равен нулю то число чётное, иначе не чётное.
 */

import java.util.Scanner;

class EvenAndOddNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input integer number: ");
        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is even");
        }  else {
            System.out.println("Number is odd");

        }
    }
}
