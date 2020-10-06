/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль чётное оно или нет.

Подсказка: используйте для определения чётное число или нет
операцию остаток от деления (%). Если остаток от деления на 2
равен нулю то число чётное, иначе не чётное.
 */
package com.javaguru.student_sergey_kazyanin.lesson_4.level_1_intern.Task_4;

import java.util.Scanner;

class OddOrEvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = scan.nextInt();
        if((number%2) == 0) {
            System.out.println("Вы ввели ЧЕТНОЕ число");
        } else {
            System.out.println("Вы ввели НЕЧЕТНОЕ число");
        }
    }
}
