package com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.UI;

import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.bean.Book;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class FindByTitleUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByTitleUIAction (BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please book's title for search:");
        String nameTitle = scanner.nextLine();

        List<Book> bookOpt = bookDatabase.findByTitle(nameTitle);
        if (!bookOpt.isEmpty()) {
            System.out.println("You looked for: " + bookOpt);
        } else {
            System.out.println("There is no books with such title.");
        }
    }

    @Override
    public String getAction() {
        return "Find book on title";
    }
}
