package com.javaguru.student_Denis_Shlichkov.Lesson_2.level_3;

import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователя
радиус круга (вещественное число) и печатает на консоль
периметр и площадь круга.

Test Data:
Radius = 7.5

Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */
public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a radius: ");
        double circleRadius = scanner.nextDouble();
        System.out.println("Perimeter is = " + (2 * Math.PI * circleRadius));
        System.out.println("Area is = " + (Math.PI * circleRadius * circleRadius));

    }
}
