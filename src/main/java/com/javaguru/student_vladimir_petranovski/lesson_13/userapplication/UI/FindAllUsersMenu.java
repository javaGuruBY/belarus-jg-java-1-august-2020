package com.javaguru.student_vladimir_petranovski.lesson_13.userapplication.UI;

import com.javaguru.student_vladimir_petranovski.lesson_13.userapplication.domain.User;
import com.javaguru.student_vladimir_petranovski.lesson_13.userapplication.service.UserService;

import java.util.List;

public class FindAllUsersMenu implements UserMenu {

    private final UserService userService;

    public FindAllUsersMenu(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void execute() {
        List<User> users = userService.findAllUsers();
        System.out.println("Users: ");
//        for (User user : users) {
//            System.out.println(user);
//        }
//        users.forEach(user -> System.out.println(user));
        users.forEach(System.out::println);

    }

    @Override
    public String getMenuName() {
        return "Find all users";
    }
}
