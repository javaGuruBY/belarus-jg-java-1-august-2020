package com.javaguru.student_sergey_kazyanin.lesson_4.level_4_junior.Task_11;

class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int num1 = 8;
        int num2 = 2;
        System.out.println("1. Операция сложения чисел " + num1 + " и " + num2 + " = " + calc.sum(num1, num2));
        System.out.println("2. Операция вычитания чисел " + num1 + " и " + num2 + " = " + calc.minus(num1, num2));
        System.out.println("3. Операция деления чисел " + num1 + " и " + num2 + " = " + calc.div(num1, num2));
        System.out.println("4. Операция умножения чисел " + num1 + " и " + num2 + " = " + calc.multiply(num1, num2));
    }
}
