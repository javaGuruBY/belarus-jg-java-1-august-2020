/*
Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.

PS: перед решением этой задачи распишите на бумаге
или в коментарии все возможные варианты (комбинации).
Это поможет вам правильно написать программу!
Нельзя пользоваться классом Math.
 */
package com.javaguru.student_Denis_Shlichkov.lesson_4.level_3_junior;

import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        if (numberOne >= numberTwo && numberOne >= numberThree) {
            System.out.println(numberOne);
        }
        else if (numberTwo >= numberOne && numberTwo >= numberThree) {
            System.out.println(numberTwo);
        }
        else if(numberThree > numberOne) {
            System.out.println(numberThree);
        }
    }
}
