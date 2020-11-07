package com.javaguru.teacher.lesson_12.userapplication;

import com.javaguru.teacher.lesson_12.userapplication.repository.UserRepository;
import com.javaguru.teacher.lesson_12.userapplication.service.UserService;
import com.javaguru.teacher.lesson_12.userapplication.ui.CreateUserMenu;
import com.javaguru.teacher.lesson_12.userapplication.ui.ExitMenu;
import com.javaguru.teacher.lesson_12.userapplication.ui.FindAllUsersMenu;
import com.javaguru.teacher.lesson_12.userapplication.ui.FindUserByIdMenu;
import com.javaguru.teacher.lesson_12.userapplication.ui.UserMenu;
import com.javaguru.teacher.lesson_12.userapplication.ui.UserMenuExecutor;

import java.util.ArrayList;
import java.util.List;

class UserApplication {

    public static void main(String[] args) {
        String type = null;
        if (args.length > 0 ) {
            type = args[0];
        }

        UserRepositoryFactory repositoryFactory = new UserRepositoryFactory();
        UserRepository repository = repositoryFactory.createByType(type);

        ExitMenu exitMenu = new ExitMenu();
        UserService userService = new UserService(repository);
        CreateUserMenu createUserMenu = new CreateUserMenu(userService);
        FindUserByIdMenu findUserByIdMenu = new FindUserByIdMenu(userService);
        FindAllUsersMenu findAllUsersMenu = new FindAllUsersMenu(userService);

        List<UserMenu> menus = new ArrayList<>();
        menus.add(createUserMenu);
        menus.add(findUserByIdMenu);
        menus.add(findAllUsersMenu);
        menus.add(exitMenu);

        UserMenuExecutor executor = new UserMenuExecutor(menus);

        executor.start();
    }
}
