package com.javaguru.student_vadim_migun.lesson_7.level_6_middle;

public class PowerCalculatorTest {

    public static void main(String[] args) {

        PowerCalculatorTest test = new PowerCalculatorTest();
        test.raiseNumberToPowerTwo();
        test.raiseNumberToPowerThree();
        test.raiseNumberToPowerFour();

    }

    PowerCalculator calculator = new PowerCalculator();

    void raiseNumberToPowerTwo() {
        int expected = 4;
        int actual = calculator.pow(2, 2);
        System.out.println("Число в степени = " + actual);
        if (expected == actual) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAIL");
        }
    }

    void raiseNumberToPowerThree() {
        int expected = 125;
        int actual = calculator.pow(5, 3);
        System.out.println("Число в степени = " + actual);
        if (expected == actual) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAIL");
        }
    }

    void raiseNumberToPowerFour() {
        int expected = 256;
        int actual = calculator.pow(4, 4);
        System.out.println("Число в степени = " + actual);
        if (expected == actual) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAIL");
        }
    }

}
