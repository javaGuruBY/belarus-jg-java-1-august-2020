package com.javaguru.student_vadim_migun.lesson_7.level_6_middle;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerCalculatorTest {

    private PowerCalculator victim = new PowerCalculator();

    @Test
    public void shouldPowValue() {
        int actual = victim.pow(5, 2);
        assertEquals(25, actual);

    }

}