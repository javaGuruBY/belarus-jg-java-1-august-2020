package com.javaguru.student_vadim_migun.lesson_6.level_1_intern.Task_2;
/*
Создайте класс DayOfTheWeekDetectorTest и напишите
автоматические тесты для всех сценариев.
 */

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.detectMonday();
        test.detectTuesday();
        test.detectWednesday();
        test.detectThursday();
        test.detectFriday();
        test.detectSaturday();
        test.detectSunday();

    }

    DayOfTheWeekDetector dayWeek = new DayOfTheWeekDetector();

    void detectMonday() {
        String expected = "Monday";
        String actual = dayWeek.detectDayName(1);
        if (expected.equals(actual)) {
            System.out.println("Test - OK - Monday");
        } else {
            System.out.println("Test - FALSE");
        }
    }

    void detectTuesday() {
        String expected = "Tuesday";
        String actual = dayWeek.detectDayName(2);
        if (expected.equals(actual)) {
            System.out.println("Test - OK - Tuesday");
        } else {
            System.out.println("Test - FALSE");
        }
    }

    void detectWednesday() {
        String expected = "Wednesday";
        String actual = dayWeek.detectDayName(3);
        if (actual.equals(expected)) {
            System.out.println("Test - OK - Wednesday");
        } else {
            System.out.println("Test - FALSE");
        }
    }

    void detectThursday() {
        String expected = "Thursday";
        String actual = dayWeek.detectDayName(4);
        if (expected.equals(actual)) {
            System.out.println("Test - OK - Thursday");
        } else {
            System.out.println("Test - FALSE");
        }
    }

    void detectFriday() {
        String expected = "Friday";
        String actual = dayWeek.detectDayName(5);
        if (expected.equals(actual)) {
            System.out.println("Test - OK - Friday");
        } else {
            System.out.println("Test - FALSE");
        }
    }

    void detectSaturday() {
        String expected = "Saturday";
        String actual = dayWeek.detectDayName(6);
        if (expected.equals(actual)) {
            System.out.println("Test - OK - Saturday");
        } else {
            System.out.println("Test - FALSE");
        }
    }

    void detectSunday() {
        String expected = "Sunday";
        String actual = dayWeek.detectDayName(7);
        if (expected.equals(actual)) {
            System.out.println("Test - OK - Sunday");
        } else {
            System.out.println("Test - FALSE");
        }
    }
}

