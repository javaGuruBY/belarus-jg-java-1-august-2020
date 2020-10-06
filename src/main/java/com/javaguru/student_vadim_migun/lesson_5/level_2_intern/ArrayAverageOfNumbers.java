package com.javaguru.student_vadim_migun.lesson_5.level_2_intern;

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать среднее значение и вывести его на консоль.

 */

class ArrayAverageOfNumbers {
    public static void main(String[] args) {

        int [] array = new int[3];
          for (int i = 0; i <array.length; i++){
            array [i] = (int) (Math.random()*10);
            System.out.println("Numbers " + i + " = " + array[i]);
        }

        int sum = 0;
        double average = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            average = average + array[i];
        }
        average = average / array.length;

        System.out.println("Сумма всех ячеек массива = " + sum);
        System.out.println("Average = " + average);

    }
}
