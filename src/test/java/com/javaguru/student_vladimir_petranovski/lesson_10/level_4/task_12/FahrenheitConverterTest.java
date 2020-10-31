package com.javaguru.student_vladimir_petranovski.lesson_10.level_4.task_12;

import junit.framework.TestCase;
import org.junit.Before;

public class FahrenheitConverterTest extends TestCase {
    private FahrenheitConverter test;

    @Before
    public void setUp() {
        test = new FahrenheitConverter();
    }


    public void testConvertOne() {
        assertEquals(41.0, test.convert(5));
    }

    public void testConvertTwo() {
        assertEquals(50.0, test.convert(10));
    }
}