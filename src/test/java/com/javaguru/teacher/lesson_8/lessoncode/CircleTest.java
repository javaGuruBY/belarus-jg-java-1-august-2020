package com.javaguru.teacher.lesson_8.lessoncode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    private Circle victim;

    @Before
    public void setUp() {
        victim = new Circle();
    }

    @Test
    public void shouldCalculateAreaWithRadius10() {
        victim.setRadius(10);
        double actual = victim.calculateArea();
        assertEquals(314.16, actual, 0.001);
    }

    @Test
    public void shouldCalculateAreaWithRadius3() {
        victim.setRadius(3);
        double actual = victim.calculateArea();
        assertEquals(28.27, actual, 0.01);
    }
}