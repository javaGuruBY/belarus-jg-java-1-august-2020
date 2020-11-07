package com.javaguru.teacher.lesson_12.userapplication.ui;

import com.javaguru.teacher.lesson_12.userapplication.domain.User;
import com.javaguru.teacher.lesson_12.userapplication.service.UserService;

import java.util.List;

public class FindAllUsersMenu implements UserMenu {

    private final UserService service;

    public FindAllUsersMenu(UserService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        List<User> users = service.findAllUsers();

        System.out.println("Users:");
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Override
    public String getMenuName() {
        return "Find all users.";
    }
}
