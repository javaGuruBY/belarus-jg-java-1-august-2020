package com.javaguru.student_vadim_migun.lesson_2.level_x;

/*
Напишите программу и продемонстрируйте в ней использование
однострочного и многострочного коментариев.
 */

import java.util.Scanner;

class SuperTask_5 {

    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);  //команда ввода данных с клавиатуры

        System.out.println("Input first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("First number = " + firstNumber);

        System.out.println("Input second number: ");
        int secondNumber = scan.nextInt();
        System.out.println("Second number = " + secondNumber);

        double divide = firstNumber / (double) secondNumber;
        System.out.println("Divide = " + divide);

    }
}
