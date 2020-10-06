package com.javaguru.student_vadim_migun.lesson_5.level_5_6_middle;
/*
Создайте класс ArrayUtilTest.
В этом классе напишите автоматический тест
метода int[] createArray(int arrayLength)
из предыдущего задания.

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        // Write test implementation here !!!
    }

}
 */

import java.util.Arrays;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.printArrayToConsoleTest();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();


    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] expected = new int[5];
        int[] actual = arrayUtil.createArray(5);
        System.out.println("Массивы одинаковой длины:");
        if (expected.length == actual.length) {
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - Fail");
        }
        System.out.println();

        int[] expectedTwo = new int[6];
        int[] actualTwo = arrayUtil.createArray(5);
        System.out.println("Массивы разной длины:");
        if (expectedTwo.length != actualTwo.length) {
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - Fail");
        }
        System.out.println();
    }
    /*
    В классе ArrayUtilTest напишите автоматический тест
    метода void fillArrayWithRandomNumbers(int[] array)
    из предыдущего задания.
     */
    public void shouldFillArrayWithRandomNumbers() {  // тест на сравнение длин массивов (но числа в них разные)
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] expected = new int[6];   // произвольный массив
        int[] actual = arrayUtil.createArray(4);  // массив вызываемый из метода

        for (int i = 0; i < expected.length; i++) {   // заполняем произвольный массив случайными числами
            expected[i] = (int) (Math.random() * 50);
        }
        arrayUtil.fillArrayWithRandomNumbers(actual);

        if (expected.length == actual.length) {
            System.out.println("Test - OK (массивы одинаковой длины)");
            System.out.println(Arrays.toString(expected));
            System.out.println(Arrays.toString(actual));
        } else {
            System.out.println("Test - Fail (массивы разной длины)");
            System.out.println(Arrays.toString(expected));
            System.out.println(Arrays.toString(actual));
        }
        System.out.println();
    }

    public void printArrayToConsoleTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] array = arrayUtil.createArray(3);
        arrayUtil.printArrayToConsole(array);
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    /*
    В классе ArrayUtilTest напишите автоматический тест
    для метода int findMaxNumber(int[] array)
    из предыдущего задания.

    */

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayNew = new int [7];
        arrayUtil.fillArrayWithRandomNumbers(arrayNew);
        System.out.println(Arrays.toString(arrayNew));
        int maxNumberTest = arrayNew[0];
        for (int i = 0; i < arrayNew.length; i++) {
            if (maxNumberTest > arrayNew[i]) {
                maxNumberTest = arrayNew[i];
            }
        }
        System.out.println(maxNumberTest);

            int maxNumber = arrayUtil.findMaxNumber(arrayNew);
        System.out.println(maxNumber);
            System.out.println("Max number test:");
            if (maxNumber == maxNumberTest) {
                System.out.println("Test - OK");
            } else {
                System.out.println("Test - FAIL");
            }
        System.out.println();
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] arrayNew = new int [7];
        arrayUtil.fillArrayWithRandomNumbers(arrayNew);
        System.out.println(Arrays.toString(arrayNew));
        int minNumberTest = arrayNew[0];
        for (int i = 0; i < arrayNew.length; i++) {
            if (minNumberTest < arrayNew[i]) {
                minNumberTest = arrayNew[i];
            }
        }
        System.out.println(minNumberTest);

        int minNumber = arrayUtil.findMinNumber(arrayNew);
        System.out.println(minNumber);
        System.out.println("Min number test:");
        if (minNumber == minNumberTest) {
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }


}
