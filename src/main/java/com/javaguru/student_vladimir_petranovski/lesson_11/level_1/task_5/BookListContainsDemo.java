package com.javaguru.student_vladimir_petranovski.lesson_11.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {
    public static void main(String[] args) {
        BookListContainsDemo bookListContainsDemo = new BookListContainsDemo();
        System.out.println(bookListContainsDemo.isExistBook("Vov", "Had"));
        System.out.println(bookListContainsDemo.isExistBook("Tic", "Tac"));
    }

    private List<Book> createList() {
        Book book = new Book("Tom", "Tim");
        Book book1 = new Book("Vov", "Had");
        Book book2 = new Book("Non", "Tot");
        List<Book> list = new ArrayList<>();
        list.add(book);
        list.add(book1);
        list.add(book2);
        return list;
    }

    private boolean isExistBook(String title, String author) {
        for (Book s : createList()) {
            if (s.getTitle().equals(title) && s.getAuthor().equals(author)) {
                return true;
            }
        }
        return false;
    }
}
