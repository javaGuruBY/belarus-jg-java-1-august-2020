package com.javaguru.student_vladimir_petranovski.lesson_4.level_7.super_task_2;

class LeapYearTest {
    public void isDivisionOnFourFoundTrueTest() {
        LeapYear leapYear = new LeapYear();
        boolean expected = true;
        boolean actual = leapYear.isDivisionONFour(2020);
        if (expected == actual) {
            System.out.println("Test isDivisionOnFourFoundTrueTest -- true");
        }
    }
    public void isDivisionOnFourFoundFalseTest() {
        LeapYear leapYear = new LeapYear();
        boolean expected = false;
        boolean actual = leapYear.isDivisionONFour(2015);
        if (expected == actual) {
            System.out.println("Test isDivisionOnFourFoundFalseTest -- false");
        }
    }
    public void isDivisionOnHundredFoundTrueTest() {
        LeapYear leapYear = new LeapYear();
        boolean expected = true;
        boolean actual = leapYear.isDivisionOnHundred(2000);
        if (expected == actual) {
            System.out.println("Test isDivisionOnHundredFoundTrueTest -- true");
        }
    }
    public void isDivisionOnHundredFoundFalseTest() {
        LeapYear leapYear = new LeapYear();
        boolean expected = false;
        boolean actual = leapYear.isDivisionOnHundred(2010);
        if (expected == actual) {
            System.out.println("Test isDivisionOnHundredFoundFalseTest -- false");
        }
    }
    public void isDivisionOnFourHundredFoundTrueTest() {
        LeapYear leapYear = new LeapYear();
        boolean expected = true;
        boolean actual = leapYear.isDivisionOnHundred(2000);
        if (expected == actual) {
            System.out.println("Test isDivisionOnFourHundredFoundTrueTest -- true");
        }
    }
    public void isDivisionOnFourHundredFoundFalseTest() {
        LeapYear leapYear = new LeapYear();
        boolean expected = false;
        boolean actual = leapYear.isDivisionOnFourHundred(1984);
        if (expected == actual) {
            System.out.println("Test isDivisionOnFourHundredFoundFalseTest -- false");
        }
    }
    public void isLeapYearTrue() {
       LeapYear leapYear = new LeapYear();
       if (leapYear.isLeapYear(2020) == true) {
           System.out.println("Высокосный");
       } else
           System.out.println("Обычный год");
    }
    public void isLeapYearFalse() {
        LeapYear leapYear = new LeapYear();
        if (leapYear.isLeapYear(2019) == true) {
            System.out.println("Высокосный");
        } else
            System.out.println("Обычный год");
    }

    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.isDivisionOnFourFoundTrueTest();
        leapYearTest.isDivisionOnFourFoundFalseTest();
        leapYearTest.isDivisionOnHundredFoundTrueTest();
        leapYearTest.isDivisionOnHundredFoundFalseTest();
        leapYearTest.isDivisionOnFourHundredFoundTrueTest();
        leapYearTest.isDivisionOnFourHundredFoundFalseTest();
        leapYearTest.isLeapYearTrue();
        leapYearTest.isLeapYearFalse();
    }
}
