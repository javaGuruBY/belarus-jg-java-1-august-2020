package com.javaguru.student_vladimir_petranovski.lesson_10.level_2.task_4_task_5;


import java.util.Scanner;

class DayOfWeekDetectorDemo {
    private final DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run() {
        System.out.println("Please, enter numbers from 1 to 7");

        Scanner sc = new Scanner(System.in);

        System.out.println(dayOfTheWeekDetector.detectDayName(sc.nextInt()));

    }

    public static void main(String[] args) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersionFirstImplementation();
        DayOfTheWeekDetector dayOfTheWeekDetector1 = new DayOfTheWeekDetectorIfVersionSecondImplementation();
        DayOfTheWeekDetector dayOfTheWeekDetector2 = new DayOfTheWeekDetectorIfVersionThirdImplementation();

        DayOfWeekDetectorDemo dayOfWeekDetectorDemo = new DayOfWeekDetectorDemo(dayOfTheWeekDetector);
        dayOfWeekDetectorDemo.run();
        new DayOfWeekDetectorDemo(dayOfTheWeekDetector1).run();
        new DayOfWeekDetectorDemo(dayOfTheWeekDetector2).run();


    }
}
