package com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.UI;

import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.bean.Book;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction (BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please book's id for search:");
        Long id = scanner.nextLong();

        Optional<Book> bookOpt = bookDatabase.findById(id);
        if (bookOpt.isPresent()) {
            System.out.println("You looked for: " + bookOpt.get());
        } else {
            System.out.println("There is no books with such ID.");
        }
    }

    @Override
    public String getAction() {
        return "Find book on Id";
    }
}
