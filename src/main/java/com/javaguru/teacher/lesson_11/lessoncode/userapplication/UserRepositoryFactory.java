package com.javaguru.teacher.lesson_11.lessoncode.userapplication;

import com.javaguru.teacher.lesson_11.lessoncode.userapplication.repository.DefaultUserRepository;
import com.javaguru.teacher.lesson_11.lessoncode.userapplication.repository.UserArrayRepository;
import com.javaguru.teacher.lesson_11.lessoncode.userapplication.repository.UserRepository;

class UserRepositoryFactory {

    UserRepository createByType(String type) {
        if (type == null || type.isBlank()) {
            return new DefaultUserRepository();
        }
        if (type.equals("array")) {
            return new UserArrayRepository();
        }
        if (type.equals("array-list")) {
            return new DefaultUserRepository();
        }
        return new DefaultUserRepository();
    }
}
