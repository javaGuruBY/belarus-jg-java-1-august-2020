package com.javaguru.teacher.lesson_5.lessoncode.arrays;

import java.util.Arrays;

class BookArrayExample {

    public static void main(String[] args) {
        Book[] bookArray = new Book[3];

        System.out.println(bookArray.toString());

        System.out.println(Arrays.toString(bookArray));

        Book firstBook = new Book();
        firstBook.setAuthor("Ruslan");
        firstBook.setTitle("...");

        bookArray[0] = firstBook;
        bookArray[1] = new Book("TEST TITLE - 1","TEST AUTHOR - 1");
        bookArray[2] = new Book("TEST TITLE - 2","TEST AUTHOR - 2");

        System.out.println();
        System.out.println(Arrays.toString(bookArray));
        System.out.println();

        System.out.println("Without overriding toString()");
        System.out.println();

        for (Book book : bookArray) {
            System.out.println("Book title = " + book.getTitle());
            System.out.println("Book author = " + book.getAuthor());
            System.out.println();
        }

        for (int i = 0; i < bookArray.length; i++) {
            System.out.println("Book title = " + bookArray[i].getTitle());
            System.out.println("Book author = " + bookArray[i].getAuthor());
            System.out.println();
        }
    }
}
