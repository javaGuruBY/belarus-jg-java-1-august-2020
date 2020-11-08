package com.javaguru.student_vladimir_petranovski.lesson_10.userapplication;

import java.util.Scanner;

class CreateUserMenu implements UserMenu{

    private final UserService userService;

    public CreateUserMenu (UserService userService) {
        this.userService = userService;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please your name:");
        String name = scanner.nextLine();
        System.out.println("Enter please your age:");
        int age = Integer.parseInt(scanner.nextLine());

        User user =new User();
        user.setName(name);
        user.setAge(age);

        userService.saveUser(user);
    }

    @Override
    public String getMenuName() {
        return "Create user's menu:";
    }
}
