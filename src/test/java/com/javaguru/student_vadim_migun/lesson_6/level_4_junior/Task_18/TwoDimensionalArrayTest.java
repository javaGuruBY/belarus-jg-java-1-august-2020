package com.javaguru.student_vadim_migun.lesson_6.level_4_junior.Task_18;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoDimensionalArrayTest {

    @Test

    public void sumAllNumberTwoArray() {
        TwoDimensionalArray victim = new TwoDimensionalArray();
        int[][] array = {{1, 2, 3}, {1, 4, 7}};
        int expected = 18;
        int actual = victim.sumAllNumbersArray(array);
        assertEquals(expected, actual);
    }

}