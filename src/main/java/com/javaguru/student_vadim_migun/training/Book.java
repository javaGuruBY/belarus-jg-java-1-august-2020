package com.javaguru.student_vadim_migun.training;

public class Book {

    String title;
    int pageCount;
    boolean opened;


    void open() {
        opened = true;
    }

    void close() {
        opened = false;
    }

    boolean isOpened() {
        return opened;
    }

}
