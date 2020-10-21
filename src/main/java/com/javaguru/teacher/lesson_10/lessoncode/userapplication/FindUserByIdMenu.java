package com.javaguru.teacher.lesson_10.lessoncode.userapplication;

import java.util.Scanner;

class FindUserByIdMenu implements UserMenu {

    private final UserService userService;

    FindUserByIdMenu(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter user id:");
        String id = scanner.nextLine();

        User user = userService.findById(id);
        System.out.println("Result: " + user);
    }

    @Override
    public String getMenuName() {
        return "Find user by id.";
    }
}
