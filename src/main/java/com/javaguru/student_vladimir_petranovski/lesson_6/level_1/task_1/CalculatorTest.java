package com.javaguru.student_vladimir_petranovski.lesson_6.level_1.task_1;

class CalculatorTest {
    public static void main(String[] args) {
        isEventTrue();
        isEventFalse();
    }

    private static Calculator calculator = new Calculator();

    public static void isEventTrue() {
        boolean expected = true;
        boolean actual = calculator.isEven(2);
        checkResult(expected == actual, "Test isEventTrue");
    }

    public static void isEventFalse() {
        boolean expected = false;
        boolean actual = calculator.isEven(5);
        checkResult(expected == actual, "Test isEventFalse");
    }

    public static void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = SUCCESS");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }
}
