/*
Создайте класс CalculatorTest и напишите тесты для
всех методов класса Calculator из предыдущего задания.

Task_14
Добавьте в класс Calculator метод для определения
максимального из двух целых чисел.

Добавьте в класс CalculatorTest тесты для этого метода.
Тесты должны покрывать следующие тестовые сценарии:
- первое число больше второго
- второе число больше первого
- оба числа равны
Создайте по одному тесту на каждый из сценариев!

Task_15
Добавьте в класс Calculator метод для определения
максимального из трёх целых чисел.

Добавьте в класс CalculatorTest тесты для этого метода.
Тесты должны покрывать следующие тестовые сценарии:
- первое число больше второго и третьего
- второе число больше первого и третьего
- третье число больше первого и второго
- первые два равны и больше третьего
- ...
- три числа равны
По одному тесту на каждый из сценариев!
 */
package com.javaguru.student_sergey_kazyanin.lesson_4.level_4_junior.Task_14_15;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.minusTest();
        calculatorTest.divTest();
        calculatorTest.multiplyTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTestOne();
        calculatorTest.maxOfTwoNumbersTestTwo();
        calculatorTest.maxOfTwoNumbersTestThree();
        calculatorTest.maxOfThreeNumbersTestScenario1();
        calculatorTest.maxOfThreeNumbersTestScenario2();
        calculatorTest.maxOfThreeNumbersTestScenario3();
        calculatorTest.maxOfThreeNumbersTestScenario4();
        calculatorTest.maxOfThreeNumbersTestScenario5();
        calculatorTest.maxOfThreeNumbersTestScenario6();
        calculatorTest.maxOfThreeNumbersTestScenario7();

    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;

        Calculator calculator = new Calculator();

        int actualResult = calculator.sum(firstNumber, secondNumber);
        int expectedResult = 15;
        printTestResult(actualResult, expectedResult, "Sum");
    }

    public void minusTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.minus(firstNumber, secondNumber);
        int expectedResult = 5;
        printTestResult(actualResult, expectedResult, "Minus");
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.div(firstNumber, secondNumber);
        int expectedResult = 2;
        printTestResult(actualResult, expectedResult, "Div");

    }

    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.multiply(firstNumber, secondNumber);
        int expectedResult = 50;
        printTestResult(actualResult, expectedResult, "Multiply");

    }

    public void isEvenTest() {
        int firstNumber = 10;
        Calculator calculator = new Calculator();
        boolean actualResult = calculator.isEven(firstNumber);
        boolean expectedResult = true;
        printTestResult(actualResult, expectedResult, "isEven");

    }

    public void maxOfTwoNumbersTestOne() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        int expectedResult = 10;
        printTestResult(actualResult, expectedResult, "maxOfTwoNumbers (firstNumber > secondNumber)");

    }

    public void maxOfTwoNumbersTestTwo() {
        int firstNumber = 5;
        int secondNumber = 8;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        int expectedResult = 8;
        printTestResult(actualResult, expectedResult, "maxOfTwoNumbers (firstNumber < secondNumber)");

    }

    public void maxOfTwoNumbersTestThree() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        int expectedResult = 5;
        printTestResult(actualResult, expectedResult, "maxOfTwoNumbers (firstNumber = secondNumber)");

    }

    public void maxOfThreeNumbersTestScenario1() {
        int firstNumber = 10;
        int secondNumber = 8;
        int thirdNumber = -4;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        int expectedResult = 10;
        printTestResult(actualResult, expectedResult, "maxOfThreeNumbersTestScenario1");
    }

    public void maxOfThreeNumbersTestScenario2() {
        int firstNumber = 5;
        int secondNumber = 9;
        int thirdNumber = 7;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        int expectedResult = 9;
        printTestResult(actualResult, expectedResult, "maxOfThreeNumbersTestScenario2");
    }

    public void maxOfThreeNumbersTestScenario3() {
        int firstNumber = 5;
        int secondNumber = 9;
        int thirdNumber = 13;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        int expectedResult = 13;
        printTestResult(actualResult, expectedResult, "maxOfThreeNumbersTestScenario3");
    }

    public void maxOfThreeNumbersTestScenario4() {
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 1;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        int expectedResult = 5;
        printTestResult(actualResult, expectedResult, "maxOfThreeNumbersTestScenario4");
    }

    public void maxOfThreeNumbersTestScenario5() {
        int firstNumber = 5;
        int secondNumber = 8;
        int thirdNumber = 8;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        int expectedResult = 8;
        printTestResult(actualResult, expectedResult, "maxOfThreeNumbersTestScenario5");
    }

    public void maxOfThreeNumbersTestScenario6() {
        int firstNumber = 9;
        int secondNumber = 5;
        int thirdNumber = 9;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        int expectedResult = 9;
        printTestResult(actualResult, expectedResult, "maxOfThreeNumbersTestScenario6");
    }

    public void maxOfThreeNumbersTestScenario7() {
        int firstNumber = 9;
        int secondNumber = 9;
        int thirdNumber = 9;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        int expectedResult = 9;
        printTestResult(actualResult, expectedResult, "maxOfThreeNumbersTestScenario7");
    }

    public void printTestResult(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " test = PASSED");
        } else {
            System.out.println(testName + " test = FAILURE!!! actualResult = " + actualResult + " | expectedResult = " + expectedResult);
        }
    }

    public void printTestResult(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " test = PASSED");
        } else {
            System.out.println(testName + " test = FAILURE!!! actualResult = " + actualResult + " | expectedResult = " + expectedResult);
        }
    }
}
