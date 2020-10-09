package com.javaguru.student_vladimir_petranovski.lesson_6.level_4.task_14;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilTest {

    @Test
    public void sortArrayAscendingTest() {
        ArrayUtil test = new ArrayUtil();
        int[] arr = {1, 4, 10, -1, 5, 20};
        int[] expected = {-1, 1, 4, 5, 10, 20};
        test.sortArrayAscending(arr);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(expected[i], arr[i]);
        }
    }

    @Test
    public void sortArrayDescendingTest() {
        ArrayUtil test = new ArrayUtil();
        int[] arr = {1, 4, 10, -1, 5, 20};
        int[] expected = {20, 10, 5, 4, 1, -1};
        test.sortArrayDescending(arr);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(expected[i], arr[i]);
        }
    }
}