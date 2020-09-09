package com.javaguru.student_vladimir_petranovski.lesson_3.level_x.super_task_1.bean;

public class MyUser {
    private static final int NUMBER_OF_ATTEMPTS = 3;
    private String login;
    private String password;
    private boolean blocked;
    private int loginAttemptsLeft;

    public MyUser(String login, String password) {
        this.login = login;
        this.password = password;
        this.blocked = false;
        this.loginAttemptsLeft = NUMBER_OF_ATTEMPTS;
    }
    public String getPassword() {
        return password;
    }
    public int getLoginAttemptsLeft() {
        return loginAttemptsLeft;
    }

    public void dropLoginAttemptsLeft() {

    }
    public boolean blockUser() {
        return blocked;
    }
    public boolean block() {
        return blocked = true;
    }
    public boolean unblock() {
        this.loginAttemptsLeft = NUMBER_OF_ATTEMPTS;
        return blocked = false;
    }
}
