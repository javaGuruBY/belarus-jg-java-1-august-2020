package com.javaguru.student_sergey_kazyanin.lesson_3.lessoncode;

class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.pageCount = 100;
        myBook.title = "First Book";
        myBook.opened = false;

        System.out.println("Title: " + myBook.title);
        System.out.println("Page count: " + myBook.pageCount);
        System.out.println("Opened: " + myBook.opened);

        myBook.open();

        boolean bookOpened = myBook.isOpened();

        System.out.println("Opened: " + bookOpened);

        myBook.close();
        bookOpened = myBook.isOpened();
        System.out.println("Opened: " + bookOpened);
    }
}
