package com.javaguru.student_vadim_migun.training;

public class BookDemo {
    public static void main(String[] args) {

        Book myBook = new Book();
        myBook.pageCount = 100;
        myBook.title = "First book";
        myBook.opened = false;

        System.out.println("Title: " + myBook.title);
        System.out.println("Page count: " + myBook.pageCount);
        System.out.println("Opened: " + myBook.opened);

        myBook.open();

        boolean bookOpened = myBook.isOpened();

        System.out.println("Opened " + myBook.isOpened());




    }

}
