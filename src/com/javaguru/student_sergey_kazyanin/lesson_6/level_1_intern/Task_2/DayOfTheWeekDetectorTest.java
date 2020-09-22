package com.javaguru.student_sergey_kazyanin.lesson_6.level_1_intern.Task_2;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldDayMonday();
        test.shouldDayTuesday();
        test.shouldDayWednesday();
        test.shouldDayThursday();
        test.shouldDayFriday();
        test.shouldDaySaturday();
        test.shouldDaySunday();
        test.shouldInvalidDayNumber();

    }

    public void shouldDayMonday() {
        int numberDay = 1;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String actualResult = detector.detectDayName(numberDay);
        String expectedResult = "Monday";
        printResult(actualResult, expectedResult, "shouldDayMonday");

    }

    public void shouldDayTuesday() {
        int numberDay = 2;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String actualResult = detector.detectDayName(numberDay);
        String expectedResult = "Tuesday";
        printResult(actualResult, expectedResult, "shouldDayTuesday");

    }

    public void shouldDayWednesday() {
        int numberDay = 3;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String actualResult = detector.detectDayName(numberDay);
        String expectedResult = "Wednesday";
        printResult(actualResult, expectedResult, "shouldDayWednesday");

    }

    public void shouldDayThursday() {
        int numberDay = 4;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String actualResult = detector.detectDayName(numberDay);
        String expectedResult = "Thursday";
        printResult(actualResult, expectedResult, "shouldDayThursday");

    }

    public void shouldDayFriday() {
        int numberDay = 5;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String actualResult = detector.detectDayName(numberDay);
        String expectedResult = "Friday";
        printResult(actualResult, expectedResult, "shouldDayFriday");

    }

    public void shouldDaySaturday() {
        int numberDay = 6;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String actualResult = detector.detectDayName(numberDay);
        String expectedResult = "Saturday";
        printResult(actualResult, expectedResult, "shouldDaySaturday");

    }

    public void shouldDaySunday() {
        int numberDay = 7;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String actualResult = detector.detectDayName(numberDay);
        String expectedResult = "Sunday";
        printResult(actualResult, expectedResult, "shouldDaySunday");
    }

    public void shouldInvalidDayNumber() {
        int numberDay = 0;
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String actualResult = detector.detectDayName(numberDay);
        String expectedResult = "Please input a valid number between 1 and 7";
        printResult(actualResult, expectedResult, "shouldInvalidDayNumber");
    }

    public void printResult(String actualResult, String expectedResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " test = PASSED");
        } else {
            System.out.println(testName + " test = FAILURE!!! actualResult = " + actualResult + " | expectedResult = " + expectedResult);
        }
    }
}
