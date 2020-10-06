package com.javaguru.student_vladimir_petranovski.lesson_4.level_3.task_9;
/*
Write a program that accepts three numbers from the user and prints:
- "increasing" if the numbers are in increasing order,
- "decreasing" if the numbers are in decreasing order,
- "Neither increasing or decreasing order" otherwise.
 */

import java.util.Scanner;

public class TaskNineIncreaseOrDecrease {
    public static void main(String[] args) {
        TaskNineIncreaseOrDecrease taskNineIncreaseOrDecrease = new TaskNineIncreaseOrDecrease();
        System.out.println("Please enter an integer");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();
        taskNineIncreaseOrDecrease.increasingDecreasingOrder(firstNumber, secondNumber, thirdNumber);
    }
    public void increasingDecreasingOrder(int firstNumber, int secondNumber, int thirdNumber) {
        if(firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("increasing");
        }else if(firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }

}
