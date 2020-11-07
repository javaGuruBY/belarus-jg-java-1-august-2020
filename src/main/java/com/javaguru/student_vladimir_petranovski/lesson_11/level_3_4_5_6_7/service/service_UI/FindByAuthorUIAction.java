package com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service.service_UI;

import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.bean.Book;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service.BookDatabase;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service.UIAction;

import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please book's author for search:");
        String nameAuthor = scanner.nextLine();

        List<Book> bookOpt = bookDatabase.findByAuthor(nameAuthor);

        if (!bookOpt.isEmpty()) {
            System.out.println("You looked for: " + bookOpt);
        } else {
            System.out.println("There is no books with such author.");
        }
    }

    @Override
    public String getAction() {
        return "Find book on author";
    }
}
