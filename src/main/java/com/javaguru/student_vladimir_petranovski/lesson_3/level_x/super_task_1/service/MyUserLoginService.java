package com.javaguru.student_vladimir_petranovski.lesson_3.level_x.super_task_1.service;/*
package com.javaguru.student_vladimir_petranovski.lesson_3.level_x.super_task_1.service;

import com.javaguru.student_vladimir_petranovski.lesson_3.level_x.super_task_1.bean.MyUser;

public class MyUserLoginService {

    public boolean login(MyUser user, String password) {
        if (comparePasswords(user, password)) {
            if (!isUserBlocked(user)) {
                resetCountOfLoginAttempts(user);
                return true;
            }
            return false;
        } else {
            decrementCountOfLoginAttempts(user);
            if(!IsLoginAttemptsLeft(user)) {
                blockUser(user);
            }
            return false;
        }
    }

    public boolean comparePasswords(MyUser user, String password) {
        return user.getPassword().equals(password);
    }

    public MyUser blockUser(MyUser user) {
        user.setBlocked(true);
        return user;
    }

    public MyUser resetCountOfLoginAttempts(MyUser user){
        user.setCountOfLoginAttempts(3);
        return user;
    }

    public boolean isUserBlocked(MyUser user) {
        return user.isBlocked();
    }

    public MyUser decrementCountOfLoginAttempts(MyUser user) {
        user.setCountOfLoginAttempts(user.getCountOfLoginAttempts() - 1);
        return user;
    }

    public boolean IsLoginAttemptsLeft(MyUser user) {
        return user.getCountOfLoginAttempts() > 0;
    }
}

 */
