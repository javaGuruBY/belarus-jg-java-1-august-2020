package com.javaguru.student_vadim_migun.training.lesson_10;

import java.util.Scanner;

class IntegerNumberMathService implements MathService {

    @Override
    public void execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();

        MathOperation mathOperation = new SumTwoNumberOperation(firstNumber, secondNumber);
        System.out.println("Operation result: " + mathOperation);
    }
}
