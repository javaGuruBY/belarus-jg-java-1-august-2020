package com.javaguru.teacher.lesson_13.lessoncode.userapplication.repository;


import com.javaguru.teacher.lesson_13.lessoncode.userapplication.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    User save(User user);

    Optional<User> findById(String id);

    List<User> findAll();

}
