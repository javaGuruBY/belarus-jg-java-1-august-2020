package com.javaguru.student_Pavel_Buben.lesson_4.level_1;

import java.util.Scanner;

class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        if (number == 0){
            System.out.println("Вы ввели ноль");
        }
        else if (number % 2 == 0) {
            System.out.println("Введено четное число");
        } else {
            System.out.println("Введено не четное число");
        }
    }
}