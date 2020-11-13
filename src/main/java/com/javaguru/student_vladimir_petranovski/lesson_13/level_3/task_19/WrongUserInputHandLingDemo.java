package com.javaguru.student_vladimir_petranovski.lesson_13.level_3.task_19;
/*
Создайте класс WrongUserInputHandlingDemo
и в main() методе этого класса напишите код, который
- запрашивает у пользователя целое число
- если пользователь введёт не число а строку программа должна сообщить
  пользователю о допущенной ошибке и запросить ввести целое число еще раз.
 */

import java.util.Scanner;

class WrongUserInputHandLingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter number");
        try {
            int x = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e);
            System.out.println("Trying one more time");
        }

    }

}
