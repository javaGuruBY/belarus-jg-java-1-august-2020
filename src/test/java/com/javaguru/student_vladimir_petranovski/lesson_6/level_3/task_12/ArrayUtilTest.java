package com.javaguru.student_vladimir_petranovski.lesson_6.level_3.task_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilTest {

    @Test
    public void replaceAllTestOne() {
        ArrayUtil test = new ArrayUtil();
        int[] arr = {1, 2, 3, 4, 5, 2, 7, 2};
        int[] expected = {1, 10, 3, 4, 5, 10, 7, 10};
        test.replaceAll(arr, 2, 10);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(expected[i],arr[i]);
        }
    }

    @Test
    public void replaceAllTestTwo() {
        ArrayUtil test = new ArrayUtil();
        int[] arr = {1, 2, 3, 4, 5, 2, 7, 2, 3};
        int[] expected = {1, 2, -3, 4, 5, 2, 7, 2, -3};
        test.replaceAll(arr, 3, -3);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(expected[i],arr[i]);
        }
    }
}