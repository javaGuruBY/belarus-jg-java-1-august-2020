package com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service_search;

import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.bean.Book;

public class AuthorSearchCriteria implements SearchCriteria{
    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        return book.getAuthor().equalsIgnoreCase(authorToSearch);
    }
}
