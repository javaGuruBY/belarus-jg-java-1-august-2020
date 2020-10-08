package com.javaguru.student_vladimir_petranovski.lesson_4.level_7.super_task_2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeapYearTest {
    private LeapYear test;

    @Before
    public void setUp() {
        test = new LeapYear();
    }

    @Test
    public void isLeapYearZeroFalse() {
        assertEquals(false, test.isLeapYear(0));
    }

    @Test
    public void isLeapYearTrueFourHundred() {
        assertEquals(true, test.isLeapYear(1200));
    }

    @Test
    public void isLeapYearTrueOneHundred() {
        assertEquals(true, test.isLeapYear(2000));
    }

    @Test
    public void isLeapYearTrueFour() {
        assertEquals(true, test.isLeapYear(2020));
    }

    @Test
    public void isLeapYearFalse() {
        assertEquals(false, test.isLeapYear(2019));
    }
}