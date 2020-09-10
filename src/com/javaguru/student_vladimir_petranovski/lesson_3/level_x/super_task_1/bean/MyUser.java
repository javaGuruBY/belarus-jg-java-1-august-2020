package com.javaguru.student_vladimir_petranovski.lesson_3.level_x.super_task_1.bean;

public class MyUser {
    private String login;
    private String password;
    private boolean isBlocked;
    private int countOfLoginAttempts;

    public MyUser(String login, String password) {
        this.login = login;
        this.password = password;
        this.isBlocked = false;
        this.countOfLoginAttempts = 3;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public int getCountOfLoginAttempts() {
        return countOfLoginAttempts;
    }

    public void setCountOfLoginAttempts(int countOfLoginAttempts) {
        this.countOfLoginAttempts = countOfLoginAttempts;
    }
}