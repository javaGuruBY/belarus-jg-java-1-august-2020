package com.javaguru.student_vadim_migun.lesson_4.level_4_junior;

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

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
        calculatorTest.maxOfTwoNumbers1();
        calculatorTest.maxOfTwoNumbers2();
        calculatorTest.maxOfTwoNumbers3();
        calculatorTest.maxOfTwoNumbers4();
        calculatorTest.maxOfThreeNumber1();
        calculatorTest.maxOfThreeNumber2();
        calculatorTest.maxOfThreeNumber3();
        calculatorTest.maxOfThreeNumber4();
        calculatorTest.maxOfThreeNumber5();
        calculatorTest.maxOfThreeNumber6();
        calculatorTest.maxOfThreeNumber7();

    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = Fail");
        }
    }

    public void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("subtraction test = Fail");
        }
    }

    public void multiplicationTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = Fail");
        }
    }

    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.division(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = Fail");
        }
    }
    public void isEvenTest1(){
        int number = 4;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result){
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = Fail");
        }
    }
    public void isEvenTest2(){
        int number = 3;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result){
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = Fail");
        }
    }
    public void maxOfTwoNumbers1(){
        Calculator calculator = new Calculator();
        int actualNumber = calculator.maxOfTwoNumbers(2,3);
        int expectedResult = 3;
        if (actualNumber == expectedResult) {
            System.out.println("Success - Max of two number: " + expectedResult);
        } else {
            System.out.println("Fail - Max of two number: " + expectedResult);
        }

    }
    public void maxOfTwoNumbers2(){
        Calculator calculator = new Calculator();
        int actualNumber = calculator.maxOfTwoNumbers(7,1);
        int expectedResult = 7;
        if (actualNumber == expectedResult) {
            System.out.println("Success - Max of two number: " + expectedResult);
        } else {
            System.out.println("Fail - Max of two number: " + expectedResult);
        }

    }
    public void maxOfTwoNumbers3(){
        Calculator calculator = new Calculator();
        int actualNumber = calculator.maxOfTwoNumbers(4,4);
        int expectedResult = 4;
        if (actualNumber == expectedResult) {
            System.out.println("Success - numbers are EQUAL");
        } else {
            System.out.println("Fail - numbers aren't EQUAL");
        }
    }
    public void maxOfTwoNumbers4(){
        Calculator calculator = new Calculator();
        int actualNumber = calculator.maxOfTwoNumbers(5,4);
        int expectedResult = 4;
        if (actualNumber == expectedResult) {
            System.out.println("Success - numbers are EQUAL");
        } else {
            System.out.println("Fail - numbers aren't EQUAL");
        }
    }
/*Добавьте в класс CalculatorTest тесты для этого метода.
Тесты должны покрывать следующие тестовые сценарии:
- первое число больше второго и третьего
- второе число больше первого и третьего
- третье число больше первого и второго
- первые два равны и больше третьего
- ...
- три числа равны
По одному тесту на каждый из сценариев! */

    public void maxOfThreeNumber1() { // первое число больше второго и третьего
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumber(3, 2, 1);
        if (result == 3) {
            System.out.println("Success - 1 number is greater 2 and 3: " + result);
        } else {
            System.out.println("Fail ");
        }
    }
    public void maxOfThreeNumber2() { // второе число больше первого и третьего
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumber(2, 3, 1);
        if (result == 3) {
            System.out.println("Success - 2 number is greater 1 and 3: " + result);
        } else {
            System.out.println("Fail ");
        }
    }
    public void maxOfThreeNumber3() { //  третье число больше первого и второго
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumber(1, 2, 3);
        if (result == 3) {
            System.out.println("Success - 3 number is greater 1 and 2: " + result);
        } else {
            System.out.println("Fail ");
        }
    }
    public void maxOfThreeNumber4() { // первые два равны и больше третьего
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumber(2, 2, 1);
        if (result == 2) {
            System.out.println("Success - 1 and 2 numbers are equal and greater than 3: " + result);
        } else {
            System.out.println("Fail ");
        }
    }
    public void maxOfThreeNumber5() { // второе и третье числа равны и больше первого
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumber(1, 2, 2);
        if (result == 2) {
            System.out.println("Success - 2 and 3 numbers are equal and greater than 1: " + result);
        } else {
            System.out.println("Fail ");
        }
    }
    public void maxOfThreeNumber6() { // первое и третье числа равны и больше второго
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumber(2, 1, 2);
        if (result == 2) {
            System.out.println("Success - 1 and 3 numbers are equal and greater than 2: " + result);
        } else {
            System.out.println("Fail ");
        }
    }
    public void maxOfThreeNumber7() { // три числа равны
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumber(2, 2, 2);
        if (result == 2) {
            System.out.println("Success - three numbers are equal: " + result);
        } else {
            System.out.println("Fail - three numbers aren't equal ");
        }
    }



}


