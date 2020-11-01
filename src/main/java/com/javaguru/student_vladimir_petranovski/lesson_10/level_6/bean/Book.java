package com.javaguru.student_vladimir_petranovski.lesson_10.level_6.bean;

import java.util.Objects;

public class Book {
    private String nameBook;
    private String nameAuthorBook;
    private boolean isReads;

    public Book(String nameBook, String nameAuthorBook) {
        this.nameBook = nameBook;
        this.nameAuthorBook = nameAuthorBook;
        this.isReads = false;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameAuthorBook() {
        return nameAuthorBook;
    }

    public void setNameAuthorBook(String nameAuthorBook) {
        this.nameAuthorBook = nameAuthorBook;
    }

    public boolean isReads() {
        return isReads;
    }

    public void setReads(boolean reads) {
        isReads = reads;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isReads == book.isReads &&
                Objects.equals(nameBook, book.nameBook) &&
                Objects.equals(nameAuthorBook, book.nameAuthorBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, nameAuthorBook, isReads);
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", nameAuthorBook='" + nameAuthorBook + '\'' +
                ", isReads=" + isReads +
                '}';
    }
}
