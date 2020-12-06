package com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.UI;

import com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.domain.User;
import com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.service.UserService;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Order(0)
@Component
public class CreateUserMenu implements UserMenu {

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

        User createdUser = userService.saveUser(user);
        System.out.println("User created successfully!");
        System.out.println("User details: " + createdUser);

    }

    @Override
    public String getMenuName() {
        return "Create user's menu:";
    }
}
