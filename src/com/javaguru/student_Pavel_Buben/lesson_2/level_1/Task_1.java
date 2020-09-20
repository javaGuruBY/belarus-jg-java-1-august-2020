package com.javaguru.student_Pavel_Buben.lesson_2.level_1;

import java.util.Scanner;

class Task1 {
        public static void main(String[] args) {

            System.out.println("Please enter first number: " );
            Scanner scanner = new Scanner(System.in);
            int firstNumber = scanner.nextInt();
            System.out.println("First number: " + firstNumber);

            System.out.println("Please enter second number: " );
            int secondNumber = scanner.nextInt();
            System.out.println("Second number: " + secondNumber);

            int sumResult = firstNumber + secondNumber;
            System.out.println("SumResult: " + sumResult);

            int minusResult = firstNumber - secondNumber;
            System.out.println("MinusResult: " + minusResult);

            int megaResult = firstNumber + secondNumber - firstNumber * secondNumber / firstNumber;
            System.out.println("Result " + megaResult);




        }
}
