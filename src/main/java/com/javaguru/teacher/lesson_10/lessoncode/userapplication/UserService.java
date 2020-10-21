package com.javaguru.teacher.lesson_10.lessoncode.userapplication;

class UserService {

    private final UserRepository repository;

    UserService(UserRepository repository) {
        this.repository = repository;
    }

    void saveUser(User user) {
        //validation
        repository.save(user);
    }

    User findById(String id) {
        return repository.findById(id);
    }
}
