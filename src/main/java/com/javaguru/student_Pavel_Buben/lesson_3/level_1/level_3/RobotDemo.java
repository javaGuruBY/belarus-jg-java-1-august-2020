package com.javaguru.student_Pavel_Buben.lesson_3.level_1.level_3;

class RobotDemo {
    public static void main(String[] args) {

        Robot robot = new Robot("Pavel");
        robot.sayHello();
        robot.sayYourName();
        System.out.println();

        Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot1.sayYourName();
        System.out.println();

        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayYourName();
        System.out.println();
    }
}
