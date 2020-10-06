package com.javaguru.student_Pavel_Buben.lesson_4.level_1;

import java.util.Scanner;

class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number == 0){
                System.out.println("Вы ввели ноль");
            }
            else if (number > 0) {
                System.out.println("Число положительное");

            } else {
                System.out.println("Число отрицательное");
            }
        } else {
            System.out.println("Вы ввели не число");
        }
    }
}

