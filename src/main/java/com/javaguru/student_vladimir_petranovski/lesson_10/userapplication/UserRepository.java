package com.javaguru.student_vladimir_petranovski.lesson_10.userapplication;

interface UserRepository {

    User save(User user);

    User findById(String id);
}
