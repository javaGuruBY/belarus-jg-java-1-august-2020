package com.javaguru.student_vladimir_petranovski.lesson_4.level_4.task_13;

public class TaskThirteenEvenOrOddTest {
    public static void main(String[] args) {
    TaskThirteenEvenOrOddTest evenTest = new TaskThirteenEvenOrOddTest();
    evenTest.isEvenTest();
    }
    public void isEvenTest() {
        int number = 9;
        TaskThirteenEvenOrOdd even = new TaskThirteenEvenOrOdd();
        if(number % 2 == 0) {
            System.out.println("EvenTest: Ok");
        } else {
            System.out.println("EvenTest: Fail");
        }

    }
}
