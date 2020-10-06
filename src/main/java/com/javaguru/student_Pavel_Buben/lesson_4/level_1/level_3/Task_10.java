package com.javaguru.student_Pavel_Buben.lesson_4.level_1.level_3;

import java.util.Scanner;

class Task_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Input third number: ");
        int thirdNumber = scanner.nextInt();
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("Наибольшее: " + firstNumber);
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println("Наибольшее: " + secondNumber);
        } else if (thirdNumber >= firstNumber && thirdNumber >= secondNumber)
        {   System.out.println("Наибольшее: " + thirdNumber);
        }
    }
}



