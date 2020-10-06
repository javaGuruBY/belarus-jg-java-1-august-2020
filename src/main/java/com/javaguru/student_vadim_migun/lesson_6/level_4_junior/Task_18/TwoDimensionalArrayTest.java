package com.javaguru.student_vadim_migun.lesson_6.level_4_junior.Task_18;

import java.util.Arrays;

class TwoDimensionalArrayTest {

    public static void main(String[] args) {

        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        test.randomNumbersOutput();
        test.sumAllNumbersArrayTest1();
        test.sumAllNumbersArrayTest2();

    }

    TwoDimensionalArray arr = new TwoDimensionalArray();

    public void randomNumbersOutput() {
        int[][] actual = arr.randomNumbers();
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual.length; j++) {
                System.out.print(actual[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }



    public void sumAllNumbersArrayTest1() {
        int [][] twoArray = {{1, 2, 3}, {4, 5, 6}};
        int expectedSum = 21;
        int actualSum = arr.sumAllNumbersArray(twoArray);
        if (actualSum == expectedSum) {
            System.out.println("sumAllNumbersArrayTest1 - SUCCESS");
        } else {
            System.out.println("sumAllNumbersArrayTest1 - FAIL");
        }
        System.out.println();
    }

    public void sumAllNumbersArrayTest2() {
        int [][] twoArray = {{4, 2, 1}, {1, 5, 6}};
        int expectedSum = 19;
        int actualSum = arr.sumAllNumbersArray(twoArray);
        if (actualSum == expectedSum) {
            System.out.println("sumAllNumbersArrayTest2 - SUCCESS");
        } else {
            System.out.println("sumAllNumbersArrayTest2 - FAIL");
        }
        System.out.println();
    }

}
