package com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.UI;

import com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.domain.User;
import com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.service.UserService;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Order(1)
@Component
public class FindUserByIdMenu implements UserMenu {

    private final UserService userService;

    public FindUserByIdMenu(UserService userService) {
        this.userService = userService;
    }
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please user id:");
        String id = scanner.nextLine();

        User user = userService.findById(id);
        System.out.println("User by id: " + user);
    }

    @Override
    public String getMenuName() {
        return "Find user by id:";
    }
}
