package com.javaguru.student_vladimir_petranovski.lesson_5.level_6.task_36;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilTest {

    @Test
    public void findMaxNumberTestOne() {
        ArrayUtil test = new ArrayUtil();
        int[] actual = {1, 3, 20, -1};
        assertEquals(20, test.findMaxNumber(actual));

    }

    @Test
    public void findMaxNumberTestTwo() {
        ArrayUtil test = new ArrayUtil();
        int[] actual = {-5, 3, 7, -1};
        assertEquals(7, test.findMaxNumber(actual));

    }
}