package com.javaguru.student_vladimir_petranovski.lesson_10.userapplication;

class UserApplication {

    public static void main(String[] args) {
        UserRepository userRepository = new UserArrayRepository();
        UserService userService = new UserService(userRepository);
        CreateUserMenu createUserMenu = new CreateUserMenu(userService);
        FindUserByIdMenu findUserByIdMenu = new FindUserByIdMenu(userService);

        UserMenu[] userMenus = new UserMenu[2];
        userMenus[0] = createUserMenu;
        userMenus[1] = findUserByIdMenu;
        UserMenuExecutor userMenuExecutor = new UserMenuExecutor(userMenus);

        userMenuExecutor.start();
    }
}
