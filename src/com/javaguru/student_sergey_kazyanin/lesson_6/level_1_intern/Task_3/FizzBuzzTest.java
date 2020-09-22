package com.javaguru.student_sergey_kazyanin.lesson_6.level_1_intern.Task_3;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.shouldFizzBuzz();
        test.shouldFizz();
        test.shouldBuzz();
        test.shouldInitialNumber();

    }

    public void shouldFizzBuzz() {
        int number = 30;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(number);
        String expectedResult = "FizzBuzz";
        printResult(actualResult, expectedResult, "shouldFizzBuzz");
    }

    public void shouldBuzz() {
        int number = 10;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(number);
        String expectedResult = "Buzz";
        printResult(actualResult, expectedResult, "shouldBuzz");
    }

    public void shouldFizz() {
        int number = 9;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(number);
        String expectedResult = "Fizz";
        printResult(actualResult, expectedResult, "shouldFizz");
    }

    public void shouldInitialNumber() {
        int number = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(number);
        String expectedResult = Integer.toString(number);
        printResult(actualResult, expectedResult, "shouldInitialNumber");
    }

    public void printResult(String actualResult, String expectedResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " test = PASSED");
        } else {
            System.out.println(testName + " test = FAILURE!!! actualResult = " + actualResult + " | expectedResult = " + expectedResult);
        }
    }
}
