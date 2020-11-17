package com.javaguru.teacher.lesson_13.lessoncode.userapplication;

import com.javaguru.teacher.lesson_13.lessoncode.userapplication.repository.UserRepository;
import com.javaguru.teacher.lesson_13.lessoncode.userapplication.service.UserService;
import com.javaguru.teacher.lesson_13.lessoncode.userapplication.service.UserValidationService;
import com.javaguru.teacher.lesson_13.lessoncode.userapplication.ui.*;

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
        UserValidationService validationService = new UserValidationService();

        ExitMenu exitMenu = new ExitMenu();
        UserService userService = new UserService(repository, validationService);
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
