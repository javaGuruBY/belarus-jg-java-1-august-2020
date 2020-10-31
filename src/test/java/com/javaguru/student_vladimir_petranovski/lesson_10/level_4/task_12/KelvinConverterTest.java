package com.javaguru.student_vladimir_petranovski.lesson_10.level_4.task_12;

import junit.framework.TestCase;
import org.junit.Before;

public class KelvinConverterTest extends TestCase {

    private KelvinConverter test;

    @Before
    public void setUp() {
        test = new KelvinConverter();
    }

    public void testConvertOne() {
        assertEquals(273.15, test.convert(0));
    }

    public void testConvertTwo() {
        assertEquals(303.15, test.convert(30));
    }
}