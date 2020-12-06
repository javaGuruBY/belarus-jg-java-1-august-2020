package com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.service;

import com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.domain.User;
import com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.domain.UserConstance;
import com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.exception.UserValidationException;
import org.springframework.stereotype.Component;

@Component
public class UserValidationService {

    void validate(User user) {
//        if (user == null) {
//            throw new UserValidationException("User must be not null");
//        }
//        if (user.getName() == null || user.getName().isBlank()) {
//            throw new UserValidationException("User name must be not blank");
//        }
//        if (user.getName().length() > 10) {
//            throw new UserValidationException("Name must be less than 10 symbols");
//        }
//        if (user.getAge() == null) {
//            throw new UserValidationException("User age must be not null");
//        }
//       if (user.getAge() < 0) {
//            throw new UserValidationException("User age must be more 0");
//        }
//        if (user.getAge() > 120) {
//            throw new UserValidationException("User age must be less 120");
//        }
        checkUserNotNull(user);
        checkUserName(user);
        checkUserAgeNotNull(user);
//        checkUserAgeMinAndMax(user, 0, 120);
        checkUserAgeMinAndMax(user); // не надо залазить в класс, а  срузу установить в домене
    }

    private void checkUserNotNull(User user) {
        if (user == null) {
            throw new UserValidationException("User must be not null");
        }
    }

    private void checkUserName(User user) {
        if (user.getName() == null || user.getName().isBlank()) {
            throw new UserValidationException("User name must be not blank");
        }
        if (user.getName().length() > 10) {
            throw new UserValidationException("Name must be less than 10 symbols");
        }
    }
    private void checkUserAgeNotNull(User user) {
        if (user.getAge() == null) {
            throw new UserValidationException("User age must be not null");
        }
    }
//    private void checkUserAgeMinAndMax(User user, int min, int max) {
//        if (user.getAge() < min) {
//            throw new UserValidationException(String.format("User age must be more %s", min));
//        }
//        if (user.getAge() > max) {
//            throw new UserValidationException(String.format("User age must be less %s", max));
//        }
//    }
    private void checkUserAgeMinAndMax(User user) {
        if (user.getAge() <= UserConstance.MIN_AGE) {
            throw new UserValidationException(String.format("User age must be more %s", UserConstance.MIN_AGE));
        }
        if (user.getAge() > UserConstance.MAX_AGE) {
            throw new UserValidationException(String.format("User age must be less %s", UserConstance.MAX_AGE));
        }
}
}
