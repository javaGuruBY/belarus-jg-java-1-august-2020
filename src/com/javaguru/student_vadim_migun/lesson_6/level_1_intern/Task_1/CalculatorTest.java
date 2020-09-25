package com.javaguru.student_vadim_migun.lesson_6.level_1_intern.Task_1;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.isEvenTest();

    }

    void isEvenTest() {
        Calculator calculator = new Calculator();
        int number = 6;
        boolean result = calculator.isEven(number);
        if (result) {
            System.out.println("Even test - OK");
        } else {
            System.out.println("Even test - FAIL");
        }
    }

}

