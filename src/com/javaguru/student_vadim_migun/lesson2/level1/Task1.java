package com.javaguru.student_vadim_migun.lesson2.level1;

import java.util.Scanner;

class Task1 {

    public static void main(String [] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first Number: ");
        int firstNumber = scan.nextInt();
        System.out.println("First number: " + firstNumber);

        System.out.println("Please enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.println("Second number: " + secondNumber);

        int sumResult = firstNumber + secondNumber;
        System.out.println("Summ result = " + sumResult);

        int subtractResult = firstNumber - secondNumber;
        System.out.println("Subtract result = " + subtractResult);

        int multiplyResult = firstNumber * secondNumber;
        System.out.println("Multiplay result = " + multiplyResult);

        int divideResult = firstNumber / secondNumber;
        System.out.println("Devide result = " + divideResult);


    }
}