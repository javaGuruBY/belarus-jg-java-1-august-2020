package com.javaguru.student_sergey_kazyanin.lesson_6.level_1_intern.Task_1;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.shouldEvenNumberTwo();
        test.shouldNotEvenNumberThree();
        test.shouldEvenNumberZero();
    }

    public void shouldEvenNumberTwo() {
        int number = 2;
        Calculator calc = new Calculator();
        boolean actualResult = calc.isEven(number);
        boolean expectedResult = true;
        printResult(actualResult, expectedResult, "shouldEvenNumberTwo");

    }

    public void shouldNotEvenNumberThree() {
        int number = 3;
        Calculator calc = new Calculator();
        boolean actualResult = calc.isEven(number);
        boolean expectedResult = false;
        printResult(actualResult, expectedResult, "shouldEvenNumberTwo");

    }

    public void shouldEvenNumberZero() {
        int number = 0;
        Calculator calc = new Calculator();
        boolean actualResult = calc.isEven(number);
        boolean expectedResult = true;
        printResult(actualResult, expectedResult, "shouldEvenNumberZero");

    }


    public void printResult(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " test = PASSED");
        } else {
            System.out.println(testName + " test = FAILURE!!! actualResult = " + actualResult + " | expectedResult = " + expectedResult);
        }
    }
}
