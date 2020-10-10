package com.javaguru.student_vladimir_petranovski.lesson_7.level_6.task_13;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CopyTest {
    private Copy test;
    @Before
    public void setUp() {
        test = new Copy();
    }

    @Test
    public void copyArrayInAnotherArrayTest() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {2, 3, 4, 5, 6};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], test.copyArrayInAnotherArray(arr, 1, 6)[i]);
        }
    }

    @Test
    public void findLengthFinishArrayTest() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(5, test.findLengthFinishArray(arr, 1, 6));
    }

    @Test
    public void findFinishArrayTest() {
        int[] arr = {1, -34, 3, -3, 5, -6, 7};
        int[] expected = {3, 5};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], test.findFinishArray(arr, 1, 6)[i]);
        }
    }
}