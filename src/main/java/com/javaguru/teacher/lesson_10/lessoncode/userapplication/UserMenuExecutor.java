package com.javaguru.teacher.lesson_10.lessoncode.userapplication;

import java.util.Scanner;

class UserMenuExecutor {

    private final UserMenu[] menus;

    UserMenuExecutor(UserMenu[] menus) {
        this.menus = menus;
    }

    void start() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < menus.length; i++) {
            System.out.println(i + ". " + menus[i].getMenuName());
        }
        System.out.println("Please enter number: ");
        int number = scanner.nextInt();
        menus[number].execute();
    }
}
