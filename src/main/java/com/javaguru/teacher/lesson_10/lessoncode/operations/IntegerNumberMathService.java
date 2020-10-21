package com.javaguru.teacher.lesson_10.lessoncode.operations;

import java.util.Scanner;

class IntegerNumberMathService implements MathService {


    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number:");
        int secondNumber = scanner.nextInt();

        int result = firstNumber + secondNumber;
        System.out.println("Operation result: " + result);
    }
}
