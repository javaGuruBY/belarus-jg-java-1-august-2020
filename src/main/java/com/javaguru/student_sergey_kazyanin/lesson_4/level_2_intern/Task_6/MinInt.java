/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наименьшее из них.
 */
package com.javaguru.student_sergey_kazyanin.lesson_4.level_2_intern.Task_6;

import java.util.Scanner;

class MinInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 1-ое число: ");
        int firstNumber = sc.nextInt();

        System.out.print("Введите 2-ое число: ");
        int secondNumber = sc.nextInt();

        if(firstNumber <= secondNumber) {
            System.out.println("Наименьшее число: " + firstNumber);
        } else {
            System.out.println("Наименьшее число: " + secondNumber);
        }

    }
}
