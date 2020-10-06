package com.javaguru.student_vadim_migun.training;

public class BookDemo {
    public static void main(String[] args) {

        Book myBook = new Book();
        myBook.title = "First book";
        myBook.pageCount = 100;
        myBook.opened = false;

        System.out.println("Title: " + myBook.title);
        System.out.println("Page count: " + myBook.pageCount);
        System.out.println("Opened: " + myBook.opened);

        myBook.open();

        System.out.println(myBook);

        boolean bookOpened = myBook.isOpened();

        System.out.println("Opened " + myBook.isOpened());



    }

}
