package com.javaguru.student_Pavel_Buben.lesson_4.level_1.level_4;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.minTest();
        calculatorTest.divisionTest();
        calculatorTest.multiTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersOne();
        calculatorTest.maxOfTwoNumbersTwo();
        calculatorTest.maxOfTwoNumbersThree();
    }

    void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    void minTest() {
        int firstNumber = 5;
        int secondNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.min(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Min test = OK");
        } else {
            System.out.println("Min test = FAIL");
        }
    }

    void divisionTest() {
        int firstNumber = 9;
        int secondNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.division(firstNumber, secondNumber);
        if (result == 3) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");

        }
    }

    void multiTest() {
        int firstNumber = 4;
        int secondNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.multi(firstNumber, secondNumber);
        if (result == 12) {
            System.out.println("Multi test = OK");
        } else {
            System.out.println("Multi test = FAIL");

        }
    }

    void isEvenTest() {
        int number = 2;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result) {
            System.out.println("IsEven test = OK");
        } else {
            System.out.println("IsEven test = FAIL");
        }
    }

    void maxOfTwoNumbersOne() {
        int firstNumber = 3;
        int secondNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 1) {
            System.out.println("MaxOfTwoNumbers Test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers Test = FAIL");
        }
    }

    void maxOfTwoNumbersTwo() {
        int firstNumber = 1;
        int secondNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("MaxOfTwoNumbers Test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers Test = FAIL");
        }
    }

    void maxOfTwoNumbersThree() {
        int firstNumber = 1;
        int secondNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 3) {
            System.out.println("MaxOfTwoNumbers Test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers Test = FAIL");
        }
    }
}