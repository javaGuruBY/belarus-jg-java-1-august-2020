package com.javaguru.student_vladimir_petranovski.lesson_3.level_3.task_12;

import com.javaguru.student_vladimir_petranovski.lesson_3.level_3.task_12.bean.RobotNameContinue;
import com.javaguru.student_vladimir_petranovski.lesson_3.level_3.task_12.service.RobotNameContinueService;

public class RobotNameContinueDemo {
    public static void main(String[] args) {
        RobotNameContinueService robotNameContinueService = new RobotNameContinueService();
        RobotNameContinue robotNameContinue1 = new RobotNameContinue("Rider");
        robotNameContinueService.sayHello(robotNameContinue1);
        robotNameContinueService.sayYourName(robotNameContinue1);

        RobotNameContinue robotNameContinue2 = new RobotNameContinue("John");
        robotNameContinueService.sayHello(robotNameContinue2);
        robotNameContinueService.sayYourName(robotNameContinue2);
    }
}
