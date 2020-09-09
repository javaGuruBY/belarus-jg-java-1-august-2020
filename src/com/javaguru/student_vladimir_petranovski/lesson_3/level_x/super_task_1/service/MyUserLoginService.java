package com.javaguru.student_vladimir_petranovski.lesson_3.level_x.super_task_1.service;


import com.javaguru.student_vladimir_petranovski.lesson_3.level_x.super_task_1.bean.MyUser;

public class MyUserLoginService {
    public boolean login(MyUser user, String password) {
        if (checkIfPasswordMathUserPassword(user, password)) {
            if(!isUserBlocked(user)) {
                dropLoginAttemptsLeft(user);
            }
            return true;
        } else {
            if(!isLoginAttemptsLeftIsLeft(user)) {
                decrementLoginAttemptsLeft(user);
            }
            return false;
        }
    }
    public boolean checkIfPasswordMathUserPassword(MyUser user, String password) {

        return user.getPassword().equals(password);
    }
    public MyUser dropLoginAttemptsLeft(MyUser user) {
        return user;
    }
    public boolean isUserBlocked(MyUser user) {
        return user.blockUser();
    }
    public int decrementLoginAttemptsLeft(MyUser user) {
        int decrement = user.getLoginAttemptsLeft() - 1;
        if (decrement <= 0) {
            user.block();
        }
        return decrement;
    }
    public boolean blockUser(MyUser user) {
        if (user.block()) {
            return true;
        } else
            return false;
    }

    public boolean isLoginAttemptsLeftIsLeft(MyUser user) {

        return user.getLoginAttemptsLeft() > 0;
    }

}
