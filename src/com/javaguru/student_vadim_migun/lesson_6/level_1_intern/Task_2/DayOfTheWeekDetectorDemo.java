package com.javaguru.student_vadim_migun.lesson_6.level_1_intern.Task_2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Input integer number between 1 and 7 : ");
        int firstNumber = myInput.nextInt();
        if ((firstNumber >=1) && (firstNumber <= 7)) {
            switch (firstNumber) {
                case 1: System.out.println("Monday");
                    break;
                case 2: System.out.println("Tuesday");
                    break;
                case 3: System.out.println("Wednesday");
                    break;
                case 4: System.out.println("Thursday");
                    break;
                case 5: System.out.println("Friday");
                    break;
                case 6: System.out.println("Saturday");
                    break;
                case 7: System.out.println("Sunday");
                    break;
            }
        }
        else {
            System.out.println("Please input a valid number between 1 and 7");
        }
    }

}
