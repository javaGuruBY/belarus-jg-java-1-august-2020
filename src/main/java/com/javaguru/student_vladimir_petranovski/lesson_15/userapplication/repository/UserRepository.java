package com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.repository;

import com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    User save(User user);

    Optional<User> findById(String id);

    List<User> findAll();
}
