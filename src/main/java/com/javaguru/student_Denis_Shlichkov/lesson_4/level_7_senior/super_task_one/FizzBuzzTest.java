package com.javaguru.student_Denis_Shlichkov.lesson_4.level_7_senior.super_task_one;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.notFizzBuzzTest();
    }

    void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(3).equals("Fizz")) {
            System.out.println("Test Fizz - OK");
        }
        else {
            System.out.println("Test Fizz - FAIL");
        }
    }

    void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(5).equals("Buzz")) {
            System.out.println("Test Buzz - OK");
        }
        else {
            System.out.println("Test Buzz - FAIL");
        }
    }

    void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(15).equals("FizzBuzz")) {
            System.out.println("Test FizzBuzz - OK");
        }
        else {
            System.out.println("Test FizzBuzz - FAIL");
        }
    }

    void notFizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(17).equals(String.valueOf(17))) {
            System.out.println("Test notFizzBuzz - OK");
        }
        else {
            System.out.println("Test notFizzBuzz - FAIL");
        }
    }
}

