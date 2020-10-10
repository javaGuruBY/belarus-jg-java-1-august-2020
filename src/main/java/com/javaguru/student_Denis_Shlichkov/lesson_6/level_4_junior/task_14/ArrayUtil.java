package lesson_6.level_4_junior.task_14;

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
            for (int j : array) {
                System.out.println(j);
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
            for (int j : array) {
                if (findNumber == j) {
                    numberOfNumbers++;
                }
            }
            return numberOfNumbers;
        }

        void replace(int[] arr, int numberToReplace, int newNumber) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == numberToReplace) {
                    arr[i] = newNumber;
                    break;
                }
            }
        }

        void replaceAll(int[] arr, int numberToReplace, int newNumber) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == numberToReplace) {
                    arr[i] = newNumber;
                }
            }
        }

        void arrayReverse(int[] arr) {
            int temp;
            for (int i = 0; i < arr.length/2; i++) {
                temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
        }

        void arraySort(int[] arr) {
            int temp;
            for (int i = arr.length - 1; i >= 1; i--) {
                for (int j = 0; j < i; j++) {
                    if(arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
}

