package com.javaguru.student_Pavel_Buben.lesson_3.level_1.level_4;

class Book {

    private String title; //отсутствовал символ ";"

    Book(String bookTitle) {
        this.title = bookTitle; //отсутствовал символ ";" и неверное имя переменной
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