package com.javaguru.student_vladimir_petranovski.lesson_15.level_2.task_9;

import junit.framework.TestCase;

public class FraudDetectorTest extends TestCase {
    private final FraudDetector test = new FraudDetector();
    private final Trader raoul = new Trader("Raoul", "Cambridge");

    public void testIsFraudTrue() {
        assertTrue(test.isFraud(raoul, "Mario","London"));
    }

    public void testIsFraudFalse() {
        assertFalse(test.isFraud(raoul, "Raoul","Cambridge"));
    }
}