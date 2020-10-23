package com.javaguru.student_vladimir_petranovski.lesson_10.level_2.task_4_task_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheWeekDetectorIfVersionSecondImplementationTest {

    @Test
    public void detectDayName() {
        DayOfTheWeekDetectorIfVersionSecondImplementation test = new DayOfTheWeekDetectorIfVersionSecondImplementation();
        assertEquals("Wednesday", test.detectDayName(3));
    }

    @Test
    public void detectDayNameOne() {
        DayOfTheWeekDetectorIfVersionSecondImplementation test = new DayOfTheWeekDetectorIfVersionSecondImplementation();
        assertEquals("Please input a valid number between 1 and 7", test.detectDayName(9));
    }

    @Test
    public void detectDayNameTwo() {
        DayOfTheWeekDetectorIfVersionSecondImplementation test = new DayOfTheWeekDetectorIfVersionSecondImplementation();
        assertEquals("Sunday", test.detectDayName(7));
    }
}