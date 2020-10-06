package com.javaguru.student_sergey_kazyanin.lesson_2.level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = scan.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
