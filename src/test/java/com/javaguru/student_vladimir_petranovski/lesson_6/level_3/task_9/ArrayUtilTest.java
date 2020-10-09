package com.javaguru.student_vladimir_petranovski.lesson_6.level_3.task_9;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilTest {


    @Test
    public void isWhetherAnArraySpecifiedNumberTestTrue() {
        ArrayUtil test = new ArrayUtil();
        int number = 2;
        assertEquals(true, test.isWhetherAnArraySpecifiedNumber(10, 2));
    }

    @Test
    public void isWhetherAnArraySpecifiedNumberTestFalse() {
        ArrayUtil test = new ArrayUtil();
        int number = 11;
        assertEquals(false, test.isWhetherAnArraySpecifiedNumber(10, 11));
    }
}