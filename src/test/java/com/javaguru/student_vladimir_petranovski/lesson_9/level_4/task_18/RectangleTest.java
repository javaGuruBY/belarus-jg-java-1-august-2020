package com.javaguru.student_vladimir_petranovski.lesson_9.level_4.task_18;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    private Rectangle test;
    private double length;
    private  double height;

    @Before
    public void setUp() {
        test = new Rectangle("Rectangle", 5, 7);
    }

    @Test
    public void calculateAreaTest() {
        assertEquals(35, test.calculateArea(), 0.01);
    }

    @Test
    public void calculatePerimeterTest() {
        assertEquals(24, test.calculatePerimeter(), 0.01);
    }
}