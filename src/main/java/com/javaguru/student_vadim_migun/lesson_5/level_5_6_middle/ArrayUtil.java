package com.javaguru.student_vadim_migun.lesson_5.level_5_6_middle;
/*
Создайте класс ArrayUtil.
Создайте в этом классе метод для создания
массива целых чисел указанной длины.

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        // Write implementation here !!!
    }

}
 */

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {

        int[] array = new int[arrayLength];
        return array;
    }

/*
Создайте в классе ArrayUtil метод для
заполнения массива целых чисел случайными числами.

    public void fillArrayWithRandomNumbers(int[] array) {
        // Write implementation here !!!
    }
 */

    public int[] fillArrayWithRandomNumbers(int [] array) {
        Random randomNumbers = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumbers.nextInt(20);
//            System.out.println("Random numbers (из метода) [" + i + "] = " + array[i]);
        }
        return array;
    }

    /*
    Создайте в классе ArrayUtil метод для
    распечатки массива целых чисел на консоль.

        public void printArrayToConsole(int[] array) {
            // Write implementation here !!!
        }
    */

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "]" + " - " + array[i]);

        }
    }

    /*
    Создайте в классе ArrayUtil метод для
    нахождения максимального числа в массиве целых чисел.

        public int findMaxNumber(int[] array) {
            // Write implementation here !!!
        }
  */

    public int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxNumber > array[i]) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    /*
    Создайте в классе ArrayUtil метод для
    нахождения минимального числа в массиве целых чисел.

        public int findMinNumber(int[] array) {
            // Write implementation here !!!
        }
  */

    public int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minNumber < array[i]) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }

}
