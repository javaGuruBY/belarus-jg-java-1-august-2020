/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль
положительное оно, отрицательное или равно нулю.
 */
package com.javaguru.student_Denis_Shlichkov.lesson_4.level_1_intern;

import java.util.Scanner;
//поскольку задача 1 была решена сразу под все условия, то здесь воспроизводится она же
public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("The number less than zero");
        }
        else if (number > 0) {
            System.out.println("The number greater than zero");
        }
        else {
            System.out.println("The number is zero");
        }
    }
}
