package com.javaguru.teacher.lesson_12.userapplication.ui;

import com.javaguru.teacher.lesson_12.userapplication.domain.User;
import com.javaguru.teacher.lesson_12.userapplication.service.UserService;

import java.util.Scanner;

public class CreateUserMenu implements UserMenu {

    private final UserService userService;

    public CreateUserMenu(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Please enter your age:");
        int age = Integer.parseInt(scanner.nextLine());

        User user = new User();
        user.setName(name);
        user.setAge(age);

        User createdUser = userService.saveUser(user);
        System.out.println("User created successfully.");
        System.out.println("User details: " + createdUser);
    }

    @Override
    public String getMenuName() {
        return "Create user.";
    }
}
