package com.javaguru.student_sergey_kazyanin.lesson_2.lessoncode;

import java.util.Scanner;

class UserInputExample {
    public static void main(String[] args) {
        System.out.print("Please enter number (int): ");

        Scanner sc = new Scanner(System.in);

        int firstNumber = sc.nextInt();
        System.out.println("First number: " + firstNumber);

        System.out.print("Please enter second number (int): ");

        int secondNumber = sc.nextInt();

        System.out.println("Second number: " + secondNumber);

        int multipleResult = firstNumber * secondNumber;

        System.out.println("Multiply result: " + multipleResult);

    }
}
