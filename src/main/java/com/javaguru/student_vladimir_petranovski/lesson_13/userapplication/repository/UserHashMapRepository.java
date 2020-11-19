package com.javaguru.student_vladimir_petranovski.lesson_13.userapplication.repository;

import com.javaguru.student_vladimir_petranovski.lesson_13.userapplication.domain.User;

import java.util.*;

public class UserHashMapRepository implements UserRepository {

    private final Map<String, User> databaseHashMap = new HashMap<>();

    @Override
    public User save(User user) {
        String id = UUID.randomUUID().toString();
        user.setId(id);
        databaseHashMap.put(id, user);
        return user;
    }

    @Override
    public Optional<User> findById(String id) {
        return Optional.ofNullable(databaseHashMap.get(id));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(databaseHashMap.values());
    }
}
