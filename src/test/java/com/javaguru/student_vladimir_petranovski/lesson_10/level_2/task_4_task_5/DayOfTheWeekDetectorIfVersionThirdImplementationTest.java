package com.javaguru.student_vladimir_petranovski.lesson_10.level_2.task_4_task_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheWeekDetectorIfVersionThirdImplementationTest {

    @Test
    public void detectDayName() {
        DayOfTheWeekDetectorIfVersionThirdImplementation test = new DayOfTheWeekDetectorIfVersionThirdImplementation();
        assertEquals("Friday", test.detectDayName(5));
    }
}