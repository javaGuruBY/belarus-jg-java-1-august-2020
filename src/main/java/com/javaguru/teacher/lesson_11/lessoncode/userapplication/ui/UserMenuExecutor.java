package com.javaguru.teacher.lesson_11.lessoncode.userapplication.ui;

import java.util.List;
import java.util.Scanner;

public class UserMenuExecutor {

    private final List<UserMenu> menus;

    public UserMenuExecutor(List<UserMenu> menus) {
        this.menus = menus;
    }

    public void start() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < menus.size(); i++) {
                System.out.println(i + ". " + menus.get(i).getMenuName());
            }
            System.out.println("Please enter number: ");
            int number = scanner.nextInt();
            if (number >= menus.size() || number < 0) {
                System.out.println("Incorrect menu.");
            } else {
                menus.get(number).execute();
            }
        }
    }
}
