package lesson_6.level_1_intern.task_2;


class DayOfTheWeekDetector {
    String detectDayName(int number){
        java.lang.String dayWeek = null;
        if ((number >=1) && (number <= 7)) {
            switch (number) {
                case (1):
                    dayWeek = "Monday";
                    break;
                case 2:
                    dayWeek = "Tuesday";
                    break;
                case 3:
                    dayWeek = "Wednesday";
                    break;
                case 4:
                    dayWeek = "Thursday";
                    break;
                case 5:
                    dayWeek = "Friday";
                    break;
                case 6:
                    dayWeek = "Saturday";
                    break;
                case 7:
                    dayWeek = "Sunday";
                    break;
            }
        }
        else {
            dayWeek = "Please input a valid number between 1 and 7";
        }
        return dayWeek;
    }
}
