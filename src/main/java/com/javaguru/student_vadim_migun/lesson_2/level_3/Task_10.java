package com.javaguru.student_vadim_migun.lesson_2.level_3;

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


import java.awt.geom.PathIterator;
import java.util.Scanner;

import static java.lang.Math.PI;

class Task_10 {

    public static void main (String [] args){

        System.out.println("Input radius circle: ");

        Scanner scan = new Scanner(System.in);

        double radius = scan.nextDouble();

        System.out.println("Radius circle = " + radius);


        double perimeter = 2 * PI * radius;
        System.out.println("Perimeter = " + perimeter);

        double area = PI * radius * radius;
        System.out.println("Area circle = " + area);



    }

}
