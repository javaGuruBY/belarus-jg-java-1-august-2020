package com.javaguru.student_vladimir_petranovski.lesson_3.level_3.task_12.service;

import com.javaguru.student_vladimir_petranovski.lesson_3.level_3.task_12.bean.RobotNameContinue;

public class RobotNameContinueService {
    public void sayHello(RobotNameContinue robotNameContinue) {
        System.out.println("Hello " + robotNameContinue.getName());
    }
    public void sayYourName(RobotNameContinue robotNameContinue) {
        System.out.println("My name is " + robotNameContinue.getName());
    }
}
