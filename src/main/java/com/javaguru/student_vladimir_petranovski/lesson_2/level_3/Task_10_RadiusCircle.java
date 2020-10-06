package com.javaguru.student_vladimir_petranovski.lesson_2.level_3;

import java.util.Locale; //Зачем он здесь нужен?
import java.util.Scanner;

public class Task_10_RadiusCircle {
    public static void main(String[] args) {
        System.out.println("Введите радиус круга (double):");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); //Не вижу смысле использовать этот Класс и его метод
        double radius = sc.nextDouble();
        final double PI = 3.1415; // Лучше использовать готовый класс и его переменную import static java.lang.Math.PI
        System.out.println("Test Data:");
        System.out.println("Radius = " + radius);
        System.out.println("Expected Output");
        System.out.println("Perimeter is = " + 2 * PI * radius);
        System.out.println("Area is = " + PI * Math.pow(radius, 2));
    }
}
