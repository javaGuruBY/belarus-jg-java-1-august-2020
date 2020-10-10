package com.javaguru.student_vladimir_petranovski.lesson_7.level_6.task_10;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerCalculatorTest {
    private  PowerCalculator test;

    @Before
    public void setUp() {
        test = new PowerCalculator();
    }

    @Test
    public void raiseNumberToPowerTestPowerZero() {
        assertEquals(1, test.raiseNumberToPower(3, 0), 0.1);
    }

    @Test
    public void raiseNumberToPowerTestNumberZero() {
        assertEquals(0, test.raiseNumberToPower(0, 2), 0.1);
    }

    @Test
    public void raiseNumberToPowerTest() {
        assertEquals(9, test.raiseNumberToPower(3, 2), 0.1);
    }
}