package com.javaguru.student_vladimir_petranovski.lesson_3.level_3.task_11;

import com.javaguru.student_vladimir_petranovski.lesson_3.level_3.task_11.bean.RobotName;
import com.javaguru.student_vladimir_petranovski.lesson_3.level_3.task_11.service.RobotNameService;

public class RobotNameDemo {
    public static void main(String[] args) {
        RobotNameService robotNameService = new RobotNameService();
        RobotName robotName = new RobotName();
        robotName.setName("Robocop");
        robotNameService.sayYourName(robotName);
    }
}
