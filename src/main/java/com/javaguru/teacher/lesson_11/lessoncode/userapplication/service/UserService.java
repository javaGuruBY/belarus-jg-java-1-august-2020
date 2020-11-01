package com.javaguru.teacher.lesson_11.lessoncode.userapplication.service;

import com.javaguru.teacher.lesson_11.lessoncode.userapplication.domain.User;
import com.javaguru.teacher.lesson_11.lessoncode.userapplication.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User saveUser(User user) {
        //TODO validation
        return repository.save(user);
    }

    public User findById(String id) {
        Optional<User> optionalUser = repository.findById(id);
        return optionalUser.orElse(new User());
    }

    public List<User> findAllUsers() {
        return repository.findAll();
    }
}
