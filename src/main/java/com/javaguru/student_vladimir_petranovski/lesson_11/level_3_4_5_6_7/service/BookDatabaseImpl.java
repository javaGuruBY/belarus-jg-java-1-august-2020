package com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service;

import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.service_search.SearchCriteria;
import com.javaguru.student_vladimir_petranovski.lesson_11.level_3_4_5_6_7.bean.Book;

import java.util.*;

public class BookDatabaseImpl implements BookDatabase{
    private Long ID = 0L;

    private final List<Book> database = new ArrayList<>();

    @Override
    public Long save(Book book) {
        book.setId(++ID);
        database.add(book);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        if (isExistBook(bookId)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        return findBook(book) && database.remove(book);
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book books : database) {
            if (books.getId().equals(bookId)) {
                return Optional.of(books);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> authorList = new ArrayList<>();
        for (Book books : database) {
            if (books.getAuthor().equalsIgnoreCase(author)) {
                authorList.add(books);
            }
        }
        return authorList;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> titleList = new ArrayList<>();
        for (Book books : database) {
            if (books.getTitle().equalsIgnoreCase(title)) {
                titleList.add(books);
            }
        }
        return titleList;
    }

    @Override
    public int countAllBooks() {
        int count = 0;
        for (Book books : database) {
            count++;
        }
        return count; // database.size()
    }

    @Override
    public void deleteByAuthor(String author) {
        List<Book> authorList = new ArrayList<>();
        for (Book books : database) {
            if (books.getAuthor().equalsIgnoreCase(author)) {
                authorList.add(books);
            }
        }
        database.removeAll(authorList);
    }

    @Override
    public void deleteByTitle(String title) {
        List<Book> titleList = new ArrayList<>();
        for (Book books : database) {
            if (books.getTitle().equalsIgnoreCase(title)) {
                titleList.add(books);
            }
        }
        database.removeAll(titleList);
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> books = new ArrayList<>();
        for (Book book : database) {
            if (searchCriteria.match(book)) {
                books.add(book);
            }
        }

        return books;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> books = new HashSet<>();
        for (Book book : database) {
            books.add(book.getAuthor());
        }

        return books;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> books = new HashSet<>();
        for (Book book : database) {
            books.add(book.getTitle());
        }

        return books;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> books = new HashSet<>();
        books.addAll(database);
        return books;
    }

    @Override
    public boolean contains(Book book) {
        return database.contains(book);
    }

    @Override
    public Set<String> find(String text) {
        String[] splitText = text.split(" ");
        return new HashSet<>(Arrays.asList(splitText));
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> map = new HashMap<>();
        for (String s : findUniqueAuthors()) {
            map.put(s, findByAuthor(s));
        }
        return map;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> map = new HashMap<>();
        for (String s : findUniqueAuthors()) {
            map.put(s, findByAuthor(s).size());
        }
        return map;
    }

    public boolean findBook(Book book) {
        for (Book books : database) {
            if (book.equals(books)) {
                return true;
            }
        }
        return false;
    }

    public boolean isExistBook(Long bookId) {
        for (Book books : database) {
            if (books.getId().equals(bookId)) {
                return true;
            }
        }
        return false;
    }

    public List<Book> find(SearchCriteria searchCriteria, int from, int to) {
        List<Book> books = find(searchCriteria);
        List<Book> pagingList = new ArrayList<>();
        if (to >= books.size()) {
            to = books.size() - 1;
        }
        for (int i = from; i <= to; i++) {
            if (searchCriteria.match(books.get(i))) {
                pagingList.add(books.get(i));
            }
        }

        return pagingList;
    }
}
