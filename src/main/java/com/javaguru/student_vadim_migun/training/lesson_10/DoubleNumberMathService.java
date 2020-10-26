package com.javaguru.student_vadim_migun.training.lesson_10;

import java.util.Scanner;

class DoubleNumberMathService implements MathService{
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array size: ");
        int size = scanner.nextInt();
        double[] numbers = new double[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double subtractResult = 0;
        for (double number : numbers){
            subtractResult -= number;
        }
        System.out.println("Subtract result: " + subtractResult);
    }
}
