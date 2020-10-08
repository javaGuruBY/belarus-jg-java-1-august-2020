package com.javaguru.teacher.lesson_8.lessoncode;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayServiceTest {

    private ArrayService victim = new ArrayService();

    @Test
    public void shouldSumArray() {
        int[] array = {5, 3, 2, 6, 7, 8};
        int actual = victim.sumInArray(array);
        assertEquals(31, actual);
    }

    @Test
    public void shouldReturnZeroWhenEmptyArray() {
        int[] array = new int[0];
        int actual = victim.sumInArray(array);
        assertEquals(0, actual);
    }
}