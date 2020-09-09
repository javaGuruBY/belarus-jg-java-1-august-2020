package com.javaguru.student_vladimir_petranovski.lesson_4.level_1.task_3;

import java.util.Scanner;

public class TaskThreeSwitchWeek {
    public static void main(String[] args) {
        System.out.println("Please enter an integer from 1 to 7:");
        Scanner sc = new Scanner(System.in);
        int numberDay = sc.nextInt();
        switch(numberDay) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No such day exist!");
        }

    }
}
