package com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.UI;

import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.bean.Book;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service.BookDatabase;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction (BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println("Enter please book's name:");
        Scanner scanner = new Scanner(System.in);
        String nameSearch = scanner.nextLine();
        System.out.println("Enter please book's author:");
        String nameAuthorSearch = scanner.nextLine();
        System.out.println("Enter please book's year issue:");
        String yearIssue = scanner.nextLine();

        Book book = new Book(nameSearch, nameAuthorSearch, yearIssue);
        bookDatabase.save(book);
    }

    @Override
    public String getAction() {
        return "Save book";
    }
}
