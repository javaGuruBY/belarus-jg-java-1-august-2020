package com.javaguru.student_sergey_kazyanin.lesson_3.lessoncode;

class Book {

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
