/*
Написать программу, которая запрашивает у
пользователя
целое число и выводит на консоль
положительное оно или отрицательное.
 */
package lesson_4.level_1_intern;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("The number less than zero");
        }
        else if (number > 0) {
            System.out.println("The number greater than zero");
        }
        else System.out.println("The number is zero");
    }
}
