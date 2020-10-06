/*
Write a program that accepts three numbers from the user and prints:
- "increasing" if the numbers are in increasing order,
- "decreasing" if the numbers are in decreasing order,
- "Neither increasing or decreasing order" otherwise.
 */
package com.javaguru.student_Denis_Shlichkov.lesson_4.level_3_junior;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        if (numberOne < numberTwo && numberTwo < numberThree) {
            System.out.println("increasing");
        }
        else if (numberOne > numberTwo && numberTwo > numberThree) {
            System.out.println("decreasing");
        }
        else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
