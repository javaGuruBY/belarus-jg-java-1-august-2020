package com.javaguru.student_vladimir_petranovski.lesson_3.level_x.super_task_1;

import com.javaguru.student_vladimir_petranovski.lesson_3.level_x.super_task_1.bean.MyUser;
import com.javaguru.student_vladimir_petranovski.lesson_3.level_x.super_task_1.service.MyUserLoginService;

public class UserLoginServiceDemo {
    public static void main(String[] args) {
        MyUserLoginService myUserLoginService = new MyUserLoginService();
        MyUser userOne = new MyUser("Shell", "123");
        myUserLoginService.login(userOne, "123");
        myUserLoginService.login(userOne, "321");
    }
}
