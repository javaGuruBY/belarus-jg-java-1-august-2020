package com.javaguru.teacher.lesson_8.lessoncode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoiseDetectorTest {

    private NoiseDetector victim = new NoiseDetector();

    @Test
    public void shouldDetectOffice() {
        String actual = victim.detect(60);
        assertEquals("Office", actual);
    }
}