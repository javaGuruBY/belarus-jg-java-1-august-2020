package com.javaguru.teacher.lesson_2.lessoncode;

import java.util.Scanner;

class  UserInputExample {

    public static void main(String[] args) {
        System.out.println("Please enter first number (int): ");

        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();

        System.out.println("First number: " + firstNumber);

        System.out.println("Please enter second number (int): ");

        int secondNumber = sc.nextInt();

        System.out.println("Second number: " + secondNumber);

        int multiplyResult = firstNumber * secondNumber;

        System.out.println("Multiply result: " + multiplyResult);
        //code review
        int result = firstNumber * secondNumber / (10 * 2);
        System.out.println("Result: " + result);
    }
}
