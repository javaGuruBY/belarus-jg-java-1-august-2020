package com.javaguru.student_vladimir_petranovski.lesson_6.level_1.task_3;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.detectDivideByThreeAndFive();
        fizzBuzzTest.detectDivideByThree();
        fizzBuzzTest.detectDivideByFive();
        fizzBuzzTest.detectDivideByNotDivideByThreeAndFive();
    }

    FizzBuzz fizzBuzz = new FizzBuzz();

    public void detectDivideByThreeAndFive() {
        String expected = "FizzBuzz";
        String actual = fizzBuzz.detect(15);
        checkResult(expected.equals(actual), "Test detectDivideByThreeAndFive");
    }

    public void detectDivideByThree() {
        String expected = "Fizz";
        String actual = fizzBuzz.detect(9);
        checkResult(expected.equals(actual), "Test detectDivideByThree");
    }

    public void detectDivideByFive() {
        String expected = "Buzz";
        String actual = fizzBuzz.detect(10);
        checkResult(expected.equals(actual), "Test detectDivideByFive");
    }

    public void detectDivideByNotDivideByThreeAndFive() {
        String expected = "" + 7;
        String actual = fizzBuzz.detect(7);
        checkResult(expected.equals(actual), "Test detectDivideByNotDivideByThreeAndFive");
    }

    public static void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = SUCCESS");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }
}
