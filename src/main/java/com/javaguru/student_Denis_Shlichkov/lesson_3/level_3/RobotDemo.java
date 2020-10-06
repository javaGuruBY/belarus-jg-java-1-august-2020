package com.javaguru.student_Denis_Shlichkov.lesson_3.level_3;

import lesson_3.level_3.Robot;

public class RobotDemo {
    public static void main(String[] args) {
        Robot robotOne = new Robot("Rider");
        robotOne.sayHello();
        robotOne.sayYourName();

        Robot robotTwo = new Robot("John");
        robotTwo.sayHello();
        robotTwo.sayYourName();

        Robot robotThree = new Robot("Marduk");
        robotThree.sayHello();
        robotThree.sayYourName();
    }
}
