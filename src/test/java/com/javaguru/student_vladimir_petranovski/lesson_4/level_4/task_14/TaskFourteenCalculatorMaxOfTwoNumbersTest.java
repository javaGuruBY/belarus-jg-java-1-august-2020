package com.javaguru.student_vladimir_petranovski.lesson_4.level_4.task_14;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaskFourteenCalculatorMaxOfTwoNumbersTest {
    private TaskFourteenCalculatorMaxOfTwoNumbers taskFourteenCalculatorMaxOfTwoNumbers;

    @Before
    public void setUp() {
        taskFourteenCalculatorMaxOfTwoNumbers = new TaskFourteenCalculatorMaxOfTwoNumbers();
    }

    @Test
    public void maxOfTwoNumbersTestOne() {
        assertEquals(10, taskFourteenCalculatorMaxOfTwoNumbers.maxOfTwoNumbers(10, 10));
    }

    @Test
    public void maxOfTwoNumbersTestTwo() {
        assertEquals(-1, taskFourteenCalculatorMaxOfTwoNumbers.maxOfTwoNumbers(-3, -1));
    }
}