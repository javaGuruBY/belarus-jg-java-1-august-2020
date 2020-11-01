package com.javaguru.student_vladimir_petranovski.lesson_10.level_6.bean;

import java.util.ArrayList;
import java.util.List;

public class ElLibrary {
    private final List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void fillLibrary(Book book) {
        books.add(book);
    }

}
