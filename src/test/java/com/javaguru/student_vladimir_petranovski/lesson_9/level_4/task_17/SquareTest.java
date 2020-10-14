package com.javaguru.student_vladimir_petranovski.lesson_9.level_4.task_17;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    private Square test;
    private double length;

    @Before
    public void setUp() {
        test = new Square("Square", 5);
    }

    @Test
    public void calculateAreaTest() {
        assertEquals(25, test.calculateArea(), 0.01);
    }

    @Test
    public void calculatePerimeterTest() {
        assertEquals(20, test.calculatePerimeter(), 0.01);
    }
}