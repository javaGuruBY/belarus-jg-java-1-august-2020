package lesson_6.level_1_intern.task_2;


class DayOfTheWeekDetector {
    String detectDayName(int number){
        java.lang.String dayWeek = null;
        if ((number >=1) && (number <= 7)) {
            switch (number) {
                case 1 -> dayWeek = "Monday";
                case 2 -> dayWeek = "Tuesday";
                case 3 -> dayWeek = "Wednesday";
                case 4 -> dayWeek = "Thursday";
                case 5 -> dayWeek = "Friday";
                case 6 -> dayWeek = "Saturday";
                case 7 -> dayWeek = "Sunday";
            }
        }
        else {
            dayWeek = "Please input a valid number between 1 and 7";
        }
        return dayWeek;
    }
}
