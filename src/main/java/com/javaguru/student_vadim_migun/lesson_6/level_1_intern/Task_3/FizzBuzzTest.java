package com.javaguru.student_vadim_migun.lesson_6.level_1_intern.Task_3;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.detectFizzBuzz();
        test.detectFizz();
        test.detectBuzz();
        test.detectNumber();

    }

    FizzBuzz number = new FizzBuzz();

    void detectFizzBuzz() {
        String expected = "FizzBuzz";
        String actual = number.detect(15);
        if (expected.equals(actual)) {
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

    void detectFizz() {
        String expected = "Fizz";
        String actual = number.detect(12);
        if (expected.equals(actual)) {
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

    void detectBuzz() {
        String expected = "Buzz";
        String actual = number.detect(10);
        if (expected.equals(actual)) {
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

    void detectNumber() {
        String expected = "" + 11;
        String actual = number.detect(11);
        if (expected.equals(actual)) {
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

}


