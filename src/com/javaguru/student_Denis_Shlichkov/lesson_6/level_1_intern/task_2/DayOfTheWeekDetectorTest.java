package lesson_6.level_1_intern.task_2;


class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.testDayOfTheWeekDetector(1, "Monday");
        test.testDayOfTheWeekDetector(2, "Tuesday");
        test.testDayOfTheWeekDetector(3, "Wednesday");
        test.testDayOfTheWeekDetector(4, "Thursday");
        test.testDayOfTheWeekDetector(5, "Friday");
        test.testDayOfTheWeekDetector(6, "Saturday");
        test.testDayOfTheWeekDetector(7, "Sunday");
        test.testDayOfTheWeekDetector(8, "Please input a valid number between 1 and 7");

    }

    void testDayOfTheWeekDetector (int dayNumber, String day) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        if (day.equals(dayOfTheWeekDetector.detectDayName(dayNumber))) {
            System.out.println("Test - OK");
        }
        else {
            System.out.println("Test - FAIL");
        }
    }
}
