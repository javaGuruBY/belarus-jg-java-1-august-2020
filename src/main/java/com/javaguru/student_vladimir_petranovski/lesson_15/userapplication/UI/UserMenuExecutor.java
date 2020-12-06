package com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.UI;

import com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.exception.UserNotFoundException;
import com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.exception.UserValidationException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;
@Component
public class UserMenuExecutor {

    private final List<UserMenu> userMenu;

    public UserMenuExecutor(List<UserMenu> userMenu) {
        this.userMenu = userMenu;
    }

    public void start() {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                for (int i = 0; i < userMenu.size(); i++) {
                    System.out.println(i + ". " + userMenu.get(i).getMenuName());
                }
                System.out.println("Please enter number:");
                int number = scanner.nextInt();
                if (number >= userMenu.size() || number < 0) {
                    throw new IllegalAccessException("Menu incorrect, please enter number again!");
                }

                userMenu.get(number).execute();

            } catch (UserValidationException | UserNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
