package com.javaguru.teacher.lesson_10.lessoncode.userapplication;

class UserApplication {

    public static void main(String[] args) {
        UserRepository repository = new UserArrayRepository();

        UserService userService = new UserService(repository);
        CreateUserMenu createUserMenu = new CreateUserMenu(userService);
        FindUserByIdMenu findUserByIdMenu = new FindUserByIdMenu(userService);

        UserMenu[] menus = new UserMenu[2];
        menus[0] = createUserMenu;
        menus[1] = findUserByIdMenu;

        UserMenuExecutor executor = new UserMenuExecutor(menus);

        executor.start();
    }
}
