/*
Создайте класс CalculatorTest и напишите тесты для
всех методов класса Calculator из предыдущего задания.

Подсказка:

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        // по аналогии реализуйте тесты для остальных методов
    }

    public void sumTest() {
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

}
 */
package com.javaguru.student_sergey_kazyanin.lesson_4.level_4_junior.Task_13;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.minusTest();
        calculatorTest.divTest();
        calculatorTest.multiplyTest();
        calculatorTest.isEvenTest();

    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(firstNumber, secondNumber);
        int expectedResult = 15;
        if (actualResult == expectedResult) {
            System.out.println("Sum test = PASSED");
        } else {
            System.out.println("Sum test = FAILURE!!! actualResult = " + actualResult + " | expectedResult = " + expectedResult);
        }
    }

    public void minusTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.minus(firstNumber, secondNumber);
        int expectedResult = 5;
        if (actualResult == expectedResult) {
            System.out.println("Minus test = PASSED");
        } else {
            System.out.println("Minus test = FAILURE!!! actualResult = " + actualResult + " | expectedResult = " + expectedResult);
        }
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.div(firstNumber, secondNumber);
        int expectedResult = 2;
        if (actualResult == expectedResult) {
            System.out.println("Div test = PASSED");
        } else {
            System.out.println("Div test = FAILURE!!! actualResult = " + actualResult + " | expectedResult = " + expectedResult);
        }
    }

    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.multiply(firstNumber, secondNumber);
        int expectedResult = 50;
        if (actualResult == expectedResult) {
            System.out.println("Multiply test = PASSED");
        } else {
            System.out.println("Multiply test = FAILURE!!! actualResult = " + actualResult + " | expectedResult = " + expectedResult);
        }
    }
    public void isEvenTest() {
        int firstNumber = 10;
        Calculator calculator = new Calculator();
        boolean actualResult = calculator.isEven(firstNumber);
        boolean expectedResult = true;
        if (actualResult == expectedResult) {
            System.out.println("isEven test = PASSED");
        } else {
            System.out.println("isEven test = FAILURE!!! actualResult = " + actualResult + " | expectedResult = " + expectedResult);
        }
    }
}
