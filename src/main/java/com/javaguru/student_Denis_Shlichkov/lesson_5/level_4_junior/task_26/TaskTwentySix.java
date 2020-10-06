/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.
 */
package com.javaguru.student_Denis_Shlichkov.lesson_5.level_4_junior.task_26;

import java.util.Scanner;

class TaskTwentySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersOfArray;
        System.out.println("Insert numbers of array");
        numbersOfArray = scanner.nextInt();

        int [] newArray = new int[numbersOfArray];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (int) (Math.random() * 101);
            System.out.println(new StringBuilder().append("Number [").append(i).append("] = ").append(newArray[i]).toString());
        }
/*
        for (int j : newArray) {
            System.out.println(j);
        }*/
    }
}
