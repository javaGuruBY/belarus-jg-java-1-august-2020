package Lesson_2.level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = in.nextInt();
        for (int i = 1; i < 11; i++){
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
