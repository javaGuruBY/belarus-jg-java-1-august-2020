package com.javaguru.student_Pavel_Buben.lesson_4.level_1;

import java.util.Scanner;

class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");
        if (scanner.hasNextInt()) {

            int number = scanner.nextInt();
            if (number > 0 && number < 8) {
                switch (number) {
                    case 1:
                        System.out.println("Понедельник");
                        break;
                    case 2:
                        System.out.println("Вторник");
                        break;
                    case 3:
                        System.out.println("Среда");
                        break;
                    case 4:
                        System.out.println("Четверг");
                        break;
                    case 5:
                        System.out.println("Пятница");
                        break;
                    case 6:
                        System.out.println("Суббота");
                        break;
                    case 7:
                        System.out.println("Воскресенье");
                        break;
                    default:
                        System.out.println("Ввели не то число");
                }
            } else {
                System.out.println("Вы вввели не то число");
            }
        }
        else System.out.println("Вы ввели не число");
    }
}
