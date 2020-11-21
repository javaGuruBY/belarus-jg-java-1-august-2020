package com.javaguru.student_vladimir_petranovski.lesson_13.userapplication.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String message) {
        super(message);
    }
}
