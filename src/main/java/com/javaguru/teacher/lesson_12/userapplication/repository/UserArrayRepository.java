package com.javaguru.teacher.lesson_12.userapplication.repository;


import com.javaguru.teacher.lesson_12.userapplication.domain.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
        increaseDatabaseSpace();
        return lastIndex + 1;
    }

    private void increaseDatabaseSpace() {
        User[] tempDB = database;
        database = new User[database.length * 2];
        for (int i = 0; i < tempDB.length; i++) {
            database[i] = tempDB[i];
        }
    }
}
