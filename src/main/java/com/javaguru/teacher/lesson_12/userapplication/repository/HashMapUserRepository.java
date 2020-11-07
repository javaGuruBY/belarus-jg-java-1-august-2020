package com.javaguru.teacher.lesson_12.userapplication.repository;

import com.javaguru.teacher.lesson_12.userapplication.domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class HashMapUserRepository implements UserRepository {

    private Map<String, User> database = new HashMap<>();

    @Override
    public User save(User user) {
        String id = UUID.randomUUID().toString();
        user.setId(id);
        database.put(id, user);
        return user;
    }

    @Override
    public Optional<User> findById(String id) {
        return Optional.ofNullable(database.get(id));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(database.values());
    }
}
