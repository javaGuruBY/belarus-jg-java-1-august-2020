package com.javaguru.student_sergey_kazyanin.lesson_2.level_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Input first number - ");
        int firstNumber = scan.nextInt();
        System.out.print("Input second number - ");
        int secondNumber = scan.nextInt();
        System.out.print("Input third number - ");
        int thirdNumber = scan.nextInt();

        System.out.print("Result - ");
        System.out.println((firstNumber+secondNumber+thirdNumber)/3);

    }
}
