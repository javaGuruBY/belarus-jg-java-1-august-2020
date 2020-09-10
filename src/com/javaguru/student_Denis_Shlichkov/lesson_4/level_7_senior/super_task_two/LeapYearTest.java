package lesson_4.level_7_senior.super_task_two;

public class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        System.out.println(leapYearTest.isLeapYearTest(1700));
        System.out.println(leapYearTest.isLeapYearTest(2000));
        System.out.println(leapYearTest.isLeapYearTest(1900));
        System.out.println(leapYearTest.isLeapYearTest(1704));
        System.out.println(leapYearTest.isLeapYearTest(1984));
        System.out.println(leapYearTest.isLeapYearTest(2020));
        System.out.println(leapYearTest.isLeapYearTest(2200));
    }

    String isLeapYearTest (int year) {
        LeapYear leapYear = new LeapYear();
        if (leapYear.isLeapYear(year)) {
            return "Високосный";
        }
        else {
            return "Не високосный";
        }
    }
}
