package com.javaguru.student_vladimir_petranovski.lesson_3.level_4;
/*
class Book {
    private String title
    Book(String bookTitle) {
        this.title = newTitle
    }
    public String getTitle() {
        return this.title;
    }
}
class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
 */

public class TaskFourteenBook {
    private String title;
    public TaskFourteenBook(String bookTitle) {
        this.title = bookTitle;
    }
    public String getTitle() {
        return this.title;
    }
}
class BookDemo {
    public static void main(String[] args) {
        TaskFourteenBook myBook = new TaskFourteenBook("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}


