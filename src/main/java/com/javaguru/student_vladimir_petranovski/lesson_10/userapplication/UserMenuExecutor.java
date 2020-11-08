package com.javaguru.student_vladimir_petranovski.lesson_10.userapplication;

import java.util.Scanner;

class UserMenuExecutor {

    private final UserMenu[] userMenu;

    public UserMenuExecutor(UserMenu[] userMenu) {
        this.userMenu = userMenu;
    }

    void start() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < userMenu.length; i++) {
                System.out.println(i + ". " + userMenu[i].getMenuName());
            }
            System.out.println("Please enter number:");
            int number = scanner.nextInt();
            userMenu[number].execute();
        }
    }
}
