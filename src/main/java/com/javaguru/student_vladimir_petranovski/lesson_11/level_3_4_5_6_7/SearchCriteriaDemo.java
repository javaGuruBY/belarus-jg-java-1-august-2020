package com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7;

import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.bean.Book;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service.BookDatabaseImpl;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service_search.*;

import java.util.ArrayList;
import java.util.List;

public class SearchCriteriaDemo {
    public static void main(String[] args) {
        Book book = new Book("Zveroboi", "Kuper", "1890");

        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria yearOfIssue = new YearOfIssueSearchCriteria("1890");

        SearchCriteria searchCriteria1 = new AndSearchCriteria(titleSearchCriteria, authorSearchCriteria);
        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearOfIssue);
        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria, yearOfIssue);
        SearchCriteria searchCriteria4 = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        System.out.println(searchCriteria1.match(book));
        System.out.println(searchCriteria2.match(book));
        System.out.println(searchCriteria3.match(book));
        System.out.println(searchCriteria4.match(book));

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book);
        System.out.println(bookDatabase.find(searchCriteria1));

        // super_task_1_paging
        for (int i = 0; i < 30; i++) {
            String title = "Pushkin";
            String author = Integer.toString(i);
            String yearIssue = String.valueOf(1980 + i);
            Book book1 = new Book(title, author, yearIssue);
            bookDatabase.save(book1);
        }
        SearchCriteria searchTitle = new TitleSearchCriteria("Pushkin");
        System.out.println(bookDatabase.find(searchTitle, 1, 10));
    }
}
