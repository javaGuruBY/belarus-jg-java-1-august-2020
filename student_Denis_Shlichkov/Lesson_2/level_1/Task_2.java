package Lesson_2.level_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a first number: ");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.print("Input a second number: ");
        double secondDoubleNumber = scanner.nextDouble();
        System.out.println("Сумма: " + (firstDoubleNumber + secondDoubleNumber));
        System.out.println("Разность: " + (firstDoubleNumber - secondDoubleNumber));
        System.out.println("Произведение: " + (firstDoubleNumber * secondDoubleNumber));
        System.out.println("Частное: " + (firstDoubleNumber / secondDoubleNumber));
    }
}
