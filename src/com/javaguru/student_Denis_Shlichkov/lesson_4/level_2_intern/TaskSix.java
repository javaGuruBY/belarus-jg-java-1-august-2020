/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наименьшее из них.
 */
package lesson_4.level_2_intern;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        if(numberOne < numberTwo) System.out.println(numberOne);
        else if (numberTwo < numberOne) System.out.println(numberTwo);
        else System.out.println("Numbers are equals");
    }
}
