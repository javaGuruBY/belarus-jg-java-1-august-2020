package com.javaguru.student_vladimir_petranovski.lesson_5.level_6.task_38;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilTest {

    @Test
    public void findMinNumber() {
        ArrayUtil test = new ArrayUtil();
        int[] actual = {1, 3, 20, -1};
        assertEquals(-1, test.findMinNumber(actual));

    }

    @Test
    public void findMaxNumberTestTwo() {
        ArrayUtil test = new ArrayUtil();
        int[] actual = {-5, 3, 7, -1};
        assertEquals(-5, test.findMinNumber(actual));

    }
}