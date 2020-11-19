package com.javaguru.student_vladimir_petranovski.lesson_13.userapplication.repository;

import com.javaguru.student_vladimir_petranovski.lesson_13.userapplication.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class DefaultUserRepository implements UserRepository {

    private List<User> databaseList = new ArrayList<>();

    @Override
    public User save(User user) {
        user.setId(UUID.randomUUID().toString());
        databaseList.add(user);
        return user;
    }

    @Override
    public Optional<User> findById(String id) {
//        for (User user : databaseList) {
//            if (user.getId().equals(id)) {
//                return Optional.of(user);
//            }
//        }
//
//        return Optional.empty();
        return databaseList.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(databaseList);
    }
}
