/*
Write a program that accepts three numbers from the user and prints:
- "increasing" if the numbers are in increasing order,
- "decreasing" if the numbers are in decreasing order,
- "Neither increasing or decreasing order" otherwise.
 */
package com.javaguru.student_sergey_kazyanin.lesson_4.level_3_junior.Task_9;

import java.util.Scanner;

class NumberOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers through space:");
        String string = sc.nextLine();

        Scanner readNum = new Scanner(string);
        int firstNum = readNum.nextInt();
        int secondNum = readNum.nextInt();
        int thirdNum = readNum.nextInt();
        System.out.println();
        if (firstNum < secondNum && secondNum < thirdNum) {
            System.out.println("increasing");
        } else if (firstNum > secondNum && secondNum > thirdNum) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
//        System.out.println();
//        System.out.println(firstNum + " " + secondNum + " " + thirdNum);
    }
}
