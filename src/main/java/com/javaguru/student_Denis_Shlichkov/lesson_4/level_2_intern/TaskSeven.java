/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль:
- "Numbers are equals" - если числа равны
- "Numbers are different" - если числа не равны
 */
package com.javaguru.student_Denis_Shlichkov.lesson_4.level_2_intern;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        if(numberOne == numberTwo) {
            System.out.println("Numbers are equals");
        }
        else {
            System.out.println("Numbers are different");
        }
    }
}
