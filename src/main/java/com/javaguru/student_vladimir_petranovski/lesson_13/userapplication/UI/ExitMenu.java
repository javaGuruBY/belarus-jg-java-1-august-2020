package com.javaguru.student_vladimir_petranovski.lesson_13.userapplication.UI;

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
