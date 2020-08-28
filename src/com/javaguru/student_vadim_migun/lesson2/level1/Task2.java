package com.javaguru.student_vadim_migun.lesson2.level1;


import java.util.Scanner;

class Task2 {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first fractional number: ");
        double firstNumber = sc.nextDouble();
        System.out.println("Fractional first number = " + firstNumber);

        System.out.println("Please enter second fractional number: ");
        double secondNumber = sc.nextDouble();
        System.out.println("Fractional second number: " + secondNumber);

        double summResult = firstNumber + secondNumber;
        System.out.println("Summ result = " + summResult);

        double subtractResult = firstNumber - secondNumber;
        System.out.println("Subtract result = " + subtractResult);

        double multiplyResult = firstNumber * secondNumber;
        System.out.println("Multiply result = " + multiplyResult);

        double divideResult = firstNumber / secondNumber;
        System.out.println("Divide result = " + divideResult);



    }

}