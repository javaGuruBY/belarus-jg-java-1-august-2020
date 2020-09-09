package com.javaguru.student_vladimir_petranovski.lesson_3.level_x.super_task_1.service;


import com.javaguru.student_vladimir_petranovski.lesson_3.level_x.super_task_1.bean.MyUser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyUserLoginServiceTest {

    @org.junit.jupiter.api.Test
    void loginShouldReturnTrueTest() {
        MyUserLoginService userLoginService = new MyUserLoginService();
        MyUser user = new MyUser("abc", "123");
        boolean expected = true;
        boolean actual = userLoginService.login(user, "123");
        assertEquals(expected, actual);
    }
    @Test
    void loginShouldReturnFalseTest() {
        MyUserLoginService userLoginService = new MyUserLoginService();
        MyUser user = new MyUser("abc", "123");
        boolean expected = false;
        boolean actual = userLoginService.login(user, "456");
        assertEquals(expected, actual);
    }

    @Test
    void checkIfPasswordMathUserPasswordTestShouldReturnTrue() {
        MyUserLoginService userLoginService = new MyUserLoginService();
        MyUser user = new MyUser("dsc", "321");
        boolean expected = true;
        boolean actual = userLoginService.checkIfPasswordMathUserPassword(user, "321");
        assertEquals(expected, actual);
    }
    @Test
    void checkIfPasswordMathUserPasswordTestShouldReturnFalse() {
        MyUserLoginService userLoginService = new MyUserLoginService();
        MyUser user = new MyUser("dsc", "321");
        boolean expected = false;
        boolean actual = userLoginService.checkIfPasswordMathUserPassword(user, "123");
        assertEquals(expected, actual);
    }

    @Test
    void dropLoginAttemptsLeftTest() {
        MyUserLoginService userLoginService = new MyUserLoginService();
        MyUser user = new MyUser("sdk", "421");
        int expected = 3;
        MyUser updateUser = userLoginService.dropLoginAttemptsLeft(user);
        int actual = updateUser.getLoginAttemptsLeft();
        assertEquals(expected, actual);
    }

    @Test
    void isUserBlockedShouldReturnTrueTest() {
        MyUserLoginService userLoginService = new MyUserLoginService();
        MyUser user = new MyUser("dsc", "321");
        boolean actual = user.block();
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void isUserBlockedShouldReturnFalseTest() {
        MyUserLoginService userLoginService = new MyUserLoginService();
        MyUser user = new MyUser("dsc", "321");
        boolean actual = user.unblock();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void decrementLoginAttemptsLeftTest() {
        MyUserLoginService userLoginService = new MyUserLoginService();
        MyUser user = new MyUser("dsc", "321");
        int actual = userLoginService.decrementLoginAttemptsLeft(user);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void blockUserTest() {
        MyUserLoginService userLoginService = new MyUserLoginService();
        MyUser user = new MyUser("dsc", "321");
        boolean actual = userLoginService.blockUser(user);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isLoginAttemptsLeftIsLeftTrueTest() {
        MyUserLoginService userLoginService = new MyUserLoginService();
        MyUser user = new MyUser("dsc", "321");
        boolean actual = userLoginService.isLoginAttemptsLeftIsLeft(user);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}