package com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.service;

import com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.domain.User;
import com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.exception.UserNotFoundException;
import com.javaguru.student_vladimir_petranovski.lesson_15.userapplication.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class UserService {

    private final UserRepository userRepository;
    private final UserValidationService userValidationService;

    public UserService (UserRepository userRepository, UserValidationService userValidationService) {
        this.userRepository = userRepository;
        this.userValidationService = userValidationService;
    }

    public User saveUser(User user) {
//        if (user == null) {
//            throw new UserValidationException("User must be not null");   //переносим все эти условия в класс UserValidationService
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
//        if (user.getAge() < 0) {
//            throw new UserValidationException("User age must be more 0");
//        }
//        if (user.getAge() > 120) {
//            throw new UserValidationException("User age must be less 120");
//        }
        userValidationService.validate(user);
        return userRepository.save(user);
    }

    public User findById(String id) {
        Optional<User> optionalUser = userRepository.findById(id);
//        if (optionalUser.isPresent()) {
//            return optionalUser.get();
//        }
//        return null;
//        return optionalUser.orElse(new User());
//        if (optionalUser.isPresent()) {
//            return optionalUser.get();
//        } else {
//           throw new UserNotFoundException("User with id " + id + " not found!");
//            throw new UserNotFoundException(String.format("User with id %s not found!", id));
//        }
        return optionalUser.orElseThrow(() ->
                new UserNotFoundException(String.format("User with id %s not found!", id)));
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
