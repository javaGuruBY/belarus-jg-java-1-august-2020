package lesson_6.level_3_junior.task_10;

import java.util.Arrays;

class ArrayUtil {
    int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    int[] fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        return array;
    }

    void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxNumber > array[i]) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minNumber < array[i]) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    boolean findNumberInArray(int[] array, int findNumber) {
        String arrayStr = Arrays.toString(array);
        return arrayStr.contains(String.valueOf(findNumber));
    }

    int findNumberOfNumbers(int[] array, int findNumber) {
        int numberOfNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (findNumber == array[i]) {
                numberOfNumbers++;
            }
        }
        return numberOfNumbers;
    }
}
