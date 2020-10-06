/*
Task_14
Найти ошибку в коде.
Исправить и запустить программу.
Менять можно только класс Book.

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

package com.javaguru.student_sergey_kazyanin.lesson_3.level_4;

class Book {

    private String title;               // отсутсвовал символ ';'

    public Book(String bookTitle) {     //в конструкторе нужно указать идентификатор доступа
        this.title = bookTitle;         // отсутсвовал символ  ';' и неверное имя переменной
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
