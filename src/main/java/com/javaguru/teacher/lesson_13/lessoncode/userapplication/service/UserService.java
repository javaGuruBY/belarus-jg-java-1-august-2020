package com.javaguru.teacher.lesson_13.lessoncode.userapplication.service;

import com.javaguru.teacher.lesson_13.lessoncode.userapplication.domain.User;
import com.javaguru.teacher.lesson_13.lessoncode.userapplication.exception.UserNotFoundException;
import com.javaguru.teacher.lesson_13.lessoncode.userapplication.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserService {

    private final UserRepository repository;
    private final UserValidationService validationService;

    public UserService(UserRepository repository, UserValidationService validationService) {
        this.repository = repository;
        this.validationService = validationService;
    }

    public User saveUser(User user) {
        validationService.validate(user);
        return repository.save(user);
    }

    public User findById(String id) {
        Optional<User> optionalUser = repository.findById(id);
//        if (optionalUser.isPresent()) {
//            return optionalUser.get();
//        } else {
////            throw new UserNotFoundException("User with id " + id + " is not found");
//            throw new UserNotFoundException(String.format("User with id %s is not found", id));
//        }

        return optionalUser.orElseThrow(() -> new UserNotFoundException(String.format("User with id %s is not found", id)));
    }

    public List<User> findAllUsers() {
        return repository.findAll();
    }
}
