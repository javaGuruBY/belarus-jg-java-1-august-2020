package com.javaguru.teacher.lesson_8.lessoncode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator victim = new Calculator();
    // target

    @Test
    public void shouldCalculateSum() {
        int actual = victim.sum(10, 30);
        assertEquals(40, actual);
    }

}