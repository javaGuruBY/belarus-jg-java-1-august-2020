package com.javaguru.student_vadim_migun.lesson_6.level_3_junior.Task_13;

import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.flipTest1();
        test.flipTest2();
    }

    ArrayUtil numbers = new ArrayUtil();

    void flipTest1() {
        int[] actual = {1, 2, 3, 4, 5, 6};
        int[] expected = {6, 5, 4, 3, 2, 1};
        numbers.flipArray(actual);

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

        if (Arrays.equals(actual, expected)) {
            System.out.println("SortTest1 - SUCCESS");
        } else {
            System.out.println("SortTest1 - FAIL");
        }
        System.out.println();
    }

    void flipTest2() {
        int[] actual = {-1, 2, 0, 4, 7, 4, 10};
        int[] expected = {10, 4, 7, 4, 0, 2, -1};
        numbers.flipArray(actual);

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

        if (Arrays.equals(actual, expected)) {
            System.out.println("SortTest2 - SUCCESS");
        } else {
            System.out.println("SortTest2 - FAIL");
        }
        System.out.println();
    }

}
