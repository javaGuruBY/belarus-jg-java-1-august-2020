package com.javaguru.student_vladimir_petranovski.lesson_7.level_6.task_10;

class PowerCalculatorTest {
    private PowerCalculator powerCalculator = new PowerCalculator();

    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.raiseNumberToPowerTestOne();
        test.raiseNumberToPowerTestTwo();
        test.raiseNumberToPowerTestThree();
    }

    void raiseNumberToPowerTestOne() {
        double expected = 4.0;
        double actual = powerCalculator.raiseNumberToPower(2.0, 2.0);
        checkResult(expected == actual, "raiseNumberToPowerTestOne");
    }

    void raiseNumberToPowerTestTwo() {
        double expected = 243.0;
        double actual = powerCalculator.raiseNumberToPower(3, 5);
        checkResult(expected == actual, "raiseNumberToPowerTestTwo");
    }

    void raiseNumberToPowerTestThree() {
        double expected = 389.017;
        double actual = powerCalculator.raiseNumberToPower(7.3, 3.0);
        checkResult(expected == actual, "raiseNumberToPowerTestThree");
    }

    void checkResult(boolean condition, String testName) {
        if(condition) {
            System.out.println(testName + " = SUCCESS");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }
}
