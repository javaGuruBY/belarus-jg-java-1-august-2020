package com.javaguru.student_Denis_Shlichkov.lesson_6.level_3_junior.task_9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayUtilTest {

    private ArrayUtil result = new ArrayUtil();

    @Test
    public void findMaxNumber() {
        int actual;
        int[] array = {1, 3, 5, 2, 8, 1, 3};
        actual = result.findMaxNumber(array);
        assertEquals(8, actual);
    }
}