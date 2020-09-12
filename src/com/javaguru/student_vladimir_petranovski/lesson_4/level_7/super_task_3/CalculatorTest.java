package com.javaguru.student_vladimir_petranovski.lesson_4.level_7.super_task_3;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
    }

    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        Calculator calculator = new Calculator();
        checkResults(calculator.sum(firstNumber, secondNumber) == 75, "Sum Test");
    }

    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        checkResults(calculator.sub(firstNumber, secondNumber) == 20, "Sub Test");
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        checkResults(calculator.mul(firstNumber, secondNumber) == 25, "Mul Test");
    }

    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        Calculator calculator = new Calculator();
        checkResults(calculator.div(firstNumber, secondNumber) == 5, "Div Test");
    }

    public void isEvenTest() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(40);
        checkResults(result, "IsEven Test");

    }
    public void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = Ok");
        } else
            System.out.println(testName + " = Fail");
    }
}
