package com.javaguru.student_vladimir_petranovski.lesson_6.level_3.task_11;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayUtilTest {

    @Test
    public void replaceTestOne() {
        ArrayUtil test = new ArrayUtil();
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 10, 3, 4, 5};
        test.replace(arr, 2, 10);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(expected[i],arr[i]);
        }
    }

    @Test
    public void replaceTestTwo() {
        ArrayUtil test = new ArrayUtil();
        int[] arr = {1, 2, 3, 4, 5, 3};
        int[] expected = {1, 2, -1, 4, 5, 3};
        test.replace(arr, 3, -1);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(expected[i],arr[i]);
        }
    }
}