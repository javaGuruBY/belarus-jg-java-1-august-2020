package com.javaguru.student_vadim_migun.lesson_4.Level_1;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у
пользователя
целое число и выводит на консоль
положительное оно или отрицательное.
 */
class IntegerNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input integer number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Integer number = " + firstNumber);


    }

}
