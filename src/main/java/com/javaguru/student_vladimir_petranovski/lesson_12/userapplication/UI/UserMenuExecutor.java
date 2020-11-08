package com.javaguru.student_vladimir_petranovski.lesson_12.userapplication.UI;

import java.util.List;
import java.util.Scanner;

public class UserMenuExecutor {

    private final List<UserMenu> userMenu;

    public UserMenuExecutor(List<UserMenu> userMenu) {
        this.userMenu = userMenu;
    }

    public void start() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < userMenu.size(); i++) {
                System.out.println(i + ". " + userMenu.get(i).getMenuName());
            }
            System.out.println("Please enter number:");
            int number = scanner.nextInt();
            if (number >= userMenu.size() || number < 0) {
                System.out.println("Menu incorrect, please enter number again!");
            } else {
                userMenu.get(number).execute();
            }
        }
    }
}
