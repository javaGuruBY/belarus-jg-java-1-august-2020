package com.javaguru.student_vladimir_petranovski.lesson_15.userapplication;

import com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.UI.*;
import com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.config.UserApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class UserApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserApplicationConfig.class);
//                new AnnotationConfigApplicationContext("com.javaguru.student_vladimir_petranovski.lesson_15.userapplication");
        UserMenuExecutor executor = context.getBean(UserMenuExecutor.class);
        executor.start();
    }
}
