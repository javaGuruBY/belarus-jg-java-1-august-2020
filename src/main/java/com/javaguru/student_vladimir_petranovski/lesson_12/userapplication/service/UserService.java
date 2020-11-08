package com.javaguru.student_vladimir_petranovski.lesson_12.userapplication.service;

import com.javaguru.student_vladimir_petranovski.lesson_12.userapplication.domain.User;
import com.javaguru.student_vladimir_petranovski.lesson_12.userapplication.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserService {

    private final UserRepository userRepository;

    public UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        // validation
        return userRepository.save(user);
    }

    public User findById(String id) {
        Optional<User> optionalUser = userRepository.findById(id);
//        if (optionalUser.isPresent()) {
//            return optionalUser.get();
//        }
//        return null;
        return optionalUser.orElse(new User());
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
