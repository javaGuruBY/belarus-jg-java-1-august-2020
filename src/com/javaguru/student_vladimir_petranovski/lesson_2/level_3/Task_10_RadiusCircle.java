package com.javaguru.student_vladimir_petranovski.level_2.level_3;

import java.util.Locale;
import java.util.Scanner;

public class Task_10_RadiusCircle {
    public static void main(String[] args) {
        System.out.println("Введите радиус круга (double):");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double radius = sc.nextDouble();
        final double PI = 3.1415;
        System.out.println("Test Data:");
        System.out.println("Radius = " + radius);
        System.out.println("Expected Output");
        System.out.println("Perimeter is = " + 2 * PI * radius);
        System.out.println("Area is = " + PI * Math.pow(radius, 2));
    }
}
