package lesson_4.level_4_junior.task_11_12_13_14_15;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.summationTest();
        calculatorTest.subtractionTest();
        calculatorTest.divisionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTestOne();
        calculatorTest.maxOfTwoNumbersTestTwo();
        calculatorTest.maxOfTwoNumbersTestThree();
        calculatorTest.maxOfThreeNumbersTestOne();
        calculatorTest.maxOfThreeNumbersTestTwo();
        calculatorTest.maxOfThreeNumbersTestThree();
        calculatorTest.maxOfThreeNumbersTestFour();
        calculatorTest.maxOfThreeNumbersTestFive();
        calculatorTest.maxOfThreeNumbersTestSix();
        calculatorTest.maxOfThreeNumbersTestSeven();
        calculatorTest.maxOfThreeNumbersTestEight();
        calculatorTest.maxOfThreeNumbersTestNine();
        calculatorTest.maxOfThreeNumbersTestTen();
    }

    void summationTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.summation(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Summation test = OK");
        } else {
            System.out.println("Summation test = FAIL");
        }
    }

    void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.division(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    void multiplicationTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    void isEvenTest() {
        int number = 4;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result) {
            System.out.println("IsEven test = OK");
        } else {
            System.out.println("IsEven test = FAIL");
        }
    }

    void maxOfTwoNumbersTestOne() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 1) {
            System.out.println("MaxOfTwoNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    void maxOfTwoNumbersTestTwo() {
        int firstNumber = 5;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("MaxOfTwoNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    void maxOfTwoNumbersTestThree() {
        int firstNumber = 10;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 3) {
            System.out.println("MaxOfTwoNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    void maxOfThreeNumbersTestOne() {
        int firstNumber = 2;
        int secondNumber = 1;
        int threeNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, threeNumber);
        if (result == 1) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    void maxOfThreeNumbersTestTwo() {
        int firstNumber = 1;
        int secondNumber = 2;
        int threeNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, threeNumber);
        if (result == 2) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    void maxOfThreeNumbersTestThree() {
        int firstNumber = 1;
        int secondNumber = 1;
        int threeNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, threeNumber);
        if (result == 3) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    void maxOfThreeNumbersTestFour() {
        int firstNumber = 2;
        int secondNumber = 2;
        int threeNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, threeNumber);
        if (result == 4) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    void maxOfThreeNumbersTestFive() {
        int firstNumber = 2;
        int secondNumber = 1;
        int threeNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, threeNumber);
        if (result == 5) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    void maxOfThreeNumbersTestSix() {
        int firstNumber = 1;
        int secondNumber = 2;
        int threeNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, threeNumber);
        if (result == 6) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    void maxOfThreeNumbersTestSeven() {
        int firstNumber = 3;
        int secondNumber = 2;
        int threeNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, threeNumber);
        if (result == 7) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    void maxOfThreeNumbersTestEight() {
        int firstNumber = 2;
        int secondNumber = 3;
        int threeNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, threeNumber);
        if (result == 8) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    void maxOfThreeNumbersTestNine() {
        int firstNumber = 2;
        int secondNumber = 1;
        int threeNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, threeNumber);
        if (result == 9) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    void maxOfThreeNumbersTestTen() {
        int firstNumber = 3;
        int secondNumber = 3;
        int threeNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, threeNumber);
        if (result == 10) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }
}
