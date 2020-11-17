package com.javaguru.teacher.lesson_13.lessoncode.userapplication.service;

import com.javaguru.teacher.lesson_13.lessoncode.userapplication.domain.User;
import com.javaguru.teacher.lesson_13.lessoncode.userapplication.domain.UserConstants;
import com.javaguru.teacher.lesson_13.lessoncode.userapplication.exception.UserValidationException;

public class UserValidationService {

    void validate(User user) {
        checkUserNotNull(user);
        checkUserNameIsNotBlank(user);
        checkUserNameLength(user);
        checkUserAgeNotNull(user);
        checkUserAgeRange(user);
    }

    private void checkUserNotNull(User user) {
        if (user == null) {
            throw new UserValidationException("User must be not null");
        }
    }

    private void checkUserNameIsNotBlank(User user) {
        if (user.getName() == null || user.getName().isBlank()) {
            throw new UserValidationException("User name must be not blank");
        }
    }

    private void checkUserNameLength(User user) {
        if (user.getName().length() > 10) {
            throw new UserValidationException("User name length must be less than 10");
        }
    }

    private void checkUserAgeNotNull(User user) {
        if (user.getAge() == null) {
            throw new UserValidationException("User age must be not null");
        }
    }

    private void checkUserAgeRange(User user) {
        if (user.getAge() < UserConstants.MIN_AGE) {
            throw new UserValidationException(String.format("User age must be greater than %s", UserConstants.MIN_AGE));
        }
        if (user.getAge() > UserConstants.MAX_AGE) {
            throw new UserValidationException(String.format("User age must be less than %s", UserConstants.MAX_AGE));
        }
    }

}
