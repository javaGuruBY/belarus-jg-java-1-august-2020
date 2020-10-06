/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.
 */
package com.javaguru.student_Denis_Shlichkov.lesson_5.level_4_junior.task_28;

class TaskTwentyEight {
    public static void main(String[] args) {
        int numbersOfArray = (int) (Math.random() * 11);
        System.out.println("Numbers of array " + numbersOfArray);

        int[] newArray = new int[numbersOfArray];

        int minimumElement = 0;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (int) (Math.random() * 101);
            System.out.println("Number [" + i + "] = " + newArray[i]);
            if (i == 0) {
                minimumElement = newArray[0];
            } else if (newArray[i] < minimumElement) {
                    minimumElement = newArray[i];
            }
        }

        System.out.println("Minimum element of array is " + minimumElement);
    }
}
