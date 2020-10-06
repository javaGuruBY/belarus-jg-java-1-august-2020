package com.javaguru.student_Pavel_Buben.lesson_3.level_1.level_2;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName;
        System.out.println("Input user name: ");
        userName = scan.nextLine();

        String hello = "Hello " + userName + "!";
        System.out.println(hello);
    }
}
