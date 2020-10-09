package com.javaguru.student_vladimir_petranovski.lesson_6.level_4.task_18;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoDimensionalArrayTest {

    @Test
    public void sumAllNumbersArrayTest() {
        TwoDimensionalArray test = new TwoDimensionalArray();
        int[][] arr = {{1, 3}, {4, 5}, {-1, 9}};
        int expected = 21;
        int actual = test.sumAllNumbersArray(arr);
        assertEquals(expected, actual);
    }
}