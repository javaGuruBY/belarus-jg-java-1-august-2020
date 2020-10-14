package com.javaguru.student_vladimir_petranovski.lesson_9.level_4.task_16;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    private Circle test;
    private double radius;

    @Before
    public void setUp() {
        test = new Circle("Круг", 2.0);
    }

    @Test
    public void calculateAreaTest() {
        assertEquals(Math.PI * 4.0, test.calculateArea(), 0.01);
    }

    @Test
    public void calculatePerimeter() {
        assertEquals(Math.PI * 4, test.calculatePerimeter(), 0.01);
    }
}