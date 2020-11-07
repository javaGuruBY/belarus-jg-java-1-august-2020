package com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service.service_UI;

import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service.BookDatabase;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service.UIAction;

import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction (BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please book's id:");
        Long id = scanner.nextLong();

        if (bookDatabase.delete(id)) {
            System.out.println("Book was deleted.");
        } else {
            System.out.println("Cant find book with such ID.");
        }
    }

    @Override
    public String getAction() {
        return "Delete book on id";
    }
}
