package com.javaguru.student_vladimir_petranovski.lesson_4.level_7.super_task_1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    private FizzBuzz test;

    @Before
    public void setUp() {
        test = new FizzBuzz();
    }

    @Test
    public void detectFizz() {
        assertEquals("Fizz", test.detect(3));
    }

    @Test
    public void detectBuzz() {
        assertEquals("Buzz", test.detect(5));
    }

    @Test
    public void detectFizzBuzz() {
        assertEquals("FizzBuzz", test.detect(-15));
    }

    @Test
    public void detectNothing() {
        assertEquals("" + 11, test.detect(11));
    }

    @Test
    public void detectZero() {
        assertEquals("Enter another number not equals zero", test.detect(0));
    }
}