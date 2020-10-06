package com.javaguru.student_vladimir_petranovski.lesson_6.level_1.task_2;

class DayOfWeekDetectorDemoTest {
    public static void main(String[] args) {
       DayOfWeekDetectorDemoTest dayWeek = new DayOfWeekDetectorDemoTest();
       dayWeek.detectDayNameMonday();
       dayWeek.detectDayNameTuesday();
       dayWeek.detectDayNameWednesday();
       dayWeek.detectDayNameThursday();
       dayWeek.detectDayNameFriday();
       dayWeek.detectDayNameSaturday();
       dayWeek.detectDayNameSunday();
       dayWeek.detectDayNameAnotherDay();
    }

    DayOfTheWeekDetectorDemo day = new DayOfTheWeekDetectorDemo();

    public void detectDayNameMonday() {
        String expected = "Monday";
        String actual = day.detectDayName(1);
        checkResult(expected == actual, "Test detectDayNameMonday");
    }

    public void detectDayNameTuesday() {
        String expected = "Tuesday";
        String actual = day.detectDayName(2);
        checkResult(expected == actual, "Test detectDayNameTuesday");
    }

    public void detectDayNameWednesday() {
        String expected = "Wednesday";
        String actual = day.detectDayName(3);
        checkResult(expected == actual, "Test detectDayNameWednesday");
    }

    public void detectDayNameThursday() {
        String expected = "Thursday";
        String actual = day.detectDayName(4);
        checkResult(expected == actual, "Test detectDayNameThursday");
    }

    public void detectDayNameFriday() {
        String expected = "Friday";
        String actual = day.detectDayName(5);
        checkResult(expected == actual, "Test detectDayNameFriday");
    }

    public void detectDayNameSaturday() {
        String expected = "Saturday";
        String actual = day.detectDayName(6);
        checkResult(expected == actual, "Test detectDayNameSaturday");
    }

    public void detectDayNameSunday() {
        String expected = "Sunday";
        String actual = day.detectDayName(7);
        checkResult(expected == actual, "Test detectDayNameSunday");
    }

    public void detectDayNameAnotherDay() {
        String expected = "Please input a valid number between 1 and 7";
        String actual = day.detectDayName(8);
        checkResult(expected == actual, "Test detectDayNameAnotherDay");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = SUCCESS");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }
}
