package com.javaguru.student_vladimir_petranovski.lesson_10.level_6.service;

import com.javaguru.student_vladimir_petranovski.lesson_10.level_6.bean.Book;

import java.util.List;

public interface BookReader {
    public boolean addBookInLibrary(String name, String nameAuthor);

    public boolean addBookAfterCheckNameAndNameAuthor(String name, String nameAuthor);

    public boolean removeBookFromLibrary(String name, String nameAuthor);

    public String printAllBooksInLibrary(Book book);

    public List<Book> findBookOnAuthor(String nameAuthor);

    public List<Book> findBookOnAuthorFirstWord(Book book, String firstLettersNameAuthor);

    public List<Book> findBookOnName(String name);

    public List<Book> findBookOnNameFirstWord(Book book, String firstWordName);

    public boolean isBookReadsYes(Book book, String name, String nameAuthor);

    public boolean isBookReadsNo(Book book, String name, String nameAuthor);

    public String printIsBookReadsYes(Book book, String name, String nameAuthor);

    public String printIsBookReadsNo(Book book, String name, String nameAuthor);
}
