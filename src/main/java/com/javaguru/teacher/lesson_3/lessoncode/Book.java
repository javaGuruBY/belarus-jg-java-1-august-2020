package com.javaguru.teacher.lesson_3.lessoncode;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Book {

    String title; // default value - null
    int pageCount; // default value - 0
    boolean opened; // default value - false

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
