package com.javaguru.student_vladimir_petranovski.lesson_6.level_1.task_2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheWeekDetectorDemoTest {
    private DayOfTheWeekDetectorDemo test;

    @Before
    public void setUp() {
        test = new DayOfTheWeekDetectorDemo();
    }

    @Test
    public void detectDayNameTestMonday() {
        assertEquals("Monday", test.detectDayName(1));
    }

    @Test
    public void detectDayNameTestTuesday() {
        assertEquals("Tuesday", test.detectDayName(2));
    }

    @Test
    public void detectDayNameTestWednesday() {
        assertEquals("Wednesday", test.detectDayName(3));
    }

    @Test
    public void detectDayNameTestThursday() {
        assertEquals("Thursday", test.detectDayName(4));
    }

    @Test
    public void detectDayNameTestFriday() {
        assertEquals("Friday", test.detectDayName(5));
    }

    @Test
    public void detectDayNameTestSaturday() {
        assertEquals("Saturday", test.detectDayName(6));
    }

    @Test
    public void detectDayNameTestSunday() {
        assertEquals("Sunday", test.detectDayName(7));
    }

    @Test
    public void detectDayNameTestNothing() {
        assertEquals("Please input a valid number between 1 and 7", test.detectDayName(0));
    }
}