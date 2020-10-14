package com.javaguru.student_vladimir_petranovski.lesson_9.level_4.task_19;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    private Triangle test;
    private double length;

    @Before
    public void setUp() {
        test = new Triangle("Triangle", 9);
    }

    @Test
    public void calculateAreaTest() {
        assertEquals(20.25 * Math.sqrt(3), test.calculateArea(), 0.01);
    }

    @Test
    public void calculatePerimeterTest() {
        assertEquals(27, test.calculatePerimeter(), 0.01);
    }
}