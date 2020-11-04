package com.javaguru.student_vladimir_petranovski.lesson_10.level_6.service;

import com.javaguru.student_vladimir_petranovski.lesson_10.level_6.bean.Book;
import com.javaguru.student_vladimir_petranovski.lesson_10.level_6.bean.ElLibrary;

import java.util.ArrayList;
import java.util.List;

class BookReaderImp implements BookReader {

    private final ElLibrary elLibrary;

    public BookReaderImp(ElLibrary elLibrary) {
        this.elLibrary = elLibrary;
    }

    @Override
    public boolean addBookInLibrary(String name, String nameAuthor) {
        return !isExistBook(name, nameAuthor);
    }

    @Override
    public boolean addBookAfterCheckNameAndNameAuthor(String name, String nameAuthor) {

        return !name.contains(" ") && !nameAuthor.contains(" ");
    }

    @Override
    public boolean removeBookFromLibrary(String name, String nameAuthor) {
        if (isExistBook(name, nameAuthor)) {
            elLibrary.getBooks().remove(new Book(name, nameAuthor));
            return true;
        }
        return false;
    }

    @Override
    public String printAllBooksInLibrary(Book book) {
        String str = " ";
        for (Book bookLibrary : elLibrary.getBooks()) {
            str = "Book " + bookLibrary.getNameBook() + " [Book " + bookLibrary.getNameAuthorBook() + "]";
        }
        return str;
    }

    @Override
    public List<Book> findBookOnAuthor(String nameAuthor) {
        List<Book> books = new ArrayList<>();
        for (Book book : elLibrary.getBooks()) {
            if (book.getNameAuthorBook().toLowerCase().equals(nameAuthor.toLowerCase())) {
                books.add(book);
            }
        }
        return books;
    }

    @Override
    public List<Book> findBookOnAuthorFirstWord(Book book, String firstLettersNameAuthor) {
        List<Book> books = new ArrayList<>();
        String[] str = book.getNameAuthorBook().toLowerCase().split("[\\p{Punct}\\s]+");
        String[] str2 = firstLettersNameAuthor.toLowerCase().split("[\\p{Punct}\\s]+");
        for (int i = 0; i < str2.length; i++) {
            if (str[i].equals(str2[i])) {
                books.add(book);
            }
        }
        return books;
    }

    public boolean isExistBook(String name, String nameAuthor) {
        for (Book book : elLibrary.getBooks()) {
            if (book.getNameBook().contains(name) && book.getNameAuthorBook().contains(nameAuthor)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Book> findBookOnName(String name) {
        List<Book> books = new ArrayList<>();
        for (Book book : elLibrary.getBooks()) {
            if (book.getNameBook().toLowerCase().equals(name.toLowerCase())) {
                books.add(book);
            }
        }
        return books;
    }

    @Override
    public List<Book> findBookOnNameFirstWord(Book book, String firstWordName) {
        List<Book> books = new ArrayList<>();
        String[] str = book.getNameBook().toLowerCase().split("[\\p{Punct}\\s]+");
        String[] str2 = firstWordName.toLowerCase().split("[\\p{Punct}\\s]+");
        for (int i = 0; i < str2.length; i++) {
            if (str[i].equals(str2[i])) {
                books.add(book);
            }
        }
        return books;
    }

    @Override
    public boolean isBookReadsYes(Book book, String name, String nameAuthor) {
        if (isExistBook(name, nameAuthor)) {
            book.setReads(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean isBookReadsNo(Book book, String name, String nameAuthor) {
        if (isExistBook(name, nameAuthor)) {
            book.setReads(false);
            return true;
        }
        return false;
    }

    @Override
    public String printIsBookReadsYes(Book book, String name, String nameAuthor) {
        String str = " ";
        if (isBookReadsYes(book, name, nameAuthor)) {
            List<Book> elLibraryOne = new ArrayList<>();
            elLibraryOne.add(book);
            for (Book book1 : elLibraryOne) {
                str = "Book " + book1.getNameBook() + " [Book " + book1.getNameAuthorBook() + "]";
            }

        }
        return str;
    }

    @Override
    public String printIsBookReadsNo(Book book, String name, String nameAuthor) {
        String str = " ";
        if (isBookReadsNo(book, name, nameAuthor)) {
            List<Book> elLibraryOne = new ArrayList<>();
            elLibraryOne.add(book);
            for (Book book1 : elLibraryOne) {
                str = "Book " + book1.getNameBook() + " [Book " + book1.getNameAuthorBook() + "]";
            }

        }
        return str;
    }

}
