package com.javaguru.student_vadim_migun.lesson_6.level_1_intern.Task_2;

import java.util.Scanner;

/*
Создайте класс DayOfTheWeekDetector.
В классе DayOfTheWeekDetector создайте метод:

    String detectDayName(int number).

Этот метод должен по переданному в качестве параметра числу определять день недели.
Реализуйте этот метод (можно взять часть приведённого выше кода).

 */

class DayOfTheWeekDetector {

    String detectDayName(int number) {

        Scanner myInput = new Scanner(System.in);
        System.out.print("Input integer number between 1 and 7 : ");
        number = myInput.nextInt();
        if ((number >= 1) && (number <= 7)) {
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
            }
        } else {
            System.out.println("Please input a valid number between 1 and 7");
        }
        return null;
    }
}
