package com.javaguru.student_vladimir_petranovski.lesson_4.level_3.task_10;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них
PS: перед решением этой задачи распишите на бумаге
или в коментарии все возможные варианты (комбинации).
Это поможет вам правильно написать программу!
Нельзя пользоваться классом Math.
 */
public class TaskTenMaxThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter three an integer");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();
        if(firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("Max number - " + firstNumber);
        } else if(secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println("Max number - " + secondNumber);
        } else {
            System.out.println("Max number - " + thirdNumber);
        }
    }

}
