package com.javaguru.student_vladimir_petranovski.lesson_4.level_4.task_13;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaskThirteenEvenOrOddTest {
    private TaskThirteenEvenOrOdd taskThirteenEvenOrOdd;

    @Before
    public void setUp(){
        taskThirteenEvenOrOdd = new TaskThirteenEvenOrOdd();
    }

    @Test
    public void isEvenTrue() {
        assertEquals(true, taskThirteenEvenOrOdd.isEven(4));
    }

    @Test
    public void isEvenFalse() {
        assertEquals(false, taskThirteenEvenOrOdd.isEven(7));
    }
}