package com.javaguru.student_vladimir_petranovski.lesson_12.userapplication;

import com.javaguru.student_vladimir_petranovski.lesson_12.userapplication.UI.*;
import com.javaguru.student_vladimir_petranovski.lesson_12.userapplication.repository.UserRepository;
import com.javaguru.student_vladimir_petranovski.lesson_12.userapplication.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserApplication {

    public static void main(String[] args) {

        UserRepositoryFactory userRepositoryFactory = new UserRepositoryFactory();
        String type = null;
        if (args.length > 0) {
            type = args[0];
        }
        UserRepository userRepository = userRepositoryFactory.createByType(type);

        ExitMenu exitMenu = new ExitMenu();
        UserService userService = new UserService(userRepository);
        CreateUserMenu createUserMenu = new CreateUserMenu(userService);
        FindUserByIdMenu findUserByIdMenu = new FindUserByIdMenu(userService);
        FindAllUsersMenu findAllUsersMenu = new FindAllUsersMenu(userService);

        List<UserMenu> menu = new ArrayList<>();
        menu.add(createUserMenu);
        menu.add(findUserByIdMenu);
        menu.add(findAllUsersMenu);
        menu.add(exitMenu);

        UserMenuExecutor userMenuExecutor = new UserMenuExecutor(menu);

        userMenuExecutor.start();
    }
}
