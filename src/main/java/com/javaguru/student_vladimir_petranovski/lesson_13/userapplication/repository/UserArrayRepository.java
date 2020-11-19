package com.javaguru.student_vladimir_petranovski.lesson_13.userapplication.repository;

import com.javaguru.student_vladimir_petranovski.lesson_13.userapplication.domain.User;

import java.util.*;

public class UserArrayRepository implements UserRepository {

    private User[] database = new User[1];

    @Override
    public User save(User user) {
        user.setId(UUID.randomUUID().toString());
        int index = findEmptyPlaceIndex();
        database[index] = user;
        return user;
    }

    @Override
    public Optional<User> findById(String id) {
        for (User user : database) {
            if (user != null && user.getId().equals(id)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(Arrays.asList(database));
    }

    private int findEmptyPlaceIndex() {
        for (int i = 0; i < database.length; i++) {
            if (database[i] == null) {
                return i;
            }
        }
        int lastIndex = database.length - 1;
        return lastIndex + 1;
    }
}
