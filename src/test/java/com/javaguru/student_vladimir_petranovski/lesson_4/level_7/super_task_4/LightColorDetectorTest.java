package com.javaguru.student_vladimir_petranovski.lesson_4.level_7.super_task_4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LightColorDetectorTest {
    private LightColorDetector lightColorDetector;

    @Before
    public void setUp() {
        lightColorDetector = new LightColorDetector();
    }

    @Test
    public void detectTestOne() {
        String actual = lightColorDetector.detect(381);
        assertEquals("Violet", actual);
    }

    @Test
    public void detectTestTwo() {
        String actual = lightColorDetector.detect(463);
        assertEquals("Blue", actual);
    }

    @Test
    public void detectTestThree() {
        String actual = lightColorDetector.detect(503);
        assertEquals("Green", actual);
    }

    @Test
    public void detectTestFour() {
        String actual = lightColorDetector.detect(575);
        assertEquals("Yellow", actual);
    }

    @Test
    public void detectTestFive() {
        String actual = lightColorDetector.detect(591);
        assertEquals("Orange", actual);
    }

    @Test
    public void detectTestSix() {
        String actual = lightColorDetector.detect(740);
        assertEquals("Red", actual);
    }

    @Test
    public void detectTestSeven() {
        String actual = lightColorDetector.detect(795);
        assertEquals("Invisible Light", actual);
    }
}