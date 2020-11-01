package com.javaguru.teacher.lesson_11.lessoncode.userapplication.repository;

import com.javaguru.teacher.lesson_11.lessoncode.userapplication.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class DefaultUserRepository implements UserRepository {

    private List<User> database = new ArrayList<>();

    @Override
    public User save(User user) {
        user.setId(UUID.randomUUID().toString());
        database.add(user);
        return user;
    }

    @Override
    public Optional<User> findById(String id) {
        for (User user : database) {
            if (user.getId().equals(id)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(database);
    }
}
