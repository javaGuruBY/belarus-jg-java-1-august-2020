package com.javaguru.student_Denis_Shlichkov.lesson_6.level_1_intern.task_1;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.testIsEven();
    }

    public void testIsEven() {
        Calculator calculator = new Calculator();
        CalculatorOptimized calculatorOptimized = new CalculatorOptimized();
        boolean testOne = calculator.isEven(2);
        boolean testOneOptim = calculatorOptimized.isEven(2);
        System.out.println("Checking an even number");
        if (testOne == true && testOneOptim == true) {
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");

        boolean testTwo = calculator.isEven(3);
        boolean testTwoOptim = calculatorOptimized.isEven(3);
        System.out.println("Check odd number");
        if (testTwo == false && testTwoOptim == false) {
            System.out.println("Test - OK");
        }
        else System.out.println("Test - FAIL");

        boolean testThree = calculator.isEven(4);
        boolean testThreeOptim = calculatorOptimized.isEven(5);
        System.out.println("Checking an different numbers");
        if (testThree == testThreeOptim) {
            System.out.println("Test - FAIL");
        }
        else System.out.println("Test - OK");
    }
}
