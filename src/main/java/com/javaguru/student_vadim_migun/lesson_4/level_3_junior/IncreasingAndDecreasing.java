package com.javaguru.student_vadim_migun.lesson_4.level_3_junior;
/*
Write a program that accepts three numbers from the user and prints:
- "increasing" if the numbers are in increasing order,
- "decreasing" if the numbers are in decreasing order,
- "Neither increasing or decreasing order" otherwise.
 */

import java.util.Scanner;

class IncreasingAndDecreasing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.println("Please enter third number: ");
        int thirdNumber = scan.nextInt();

        if (firstNumber<secondNumber && secondNumber<thirdNumber){
        System.out.println("increasing");
        }  else if (firstNumber>secondNumber && secondNumber>thirdNumber){
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }

    }
}
