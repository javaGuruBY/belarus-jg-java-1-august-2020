package com.javaguru.student_vadim_migun.lesson_4.level_2_intern;

/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль:
- "Numbers are equals" - если числа равны
- "Numbers are different" - если числа не равны
 */

import java.util.Scanner;

class EqualsOrDifferent {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = scan.nextInt();

        if (firstNumber == secondNumber){
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }

    }
}
