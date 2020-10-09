package com.javaguru.student_vladimir_petranovski.lesson_6.level_3.task_13;

import org.junit.Test;

import static org.junit.Assert.*;

class ArrayUtilTest {

    @Test
    public void coupArrayTestOne() {
        ArrayUtil test = new ArrayUtil();
        int[] arr = {9, 3, 6, 10, 11};
        int[] expected = {11, 10, 6, 3, 9};
        test.coupArray(arr);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(expected[i], arr[i]);
        }
    }

    @Test
    public void coupArrayTestTwo() {
        ArrayUtil test = new ArrayUtil();
        int[] arr = {-1, 3, 7, -3, 10, 25};
        int[] expected = {25, 10, -3, 7, 3, -1};
        test.coupArray(arr);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(expected[i], arr[i]);
        }
    }
}