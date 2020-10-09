package com.javaguru.student_vladimir_petranovski.lesson_6.level_3.task_10;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilTest {

    @Test
    public void countWhetherNumberTestOne() {
        ArrayUtil test = new ArrayUtil();
        int[] arr = {2, 1, 7, 9, 10, 2};
        assertEquals(2, test.countWhetherNumber(arr,2));
    }

    @Test
    public void countWhetherNumberTestTwo() {
        ArrayUtil test = new ArrayUtil();
        int[] arr = {2, 1, 7, 9, 10, 2, 1, 1};
        assertEquals(3, test.countWhetherNumber(arr,1));
    }
}