/*
Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.

PS: перед решением этой задачи распишите на бумаге
или в коментарии все возможные варианты (комбинации).
Это поможет вам правильно написать программу!
Нельзя пользоваться классом Math.
 */
package com.javaguru.student_sergey_kazyanin.lesson_4.level_3_junior.Task_10;

import java.util.Scanner;

class MaxOfThreeInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 число: ");
        int firstNum = scanner.nextInt();
        System.out.println("Введите 2 число: ");
        int secondNum = scanner.nextInt();
        System.out.println("Введите 3 число: ");
        int thirdNum = scanner.nextInt();
        System.out.println();

        int tempMax = maxOfTwo(firstNum, secondNum);
        int max = maxOfTwo(tempMax, thirdNum);
        System.out.println("Максимальное число из 3 чисел: " + max);

    }

    static int maxOfTwo(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }
}
