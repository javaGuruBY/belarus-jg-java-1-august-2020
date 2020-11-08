package com.javaguru.student_vladimir_petranovski.lesson_10.userapplication;

class UserService {

    private final UserRepository userRepository;

    public UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    void saveUser(User user) {
        // validation
        userRepository.save(user);
    }

    User findById(String id) {
        return userRepository.findById(id);
    }
}
