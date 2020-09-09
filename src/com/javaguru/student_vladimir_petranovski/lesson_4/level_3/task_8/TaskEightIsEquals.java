package com.javaguru.student_vladimir_petranovski.lesson_4.level_3.task_8;
/*
Write a Java program that accepts three numbers and prints:
- "All numbers are equal" if all three numbers are equal,
- "All numbers are different" if all three numbers are different
- "Neither all are equal or different" otherwise.
 */

public class TaskEightIsEquals {
    public static void main(String[] args) {
        int firstNumber = 3;
        int secondNumber = 2;
        int thirdNumber = 3;
        if(firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if(firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
