package com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service;

import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service_search.SearchCriteria;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.bean.Book;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface BookDatabase {
    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    List<Book> find(SearchCriteria searchCriteria);

    Set<String> findUniqueAuthors();

    Set<String> findUniqueTitles();

    Set<Book> findUniqueBooks();

    boolean contains(Book book);

    Set<String> find(String text);

    Map<String, List<Book>> getAuthorToBooksMap();

    Map<String, Integer> getEachAuthorBookCount();
}
