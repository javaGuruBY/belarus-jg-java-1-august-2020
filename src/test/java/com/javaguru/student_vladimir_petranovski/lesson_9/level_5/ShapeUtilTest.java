package com.javaguru.student_vladimir_petranovski.lesson_9.level_5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeUtilTest {
    private  ShapeUtil test;
    private Shape[] shapes;

    @Before
    public void setUp() {
        test = new ShapeUtil();
        shapes = new Shape[4];
        shapes[0] = test.createCircle(5);
        shapes[1] = test.createSquare(3);
        shapes[2] = test.createRectangle(2, 7);
        shapes[3] = test.createTriangle(9);
    }

    @Test
    public void calculateAreaTest() {
        double expected = 136.61384519301458;
        double actual = test.calculateArea(shapes);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void calculatePerimeterTest() {
        double expected = 88.41592653589794;
        double actual = test.calculatePerimeter(shapes);
        assertEquals(expected, actual, 0.01);
    }
}