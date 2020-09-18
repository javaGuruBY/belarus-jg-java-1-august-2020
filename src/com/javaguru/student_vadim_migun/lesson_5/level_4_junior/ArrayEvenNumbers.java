package com.javaguru.student_vadim_migun.lesson_5.level_4_junior;
/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все чётные числа в массиве и выведети их на консоль.
 */

class ArrayEvenNumbers {

    public static void main(String[] args) {

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println("Numbers " + i + " = " + array[i]);
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Even number - " + array[i]);

            }
        }
    }
}

/*   For(int=0;i<a.length();i++){
        If(a[i]%2==0)
        System.out.println(a[i]);
        }
*/