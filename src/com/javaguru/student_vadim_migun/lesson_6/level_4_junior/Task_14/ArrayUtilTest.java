package com.javaguru.student_vadim_migun.lesson_6.level_4_junior.Task_14;

import java.util.Arrays;

public class ArrayUtilTest {
    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.sortArrayIncreaseTest();
        test.sortArrayDecreaseTest();

    }

    ArrayUtil numbers = new ArrayUtil();

    void sortArrayIncreaseTest() {
        int[] actual = {1, 5, 2, 4, 3, 8, 7, 6};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        numbers.sortArrayIncrease(actual);   //      Arrays.sort(actual);

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

        if (Arrays.equals(actual, expected)) {
            System.out.println("IncreaseTest - SUCCESS");
        } else {
            System.out.println("IncreaseTest - FAIL");
        }
        System.out.println();
    }

    void sortArrayDecreaseTest() {
        int[] actual = {-2, 5, 2, 4, 3, 8, 7, 6};
        int[] expected = {8, 7, 6, 5, 4, 3, 2, -2};
        numbers.sortArrayDecrease(actual);

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

        if (Arrays.equals(actual, expected)) {
            System.out.println("DecreaseTest - SUCCESS");
        } else {
            System.out.println("DecreaseTest - FAIL");
        }
        System.out.println();
    }

}
