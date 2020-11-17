package com.javaguru.teacher.lesson_13.lessoncode.userapplication.ui;

public class ExitMenu implements UserMenu {
    @Override
    public void execute() {
        System.out.println("Bye-bye!");
        System.exit(0);
    }

    @Override
    public String getMenuName() {
        return "Exit.";
    }
}
