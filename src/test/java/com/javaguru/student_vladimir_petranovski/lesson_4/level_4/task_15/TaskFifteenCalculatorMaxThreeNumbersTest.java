package com.javaguru.student_vladimir_petranovski.lesson_4.level_4.task_15;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaskFifteenCalculatorMaxThreeNumbersTest {
    private TaskFifteenCalculatorMaxThreeNumbers test;

    @Before
    public void setUp() {
        test = new TaskFifteenCalculatorMaxThreeNumbers();
    }

    @Test
    public void maxOfThreeNumbersTestOne() {
        assertEquals(1, test.maxOfThreeNumbers(1, 1, 0));
    }

    @Test
    public void maxOfThreeNumbersTestTwo() {
        assertEquals(2, test.maxOfThreeNumbers(-1, 2, 2));
    }

    @Test
    public void maxOfThreeNumbersTestThree() {
        assertEquals(0, test.maxOfThreeNumbers(-1, -3, 0));

    }
}