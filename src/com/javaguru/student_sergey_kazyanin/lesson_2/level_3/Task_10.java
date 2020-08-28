package com.javaguru.student_sergey_kazyanin.lesson_2.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Radius - ");

        double radius = scan.nextDouble();
        System.out.println("Perimetr is = " + (2*3.1415*radius));
        System.out.println("Area is = " + (3.1415*radius*radius));
    }
}
