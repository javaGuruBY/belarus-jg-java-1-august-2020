package com.javaguru.student_vadim_migun.lesson_4.level_2_intern;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наибольшее из них.
Нельзя пользоваться классом Math, можно использовать только if else.
 */

class LargestNumber  {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Input second number: ");
        int secondNumber = scan.nextInt();

        if (firstNumber>secondNumber) {
            System.out.println("Largest number = " + firstNumber);
        } else {
            System.out.println("Largest number = " + secondNumber);
        }

    }
}
