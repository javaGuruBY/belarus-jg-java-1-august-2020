package com.javaguru.student_vadim_migun.lesson_5.level_4_junior;
/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.
 */

class LargestNumber {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println("Numbers " + i + " = " + array[i]);
        }
        System.out.println();

        int maxNumber = array[0];
        for (int j = 1; j < array.length; j++) {
            maxNumber = Math.max(maxNumber, array[j]);
        }
            System.out.println("Максимальное число массива = " + maxNumber);

    }
}



/*
 int[] age = {2, 6, 16, 54};
  int max = age[0];
  for (int i = 1; i < age.length; i++) max = Math.max(max, age[i]);
*/
