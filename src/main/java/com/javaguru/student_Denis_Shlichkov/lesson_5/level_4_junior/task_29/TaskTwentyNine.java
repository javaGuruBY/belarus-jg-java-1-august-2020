/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все чётные числа в массиве и выведети их на консоль.
 */
package com.javaguru.student_Denis_Shlichkov.lesson_5.level_4_junior.task_29;

class TaskTwentyNine {
    public static void main(String[] args) {
        int numbersOfArray = (int) (Math.random() * 11);
        System.out.println("Numbers of array " + numbersOfArray);

        int[] newArray = new int[numbersOfArray];

        int minimumElement = 0;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (int) (Math.random() * 101);
            System.out.println("Number [" + i + "] = " + newArray[i]);
        }
//вывод чётных чисел массива
        System.out.println("Чётные числа в массиве:");
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] % 2 == 0) {
                System.out.println(newArray[i]);
            }
        }

    }
}
