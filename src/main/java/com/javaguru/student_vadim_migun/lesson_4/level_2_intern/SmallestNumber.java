package com.javaguru.student_vadim_migun.lesson_4.level_2_intern;

/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наименьшее из них.
 */

import java.util.Scanner;

class SmallestNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Input second number: ");
        int secondNumber = scan.nextInt();

        if (firstNumber>secondNumber) {
            System.out.println("Smallest number = " + secondNumber);
        } else {
            System.out.println("Smallest number = " + firstNumber);
        }
    }
}
