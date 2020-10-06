package com.javaguru.student_vladimir_petranovski.lesson_4.level_7.super_task_1;

class FizzBuzzTest {
    public void detectTest1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if ((fizzBuzz.detect(9)).equals("Fizz")) {
            System.out.println("Число делиться на три и метод detect вернет Fizz -- passed");
        } else {
            System.out.println("Число делится на три и метод detect вернет Fizz -- FAIL");
        }
    }
    public void detectTest2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if ((fizzBuzz.detect(10)).equals("Buzz")) {
            System.out.println("Число делиться на три и метод detect вернет Buzz -- passed");
        } else {
            System.out.println("Число делится на три и метод detect вернет Buzz -- FAIL");
        }
    }
    public void detectTest3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if ((fizzBuzz.detect(15)).equals("FizzBuzz")) {
            System.out.println("Число делиться на три и метод detect вернет FizzBuzz -- passed");
        } else {
            System.out.println("Число делится на три и метод detect вернет FizzBuzz -- FAIL");
        }
    }
    public void detectTest4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if ((fizzBuzz.detect(23)).equals("23")) {
            System.out.println("Число не делиться на три и на пять, метод detect вернет number -- passed");
        } else {
            System.out.println("Число не делится на три и на пять, метод detect вернет number -- FAIL");
        }
    }

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.detectTest1();
        fizzBuzzTest.detectTest2();
        fizzBuzzTest.detectTest3();
        fizzBuzzTest.detectTest4();
    }




}
