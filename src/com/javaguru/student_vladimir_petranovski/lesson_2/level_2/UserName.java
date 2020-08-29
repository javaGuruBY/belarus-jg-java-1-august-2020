package com.javaguru.student_vladimir_petranovski.lesson_2.level_2;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        System.out.println("Введите имя пользователя");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("Hello " + userName);
    }
}
