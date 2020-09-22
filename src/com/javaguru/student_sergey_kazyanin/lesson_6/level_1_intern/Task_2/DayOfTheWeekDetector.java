package com.javaguru.student_sergey_kazyanin.lesson_6.level_1_intern.Task_2;

class DayOfTheWeekDetector {

    String detectDayName(int number) {
//        реализовать здесь метод
        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Please input a valid number between 1 and 7";
        }


    }
}
