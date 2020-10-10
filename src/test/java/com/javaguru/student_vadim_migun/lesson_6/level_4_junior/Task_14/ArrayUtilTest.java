package com.javaguru.student_vadim_migun.lesson_6.level_4_junior.Task_14;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayUtilTest {

    @Test

    public void sortArrayIncreaseTest() {
        ArrayUtil test = new ArrayUtil();
        int[] actual = {1, -2, 3, 4, 2, 5};
        int[] expected = {-2, 1, 2, 3, 4, 5};
        test.sortArrayIncrease(actual);
        for (int i = 0; i < actual.length; i++) {
            assertArrayEquals(expected,actual);
            System.out.println(Arrays.toString(actual));
        }
    }

    @Test

    public void sortArrayDecreaseTest() {
        ArrayUtil test = new ArrayUtil();
        int[] actual = {1, -2, 3, 4, 2, 5};
        int[] expected = {5, 4, 3, 2, 1, -2};
        test.sortArrayDecrease(actual);
        for (int i = 0; i < actual.length; i++) {
            assertArrayEquals(expected,actual);
            System.out.println(Arrays.toString(actual));
        }
    }

}