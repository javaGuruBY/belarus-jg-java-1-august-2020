package com.javaguru.student_vladimir_petranovski.lesson_3.level_x.super_task_1.service;/*
package com.javaguru.student_vladimir_petranovski.lesson_3.level_x.super_task_1.service;


import com.javaguru.student_vladimir_petranovski.lesson_3.level_x.super_task_1.bean.MyUser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyUserLoginServiceTest {

    @Test
    public void loginTestshouldReturnTrue() {
        MyUser user = new MyUser("User", "1234");

        MyUserLoginService userLoginService = new MyUserLoginService();
        boolean actual = userLoginService.login(user, "1234");

        boolean expected = true;

        assertEquals(expected, actual);
    }
    @Test
    public void loginTestShouldReturnFalse() {
        MyUser user = new MyUser("User", "1234");

        MyUserLoginService userLoginService = new MyUserLoginService();
        boolean actual = userLoginService.login(user, "12345");

        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void comparePasswords() {
    }

    @Test
    public void resetCountOfLoginAttempts() {
    }

    @Test
    public void isUserBlocked() {
    }

    @Test
    public void decrementCountOfLoginAttempts() {
    }

    @Test
    public void isLoginAttemptsLeft() {
    }



    @Test
    public void checkIfPasswordMatchUserPasswordShouldReturnTrue() {
        MyUser user = new MyUser("User", "1234");

        MyUserLoginService userLoginService = new MyUserLoginService();
        boolean actual = userLoginService.comparePasswords(user, "1234");

        boolean expected = true;

        assertEquals(expected, actual);
    }
    @Test
    public void checkIfPasswordMatchUserPasswordShouldReturnFalse() {
        MyUser user = new MyUser("User", "1234");

        MyUserLoginService userLoginService = new MyUserLoginService();
        boolean actual = userLoginService.comparePasswords(user, "12345");

        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void dropLoginAttempLeft() {
        MyUser user = new MyUser("User", "1234");
        user.setCountOfLoginAttempts(1);

        MyUserLoginService userLoginService = new MyUserLoginService();
        MyUser updatedUser = userLoginService.resetCountOfLoginAttempts(user);

        int expected = 3;
        int actual = updatedUser.getCountOfLoginAttempts();

        assertEquals(expected, actual);
    }

    @Test
    public void isUserBlockedShouldReturnTrue() {
        MyUser user = new MyUser("User", "1234");
        user.setBlocked(true);

        MyUserLoginService userLoginService = new MyUserLoginService();

        boolean expected = true;
        boolean actual = userLoginService.isUserBlocked(user);

        assertEquals(expected, actual);
    }
    @Test
    public void isUserBlockedShouldReturnfalse() {
        MyUser user = new MyUser("User", "1234");
        user.setBlocked(false);

        MyUserLoginService userLoginService = new MyUserLoginService();

        boolean expected = false;
        boolean actual = userLoginService.isUserBlocked(user);

        assertEquals(expected, actual);
    }

    @Test
    public void decrementloginAttemptLeft() {
        MyUser user = new MyUser("User", "1234");
        user.setCountOfLoginAttempts(3);

        MyUserLoginService userLoginService = new MyUserLoginService();

        int expected = 2;
        userLoginService.decrementCountOfLoginAttempts(user);
        int actual = user.getCountOfLoginAttempts();

        assertEquals(expected, actual);
    }

    @Test
    public void blockUser() {
        MyUser user = new MyUser("User", "1234");

        MyUserLoginService userLoginService = new MyUserLoginService();

        boolean expected = true;
        userLoginService.blockUser(user);
        boolean actual = user.isBlocked();

        assertEquals(expected, actual);
    }

    @Test
    public void ifLoginAttemptLeftIsLeft() {
        MyUser user = new MyUser("User", "1234");
        user.setCountOfLoginAttempts(1);

        MyUserLoginService userLoginService = new MyUserLoginService();

        boolean expected = true;
        boolean actual = userLoginService.IsLoginAttemptsLeft(user);

        assertEquals(expected, actual);
    }

    @Test
    public void loginShouldBlockUser() {
        MyUser user = new MyUser("User", "1234");
        user.setCountOfLoginAttempts(1);

        MyUserLoginService userLoginService = new MyUserLoginService();

        userLoginService.login(user, "12345");
        boolean actual = user.isBlocked();
        boolean expected = true;

        assertEquals(expected, actual);
    }
    @Test
    public void loginShouldNotProceed() {
        MyUser user = new MyUser("User", "1234");
        user.setCountOfLoginAttempts(0);
        user.setBlocked(true);

        MyUserLoginService userLoginService = new MyUserLoginService();

        boolean actual = userLoginService.login(user, "1234");
        boolean expected = false;

        assertEquals(expected, actual);
    }
}

 */