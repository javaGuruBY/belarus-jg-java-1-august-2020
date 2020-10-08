package com.javaguru.student_vladimir_petranovski.lesson_4.level_4.task_11;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaskElevenCalculatorTest {
    private TaskElevenCalculator taskElevenCalculator;

    @Before
    public void setUp() {
        taskElevenCalculator = new TaskElevenCalculator();
    }

    @Test
    public void sumOne() {
        assertEquals(10, taskElevenCalculator.sum(3, 7));
    }

    @Test
    public void sumTwo() {
        assertEquals(0, taskElevenCalculator.sum(-1, 1));
    }

    @Test
    public void subtraction() {
        assertEquals(5, taskElevenCalculator.subtraction(10, 5));
    }

    @Test
    public void divisionOne() {
        assertEquals(0, taskElevenCalculator.division(5, 0));
    }

    @Test
    public void divisionOTwo() {
        assertEquals(1, taskElevenCalculator.division(3, 3));
    }

    @Test
    public void multiplicationOne() {
        assertEquals(15, taskElevenCalculator.multiplication(5, 3));
    }

    @Test
    public void multiplicationTwo() {
        assertEquals(0, taskElevenCalculator.multiplication(0, 1));
    }
}