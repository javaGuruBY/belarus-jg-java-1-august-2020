package com.javaguru.student_vadim_migun.lesson_4.level_3_junior;
/*
Write a Java program that accepts three numbers and prints:
- "All numbers are equal" if all three numbers are equal,
- "All numbers are different" if all three numbers are different
- "Neither all are equal or different" otherwise.
 */

import java.util.Scanner;

class EqualAndDifferent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.println("Please enter third number: ");
        int thirdNumber = scan.nextInt();

        if(firstNumber == secondNumber && secondNumber == thirdNumber){
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }
}
