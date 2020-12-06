package com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.UI;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(3)
@Component
public class ExitMenu implements UserMenu {
    @Override
    public void execute() {
        System.out.println("Bye - bye!");
        System.exit(0);
    }

    @Override
    public String getMenuName() {
        return "Exit.";
    }
}
