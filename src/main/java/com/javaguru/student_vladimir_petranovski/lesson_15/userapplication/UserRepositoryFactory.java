package com.javaguru.student_vladimir_petranovski.lesson_15.userapplication;

import com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.repository.DefaultUserRepository;
import com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.repository.UserArrayRepository;
import com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.repository.UserHashMapRepository;
import com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.repository.UserRepository;

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
        if (type.equals("hashmap")) {
            return new UserHashMapRepository();
        }
        return new DefaultUserRepository();
    }
}
