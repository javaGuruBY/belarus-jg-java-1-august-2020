package com.javaguru.student_vadim_migun.lesson_4.level_3_junior;
/*
Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.

PS: перед решением этой задачи распишите на бумаге
или в коментарии все возможные варианты (комбинации).
Это поможет вам правильно написать программу!
Нельзя пользоваться классом Math.
 */
// 3, 2, 1
// 1, 3, 2
// 1, 2, 3

import java.util.Scanner;

class MaxFromThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber;
        secondNumber = scan.nextInt();
        System.out.println("Please enter third number: ");
        int thirdNumber = scan.nextInt();

        if (firstNumber>secondNumber && firstNumber>thirdNumber) {
            System.out.println("Largest number is " + firstNumber);
        } else if (secondNumber>firstNumber && secondNumber>thirdNumber){
            System.out.println("Largest number is " + secondNumber);
        } else {
            System.out.println("Largest number is " + thirdNumber);
        }

    }
}
