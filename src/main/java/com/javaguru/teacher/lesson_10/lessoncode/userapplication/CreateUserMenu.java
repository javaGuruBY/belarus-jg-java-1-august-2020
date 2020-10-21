package com.javaguru.teacher.lesson_10.lessoncode.userapplication;

import java.util.Scanner;

class CreateUserMenu implements UserMenu {

    private final UserService userService;

    CreateUserMenu(UserService userService) {
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

        userService.saveUser(user);
    }

    @Override
    public String getMenuName() {
        return "Create user.";
    }
}
