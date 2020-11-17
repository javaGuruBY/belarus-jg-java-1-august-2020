package com.javaguru.teacher.lesson_13.lessoncode.userapplication.ui;

import com.javaguru.teacher.lesson_13.lessoncode.userapplication.exception.UserNotFoundException;
import com.javaguru.teacher.lesson_13.lessoncode.userapplication.exception.UserValidationException;

import java.util.List;
import java.util.Scanner;

public class UserMenuExecutor {

    private final List<UserMenu> menus;

    public UserMenuExecutor(List<UserMenu> menus) {
        this.menus = menus;
    }

    public void start() {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                for (int i = 0; i < menus.size(); i++) {
                    System.out.println(i + ". " + menus.get(i).getMenuName());
                }
                System.out.println("Please enter number: ");
                int number = scanner.nextInt();

                if (number >= menus.size() || number < 0) {
                    throw new IllegalArgumentException("Incorrect menu.");
                }

                menus.get(number).execute();
            } catch (UserValidationException | UserNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
